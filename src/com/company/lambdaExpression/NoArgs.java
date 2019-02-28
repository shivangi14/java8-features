package com.company.lambdaExpression;

interface Drawing{
    void draw();
}

public class NoArgs {
    public static void main(String[] args) {
        Drawing d = ()-> {
            System.out.println("I am drawing");
        };
        d.draw();
    }
}
