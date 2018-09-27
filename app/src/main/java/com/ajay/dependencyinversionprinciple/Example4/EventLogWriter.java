package com.ajay.dependencyinversionprinciple.Example4;

class EventLogWriter implements INofificationAction
{   
    public void ActOnNotification(String message)
    {
        // Write to event log here
        System.out.println(message);
    }
}