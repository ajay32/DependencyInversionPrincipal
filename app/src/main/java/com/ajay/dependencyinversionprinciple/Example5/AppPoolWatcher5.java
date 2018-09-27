package com.ajay.dependencyinversionprinciple.Example5;


// method injection  ... basically this class not holding object  of the classes it is gonna use ..so less depenedent..
class AppPoolWatcher5
{
    // Handle to EventLog writer to write to the logs
    INofificationAction action = null;

    // This function will be called when the app pool has problem
    public void Notify(INofificationAction concreteAction, String message)
    {
        this.action = concreteAction;
        action.ActOnNotification(message);
    }
}