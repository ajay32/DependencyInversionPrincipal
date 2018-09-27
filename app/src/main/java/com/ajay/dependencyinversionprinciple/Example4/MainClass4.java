package com.ajay.dependencyinversionprinciple.Example4;

public class MainClass4 {

    public static void main(String args[]) {
        EventLogWriter writer = new EventLogWriter();
        AppPoolWatcher4 watcher = new AppPoolWatcher4();

        // This can be done in some class
        watcher.Action = writer;

        // This can be done in some other class
        watcher.Notify("Sample message to log");


    }

}
