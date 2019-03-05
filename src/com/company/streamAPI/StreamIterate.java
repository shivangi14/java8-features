package com.company.streamAPI;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        Stream.iterate(1,n->n+1)    //(initial,next)
                .filter(n->n%2 ==0)
                .limit(20)      //# of elements
                .forEach(System.out::println);
    }
}
