package com.company.lambdaExpression;

interface Drawing2{
    void draw();
}

class DrawingClass{
    static void drawing(){
        System.out.println("I am drawing");
    }
}
public class NoArgsWithoutLambda {
    public static void main(String[] args) {
        Drawing2 d = DrawingClass::drawing;
        d.draw();
    }
}
