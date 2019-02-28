package com.company.methodReference;

interface Sayable{
    void say(String S);
}

public class InstanceMethodReference {
    public void SaySomething(String S){
        System.out.println("I am saying -" + S);
    }

    public static void main(String[] args) {
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        Sayable sayable = instanceMethodReference::SaySomething;
        sayable.say("zomaland");
    }
}
