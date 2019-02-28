package com.company.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    //has to be static . Else cannot be referred from static method main()
    static void sum(List<Integer> list){
        int result = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(result);
    }

    public static void main(String[] args) {
        //defining what should be mapped to Consumer<T>'s accept(T) method
        Consumer<List<Integer>> listConsumer = ConsumerInterface::sum;
        List<Integer> myList = Arrays.asList(2,3,4,5,6);
        listConsumer.accept(myList);
    }
}
