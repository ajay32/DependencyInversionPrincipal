package com.ajay.dependencyinversionprinciple.Example2;

class AppPoolWatcher2
{
    // Handle to EventLog writer to write to the logs
    INofificationAction action = null;

    // This function will be called when the app pool has problem
    public void Notify(String message)
    {
        if (action == null)
        {
            // Here we will map the abstraction i.e. interface to concrete class
         //   action = new EventLogWriter();   // if we have to print logs
            action = new EmailSender();  // if we have send email  (putting class object in the interface it has implemented
        }
        action.ActOnNotification(message);
    }
}