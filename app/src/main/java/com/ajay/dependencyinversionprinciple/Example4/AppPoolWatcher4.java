package com.ajay.dependencyinversionprinciple.Example4;


// field or property inject  ...puting object be getting the field or property

class AppPoolWatcher4
{
    // Handle to EventLog writer to write to the logs
    INofificationAction action = null;

    public INofificationAction Action;  // field...getting object in this


    // This function will be called when the app pool has problem
    public void Notify(String message)
    {
        action = Action;
        action.ActOnNotification(message);
    }
}