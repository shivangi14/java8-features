package com.company.MethodReference;

interface FunctionalInterface{
    Message getMessage();
}

class Message{
    Message(){
        System.out.println("I am in constrctor.");
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        FunctionalInterface myFunctionalInterface = Message::new;
        myFunctionalInterface.getMessage();
    }
}
