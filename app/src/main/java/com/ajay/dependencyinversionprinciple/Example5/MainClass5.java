package com.ajay.dependencyinversionprinciple.Example5;


public class MainClass5 {

    public static void main(String args[]) {


        EventLogWriter writer = new EventLogWriter();  // sending obect in method ...
        AppPoolWatcher5 watcher = new AppPoolWatcher5();
        watcher.Notify(writer, "Sample message to log");


    }

}
