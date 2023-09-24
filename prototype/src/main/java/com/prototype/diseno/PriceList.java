package com.prototype.diseno;

import java.util.ArrayList;
import java.util.List;

public class PriceList implements Prototype <PriceList>{

    public PriceList(String name){
        this.name = name;
    }

    //---------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    //---------------------------------------------

    @Override
    public PriceList clone() {
        PriceList clone = new PriceList(name);                                                                          //se crea clone con los mismos atributos del obj actual.
        clone.setProductList(productList);
        return clone;
    }

    @Override
    public PriceList deepClone() {

        PriceList clone = new PriceList(name);
        List<Product>cloneProducts = new ArrayList<>();

        for(Product p : productList){
            Product cloneProduct = p.clone();
            cloneProducts.add(cloneProduct);
        }

        clone.setProductList(cloneProducts);

        return clone;
    }


    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + " - PriceList{" +                                   //imprime la referencia en memoria del obj
                "name='" + name + '\'' +
                ", productList=" + productList +
                '}';
    }

    private String name;
    private List <Product> productList = new ArrayList<>();

}
