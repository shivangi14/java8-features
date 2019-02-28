package com.company.functionalInterface;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    static boolean checkAge(int age){
        if(age>18)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Predicate<Integer> myPredicate = PredicateFunctionalInterface::checkAge;
        System.out.println("check age - "+myPredicate.test(25));

        Predicate<Integer> integerPredicate = a->(a<10?true:false);
        boolean bool = integerPredicate.test(44);
        System.out.println(bool);
        System.out.println("2nd - "+ integerPredicate.test(23));
    }
}
