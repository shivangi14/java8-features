package com.company.lambdaExpression;

interface Addition{
    int add(int a, int b);
}

public class With2Params {
    public static void main(String[] args) {
        Addition addition = (a,b)->(a+b);
        System.out.println(addition.add(5,4));
    }
}
