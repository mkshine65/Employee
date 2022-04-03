package com.example.employee.model;

public class GlobalError {
    String message;
    String errorreason;

    public GlobalError(String message, String errorreason) {
        this.message = message;
        this.errorreason = errorreason;
    }

    @Override
    public String toString() {
        return "GlobalError{" +
                "message='" + message + '\'' +
                ", errorreason='" + errorreason + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorreason() {
        return errorreason;
    }

    public void setErrorreason(String errorreason) {
        this.errorreason = errorreason;
    }
}
