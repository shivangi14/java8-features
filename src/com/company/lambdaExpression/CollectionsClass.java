package com.company.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;

    public Product(int id, String name,float price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class CollectionsClass {

    public static void main(String[] args) {
        List<Product> myList = new ArrayList<>();
        myList.add(new Product(1,"shampoo",79.99f));
        myList.add(new Product(2,"bag",999.99f));
        myList.add(new Product(3,"vespa",78000));

        Collections.sort(myList, Comparator.comparing(p -> p.name));

        /*Collections.sort(myList,(p1, p2)->{
            return p1.name.compareTo(p2.name);
        });*/
        System.out.println("sorted list is-");
        myList.forEach(product -> System.out.println(product.id + "-"+ product.name+"-"+ product.price));

        //filtering
        Stream<Product> filtered_data = myList.stream().filter(p -> p.price <1000);
        System.out.println("filtered data");
        filtered_data.forEach(p -> System.out.println(p.id +"-" + p.name+"-"+p.price));
    }
}
