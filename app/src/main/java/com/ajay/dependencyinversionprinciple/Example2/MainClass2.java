package com.ajay.dependencyinversionprinciple.Example2;

// bit less dependend and eaisly code .but still our class has object of all the classes it needed ..so still depends on those classes

public class MainClass2 {

    public static void main(String args[]) {

        AppPoolWatcher2 appPoolWatcher = new AppPoolWatcher2();

        appPoolWatcher.Notify("memory pool got filled in server");

    }

}
