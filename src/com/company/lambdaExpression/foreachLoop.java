package com.company.lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class foreachLoop {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("shivangi","sona","shivi","shiva","shivaji rao","shivu");
        myList.forEach((name)->
            System.out.println(name)
        );
    }
}
