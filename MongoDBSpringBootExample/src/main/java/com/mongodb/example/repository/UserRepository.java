package com.mongodb.example.repository;

import com.mongodb.example.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Page<User> findByAgeGreaterThan(int age, Pageable pageable);
}
