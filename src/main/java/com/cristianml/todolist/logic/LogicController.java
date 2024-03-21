package com.cristianml.todolist.logic;

import java.util.ArrayList;

public class LogicController {
    
    public Task findTaskPerId(ArrayList<Task> listTask, int id) {
        Task taskEncountered = null;
            for(Task task : listTask) {
                if (task.getId() == id) {
                    taskEncountered = task;
                }
            }
        return taskEncountered;
    }
    
    
}
