package com.prototype.diseno;

public class Product implements Prototype <Product> {

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public Product clone() {
        Product clone = new Product(name, price);
        return clone;
    }

    @Override
    public Product deepClone() {                                                                                        // el deep clone no es necesario, si es que Product no tiene obj como atributos.
        return this.clone();                                                                                            // si se llama al deep clone, se llama al clone, pa q clone nomas.
    }


    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + " - Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    private String name;
    private double price;
}
