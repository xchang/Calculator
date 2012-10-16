package com.buaa;

public class InvaildArgumentException extends RuntimeException {
    private String message;

    public InvaildArgumentException(String message) {

        this.message = message;
    }
}
