# EJB Timer Callback Notification Demo

This application demonstrates Timer Callback Notification in Java.

## Features
- Timer object that expires in 15 seconds
- RemindMe class extending TimerTask
- Displays appointment checking and reminder messages
- Shows callback notification after timer expires

## Running the Application

```bash
mvn compile exec:java
```

## Expected Output
1. "Checking for appointment"
2. "Reminder is coming in 15 seconds"
3. After 15 seconds: "You have a meeting scheduled!"