package com.ajay.dependencyinversionprinciple.Example2;

class EmailSender implements INofificationAction
{
    public void ActOnNotification(String message)
    {
        // Send email from here
        System.out.println(message);
    }
}

class SMSSender implements INofificationAction
{
    public void ActOnNotification(String message)
    {
        // Send SMS from here
        System.out.println(message);
    }
}