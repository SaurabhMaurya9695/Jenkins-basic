package com.orm.learningorm.service;

import com.orm.learningorm.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User updateUser(User user,int userID);

    void deleteUser(int userID);

    List<User> getAllUser();

    User getUser(int userID);



}
