package com.mongodb.example.service;

import com.mongodb.example.dto.UserDTO;
import com.mongodb.example.model.User;
import com.mongodb.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getAge()))
                .toList();
    }

    public Page<User> getUsersByAge(int age, int page, int size, String sortBy) {
        return userRepository.findByAgeGreaterThan(age, PageRequest.of(page, size, Sort.by(sortBy)));
    }

    public Optional<UserDTO> getUserById(String id) {
        return userRepository.findById(id)
                .map(user -> new UserDTO(user.getId(), user.getName(), user.getEmail(), user.getAge()));
    }

    public UserDTO createUser(UserDTO userDTO) {
        User user = new User(null, userDTO.getEmail(), userDTO.getName(), userDTO.getAge());
        User savedUser = userRepository.save(user);
        return new UserDTO(savedUser.getId(), savedUser.getName(), savedUser.getEmail(), savedUser.getAge());
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
