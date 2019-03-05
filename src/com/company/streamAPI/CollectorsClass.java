package com.company.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsClass {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        double totPrice = productsList.stream()
                .collect(Collectors.summingDouble(p->p.price));
        System.out.println("sum - "+ totPrice);

        Set<Float> priceSet = productsList.stream()
                .filter(p->p.price>25000)
                .map(p->p.price)
                .collect(Collectors.toSet());

        List<Float> priceList = productsList.stream()
                .filter(p->p.price>25000)
                .map(p->p.price)
                .collect(Collectors.toList());

        System.out.println("set - "+priceSet);
        System.out.println("list - "+priceList);

        Map<Integer,String> productMap = productsList.stream()
                .collect(Collectors.toMap(p->p.id,p->p.name));
        System.out.println(productMap);
    }
}
