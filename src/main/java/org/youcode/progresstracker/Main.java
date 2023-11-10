package org.youcode.progresstracker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.youcode.progresstracker.entities.User;
import org.youcode.progresstracker.services.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = context.getBean("UserService",UserService.class);
        User user = User.builder()
                .email("user@example.com")
                .name("ayoub")
                .password("ayoub")
                .build();

        userService.saveUser(user);
        User retrievedUser = userService.getUserById(1L);
        System.out.println("Retrieved User: " + retrievedUser);
        List<User> allUsers = userService.getAllUsers();
        System.out.println("All Users: " + allUsers);

        context.close();
    }
}