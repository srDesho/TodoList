package com.cristianml.todolist.logic;

import com.cristianml.todolist.persistence.PersistenceController;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.persistence.Persistence;

public class LogicController {
    
    PersistenceController persisControl = new PersistenceController();
    
    // Task
    // Create task
    public void createTask(Task task) {
        persisControl.createTask(task);
    }
    
    // Delete Task
    public void deleteTask(int id) {
        persisControl.deleteTask(id);
    }
    
    // Edit task
    public void editTask(Task task) {
        persisControl.editTask(task);
    }
    
    // Bring task
    public Task bringTask(int id) {
        return persisControl.bringTask(id);
    }
    
    // Bring taskList
    public LinkedList<Task> bringTaskList() {
        return persisControl.bringTaskList();
    }
}
