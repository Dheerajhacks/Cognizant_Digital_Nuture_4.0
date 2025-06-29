package com.example;

public class Print {
    public String print(String msg){
        return "The msg is " + msg;
    }

    public String toUpper(String msg){
        return msg.toUpperCase();
    }

    public String toLower(String msg){
        return msg.toLowerCase();
    }

    public int length(String msg){
        return msg.length();
    }
}
