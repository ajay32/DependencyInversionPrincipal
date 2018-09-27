package com.ajay.dependencyinversionprinciple.Example3;

public class MainClass3 {

    public static void main(String args[]) {

        EmailSender emailSender = new EmailSender();  // if we need to send email.
        AppPoolWatcher3 watcher0 = new AppPoolWatcher3(emailSender);
        watcher0.Notify("sending email about the issue");

        EventLogWriter writer = new EventLogWriter();  /// if we need event log writer..
        AppPoolWatcher3 watcher = new AppPoolWatcher3(writer);
        watcher.Notify("event log  message");




    }

}
