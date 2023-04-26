package com.example.todoapp.Model;

public class ToDoModel {
    private int id, status;
    private String tasks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTask() {
        return tasks;
    }

    public void setTask(String tasks) {
        this.tasks = tasks;
    }
}
