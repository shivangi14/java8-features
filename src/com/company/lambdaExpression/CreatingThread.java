package com.company.lambdaExpression;

public class CreatingThread {
    public static void main(String[] args) {
        //implementing run() method
        Runnable r = ()-> System.out.println("thread is running");
        Thread t = new Thread(r);
        t.start();
    }
}
