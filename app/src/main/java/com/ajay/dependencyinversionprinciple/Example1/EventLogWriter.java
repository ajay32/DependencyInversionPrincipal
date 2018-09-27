package com.ajay.dependencyinversionprinciple.Example1;


//***** see how dependend AppPoolWatcher class on EventLogWriter to print logs


class EventLogWriter  // this class generate log . in below class we need to print the log ..so this class needed
{
    public void Write(String message)
    {
        //Write to event log here
        System.out.println(message);
    }
}



// dependent class (depend on EventLogWriter) to send notfication
class AppPoolWatcher
{
    // Handle to EventLog writer to write to the logs
    EventLogWriter writer = null;

    // This function will be called when the app pool has problem
    public void Notify(String message)
    {
        if (writer == null)
        {
            writer = new EventLogWriter();  // created object of concrete class
        }
        writer.Write(message);  // sending message to logs to print.
    }

}

