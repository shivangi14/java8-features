package com.company.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterface {

    static int getSum(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        Function<String,String> myFunction = a -> ("answer -"+a);
        System.out.println(myFunction.apply("Shivangi"));

        Function<List<Integer>,Integer> listIntegerFunction = FunctionFunctionalInterface::getSum;
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("Sum - "+listIntegerFunction.apply(list));
    }
}
