package com.ibm.reactor.entity;


public  class Todo {
    private int id;
    private int userId;
    private String title;
    private boolean status;

    public Todo() {
    }

    public Todo(int id, int userId, String title, boolean status) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
