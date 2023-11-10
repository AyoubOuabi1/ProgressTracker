package org.youcode.progresstracker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.youcode.progresstracker.entities.Objective;
import org.youcode.progresstracker.entities.Task;
import org.youcode.progresstracker.entities.User;
import org.youcode.progresstracker.services.ObjectiveService;
import org.youcode.progresstracker.services.TaskService;
import org.youcode.progresstracker.services.UserService;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = context.getBean("UserService",UserService.class);
        User user=context.getBean("User",User.class);

        ObjectiveService objectiveService = context.getBean("ObjectiveService",ObjectiveService.class);
        Objective objective = context.getBean("Objective",Objective.class);

        TaskService taskService = context.getBean("TaskService",TaskService.class);



        user.setName("mohamed");
        user.setPassword("mohamed");
        user.setEmail("mohamed@gmail.com");



        objective.setName("featured");
        objective.setStatus("to do");
        objective.setUser(userService.getUserById(1L));
        objective.setCreatedDate(new java.util.Date(System.currentTimeMillis()));
        objective.setEndDate(Date.valueOf("2024-02-02"));
        objectiveService.saveObjective(objective);

        Task task=context.getBean("Task",Task.class);
        task.setName("task1");
        task.setStatus("to do");
        task.setCreatedDate(new java.util.Date(System.currentTimeMillis()));
        task.setEndDate(Date.valueOf("2024-01-02"));
        task.setObjective(objectiveService.getObjective(1L).get());
        taskService.saveTask(task);

        Task task2=context.getBean("Task",Task.class);
        task2.setName("task2");
        task2.setStatus("to do");
        task2.setCreatedDate(new java.util.Date(System.currentTimeMillis()));
        task2.setEndDate(Date.valueOf("2024-01-02"));
        task2.setObjective(objectiveService.getObjective(1L).get());
        taskService.saveTask(task2);

        Task task3=context.getBean("Task",Task.class);
        task3.setName("task3");
        task3.setStatus("to do");
        task3.setCreatedDate(new java.util.Date(System.currentTimeMillis()));
        task3.setEndDate(Date.valueOf("2024-01-02"));
        task3.setObjective(objectiveService.getObjective(1L).get());
        taskService.saveTask(task3);

        Task task4=context.getBean("Task",Task.class);
        task4.setName("task4");
        task4.setStatus("to do");
        task4.setCreatedDate(new java.util.Date(System.currentTimeMillis()));
        task4.setEndDate(Date.valueOf("2024-01-02"));
        task4.setObjective(objectiveService.getObjective(1L).get());
        taskService.saveTask(task4);

        //userService.saveUser(user);
       // User retrievedUser = userService.getUserById(1L);
        //System.out.println("Retrieved User: " + retrievedUser);
        List<Task> allUsers = taskService.findTasks();
        System.out.println("All Users: " + allUsers);

        context.close();
    }
}