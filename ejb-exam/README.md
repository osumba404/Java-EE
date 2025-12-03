# EJB Timer Callback Notification Demo

This application demonstrates Timer Callback Notification in Java EJB.

## Features
- Timer object that expires in 15 seconds
- RemindMe class extending TimerTask
- Displays appointment checking and reminder messages
- Shows callback notification after timer expires

## Running the Application

### Option 1: Run as Java Application
```bash
mvn compile exec:java -Dexec.mainClass="com.example.TimerApplication"
```

### Option 2: Run with Jetty Server
```bash
mvn jetty:run
```
Then visit: http://localhost:8080/timer

## Expected Output
1. "Checking for appointment"
2. "Reminder is coming in 15 seconds"
3. After 15 seconds: "You have a meeting scheduled!"