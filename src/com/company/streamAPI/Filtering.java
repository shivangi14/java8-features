package com.company.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public float getPrice(){
        return this.price;
    }
}

public class Filtering {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> productPriceList = productsList.stream()
                .filter(p->p.price > 25000)     //filter
                .map(p -> p.price)      //fetch
                .collect(Collectors.toList());      //collect
        System.out.println("Filtered price list - "+productPriceList);

        System.out.println("Product name list");

        productsList.stream()
                .filter(p-> p.price>=30000)
                .forEach(p-> System.out.println(p.name));

        long count = productsList
                .stream()
                .filter(p-> p.id<4)
                .count();
        System.out.println("count - "+count);
    }
}
