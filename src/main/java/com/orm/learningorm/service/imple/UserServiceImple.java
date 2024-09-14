package com.orm.learningorm.service.imple;


import com.orm.learningorm.entity.User;
import com.orm.learningorm.repositories.UserRepository;
import com.orm.learningorm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//implementation class of user service for loose coupling
@Service
public class UserServiceImple implements UserService {

    Logger logger= LoggerFactory.getLogger(UserServiceImple.class);

    //SpringBoot automatically create the implementation of UserRepository
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        User savedUser=userRepository.save(user);
        logger.info("User saved :{}",savedUser.getId());

        return savedUser;
    }

    @Override
    public User updateUser(User user, int userID) {
       //get the user
        User user1=userRepository.findById(userID).orElseThrow(()-> new RuntimeException("User not found using the givenId"));
        user1.setName(user.getName());
        user1.setAddress(user.getAddress());
        user1.setCity(user.getCity());
        //update the user
        User user2=userRepository.save(user1);
        return user2;
    }

    @Override
    public void deleteUser(int userID) {
        User user=userRepository.findById(userID).orElseThrow(()-> new RuntimeException("User not found using the givenId"));
        userRepository.deleteById(userID);
    }
    //get user by id
    @Override
    public List<User> getAllUser() {
        List<User>allUser =userRepository.findAll();
        return allUser;
    }

    @Override
    public User getUser(int userID){
        Optional<User> userOptional =userRepository.findById(userID);
        User user=userOptional.orElseThrow(()-> new RuntimeException("User not found using the givenId"));
        return user;
    }
}
