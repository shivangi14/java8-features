package com.company.optionalClass;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
        String[] arr = new String[10];
        arr[5] = "hi!! i am here.";

        Optional<String> empty = Optional.empty();
        System.out.println("empty is - "+empty);


        //if filter gets nothing , it will give Optional.empty
        System.out.println("filter abc - " + Optional.of(arr[5]).filter(s->s.equals("abc")));
        System.out.println("filter hi!! i am here. - " + Optional.of(arr[5]).filter(s->s.equals("hi!! i am here.")));

        System.out.println("empty orElse - "+ empty.orElse("not present"));
        System.out.println("arr[5] orElse - "+ Optional.of(arr[5]).orElse("not present"));

        //when null it will throw - NoSuchElementException: No value present
        System.out.println("printing nulll value - "+ Optional.ofNullable(arr[4]).get());

    }
}
