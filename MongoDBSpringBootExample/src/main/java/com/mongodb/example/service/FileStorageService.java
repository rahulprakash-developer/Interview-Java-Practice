package com.mongodb.example.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileStorageService {
    @Autowired
    private GridFsTemplate gridFsTemplate;

    public String uploadFile(MultipartFile file) throws IOException {
        ObjectId fileId = gridFsTemplate.store(file.getInputStream(), file.getOriginalFilename(), file.getContentType());
        return fileId.toString();
    }

    public Resource downloadFile(String fileId) throws IOException {
        GridFSFile gridFSFile = gridFsTemplate.findOne(new Query(Criteria.where("_id").is(fileId)));
        if (gridFSFile == null) {
            throw new FileNotFoundException("File not found");
        }
        return new InputStreamResource(gridFsTemplate.getResource(gridFSFile).getInputStream());
    }

}
