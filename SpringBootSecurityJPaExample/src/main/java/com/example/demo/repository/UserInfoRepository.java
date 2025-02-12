package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.User;

public interface UserInfoRepository extends CrudRepository<User, Integer> {

}
