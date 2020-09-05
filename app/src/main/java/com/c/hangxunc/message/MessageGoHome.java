package com.c.hangxunc.message;


public class MessageGoHome {
    public static final String GO_HOME = "go_home";

    public final String message;

    public static MessageGoHome getInstance(String message) {
        return new MessageGoHome(message);
    }

    public MessageGoHome(String message) {
        this.message = message;
    }
}