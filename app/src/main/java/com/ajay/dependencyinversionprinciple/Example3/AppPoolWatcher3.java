package com.ajay.dependencyinversionprinciple.Example3;


// constructor injection   // we sending those classes object in consturctor that we need to work with , like log printing , sending email , sending sms
class AppPoolWatcher3
{
    // Handle to EventLog writer to write to the logs
    INofificationAction action = null;

    public AppPoolWatcher3(INofificationAction concreteImplementation)
    {
        this.action = concreteImplementation;
    }

    // This function will be called when the app pool has problem
    public void Notify(String message)
    {   
        action.ActOnNotification(message);
    }
}