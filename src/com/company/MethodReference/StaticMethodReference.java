package com.company.MethodReference;

interface Sayable2{
    void say(String S);
}

public class StaticMethodReference {
    static void SaySomething(String s){
        System.out.println("says - "+s);
    }

    public static void main(String[] args) {
        Sayable2 sayable2 = StaticMethodReference::SaySomething;
        sayable2.say("helllo");
    }
}
