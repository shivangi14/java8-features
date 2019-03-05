package com.company.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        int result = Stream.iterate(1,n->n+1)
                .limit(5)
                .reduce(0,(p1,p2)->p1+p2);      //always in last as will lead to 1 single value
        System.out.println(result);

        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        float sumPrice = productsList.stream()
                .map(p->p.price)
                .reduce(0.0f,(sum,price)->sum+price);
        System.out.println("sum of price - "+ sumPrice);
    }
}
