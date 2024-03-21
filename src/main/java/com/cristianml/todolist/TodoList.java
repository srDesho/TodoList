package com.cristianml.todolist;

import com.cristianml.todolist.gui.Tasks;


public class TodoList {

    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        tasks.setVisible(true);
        tasks.setLocationRelativeTo(tasks);
    }
}
