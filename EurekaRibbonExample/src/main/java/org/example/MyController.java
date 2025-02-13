package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/invoke")
    public String invokeMicroservice() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://example-service/api/resource", String.class);
        return "Response from microservice: " + responseEntity.getBody();
    }
}
