package com.ajay.dependencyinversionprinciple.Example1;

public class MainClass {

    // link to this tutorial "Dependecy Inversion Tutorial"
    // in smile to make two classes independent of each other
    // or if a class is dependent on other classes ...linked other classes to it through interface (all other classes implenting the same interface method)

    // read below to understand it
   // https://www.codeproject.com/Articles/615139/An-Absolute-Beginners-Tutorial-on-Dependency-Inver

    public static void main(String args[]) {

        AppPoolWatcher appPoolWatcher = new AppPoolWatcher();

        appPoolWatcher.Notify("memory pool got filled in server");

    }

}
