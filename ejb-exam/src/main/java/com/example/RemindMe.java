package com.example;

import java.util.TimerTask;

public class RemindMe extends TimerTask {
    
    @Override
    public void run() {
        System.out.println("You have a meeting scheduled!");
    }
}