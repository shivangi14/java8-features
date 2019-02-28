package com.company.functionalInterface;

@FunctionalInterface
interface sayable{
    void say(String msg);

    //any # of object class methods
    String toString();
    int hashCode();
}

public class OneAbstractMethod implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        OneAbstractMethod oneAbstractMethod = new OneAbstractMethod();
        oneAbstractMethod.say("Hello");
    }
}

