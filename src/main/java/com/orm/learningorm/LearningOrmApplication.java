package com.orm.learningorm;

import com.orm.learningorm.entity.User;
import com.orm.learningorm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LearningOrmApplication implements CommandLineRunner {

    Logger logger= LoggerFactory.getLogger(LearningOrmApplication.class);

    //we cannot directly use the user servive non static method so we use command line runner
    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(LearningOrmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("working from project ");
//        User user=new User();
//        user.setName("Ronnie");
//        user.setAddress("Delhi");
//        user.setCity("Delhi");
//        User savedUser=userService.saveUser(user);
//        User user=userService.getUser(1);
//
//        List<User> allUsers=userService.getAllUser();
//        logger.info("user size :{}",allUsers.size());
//        logger.info("users :{}",allUsers);
//        System.out.println(user);

//        User user=new User();
//        user.setName("Raunak Verma");
//        user.setCity("Bengalore");
//        user.setAddress("Lucknow");
//        User upadtedUser=userService.updateUser(user,2);
//        logger.info("User updated:{}",upadtedUser);

//        userService.deleteUser(1);
//        logger.info("user deleted");
    }
}
