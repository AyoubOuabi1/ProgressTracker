package org.youcode.progresstracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.youcode.progresstracker.entities.Task;
import org.youcode.progresstracker.repositories.TaskRepository;

import java.util.List;
import java.util.Optional;

public class TaskService {

    private TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public void saveTask(Task task){
        taskRepository.save(task);
    }

    public void deleteTask(Task task){
        taskRepository.delete(task);
    }

    public List<Task> findTasks(){
        return taskRepository.findAll();
    }

    public Optional<Task> findTask(Long id){
        return  taskRepository.findById(id);
    }
}
