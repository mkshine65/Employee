package com.example.employee.model;

public class DataError {

    String title;
    String message;

    public DataError(String title, String message) {
        this.title = title;
        this.message = message;
    }

    @Override
    public String toString() {
        return "DataError{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
