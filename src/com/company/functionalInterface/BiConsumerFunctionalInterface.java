package com.company.functionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {
    static void show(Map<String,Integer> map, String mapName){
        System.out.println("map name - "+mapName);
        map.forEach((key,val)-> System.out.println(key +" : " + val));
    }

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Devs",2);
        map.put("Testers",3);
        BiConsumer<Map<String,Integer>,String> myBiCOnsumer = BiConsumerFunctionalInterface::show;
        myBiCOnsumer.accept(map,"Team asset");
    }
}
