package com.ajay.dependencyinversionprinciple.Example2;

public interface INofificationAction    // we created an iterface that will act on the notication comming for
    // all the perpose we are goona server ,, log print , send email , send sms
{
    public void ActOnNotification(String message);
}