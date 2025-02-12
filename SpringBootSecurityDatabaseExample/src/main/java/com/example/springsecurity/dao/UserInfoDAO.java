package com.example.springsecurity.dao;
import com.example.springsecurity.entities.UserInfo;
public interface UserInfoDAO {
	public abstract UserInfo getActiveUser(String userName);
}