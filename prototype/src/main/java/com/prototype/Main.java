package com.prototype;

import com.prototype.diseno.PriceList;
import com.prototype.diseno.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        //lista de precios inicial
        PriceList priceList = new PriceList("Lista normal");
        List<Product>productList = List.of(new Product("Computadora", 650000), new Product("Mouse", 120000), new Product("Teclado", 200000), new Product("Pantalla", 300000));
        priceList.setProductList(productList);
        System.out.println(priceList);

        //segunda lista de precios con descuento
        PriceList priceList2 = priceList.clone();
        priceList2.setName("Lista prefer");

        for(Product p : priceList2.getProductList()){
            p.setPrice(p.getPrice() * 0.9);
        }

        System.out.println(priceList2);

        //tercera lista con clonacion profunda
        PriceList priceList3 = priceList.deepClone();
        priceList2.setName("Lista prefer 2");
        System.out.println(priceList3);


    }
}