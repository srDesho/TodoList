package com.cristianml.todolist.persistence;

import com.cristianml.todolist.logic.Task;
import com.cristianml.todolist.persistence.exceptions.NonexistentEntityException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    TaskJpaController taskJpa = new TaskJpaController();
    
    // Create task
    public void createTask(Task task) {
        taskJpa.create(task);
    }
    
    // Delete task
    public void deleteTask(int id) {
        try {
            taskJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Edit task
    public void editTask(Task task) {
        try {
            taskJpa.edit(task);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Bring a task
    public Task bringTask(int id) {
        return taskJpa.findTask(id);
    }
    
    // Bring task List
    public LinkedList<Task> bringTaskList() {
        List<Task> list = taskJpa.findTaskEntities();
        return new LinkedList<>(list);
    }
}
