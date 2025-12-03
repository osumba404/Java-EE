package com.example;

import java.util.Timer;

public class TimerTask {
    
    public static void main(String[] args) {
        System.out.println("Checking for appointment");
        
        Timer timer = new Timer();
        System.out.println("Reminder is coming in 15 seconds");
        
        RemindMe remindTask = new RemindMe();
        timer.schedule(remindTask, 15000);
        
        try {
            Thread.sleep(16000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        timer.cancel();
    }
}