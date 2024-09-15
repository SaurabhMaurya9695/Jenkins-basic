package com.orm.learningorm;

import com.orm.learningorm.entity.*;
import com.orm.learningorm.repositories.CategoryRepo;
import com.orm.learningorm.repositories.ProductRepo;
import com.orm.learningorm.repositories.StudentsRepository;
import com.orm.learningorm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LearningOrmApplication implements CommandLineRunner {

    Logger logger= LoggerFactory.getLogger(LearningOrmApplication.class);
   @Autowired
    private StudentsRepository studentsRepository;

    //we cannot directly use the user servive non static method so we use command line runner
    @Autowired
    private UserService userService;

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ProductRepo productRepo;

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

     Products product1=new Products();
     product1.setProductId(11);
     product1.setProductName("Washing");

        Products product2=new Products();
        product2.setProductId(12);
        product2.setProductName("Samsung");


        Category category=new Category();
        category.setCategoryId(1243);
        category.setCategory("Electronic");

        Category category2=new Category();
        category2.setCategoryId(12432);
        category2.setCategory("Mobile");

        List<Products> category1products=category.getProducts();
        category1products.add(product1);
        category1products.add(product2);

        List<Products> category2products=category.getProducts();
        category2products.add(product1);
        category2products.add(product2);

        categoryRepo.save(category);
        categoryRepo.save(category2);

    }
}
