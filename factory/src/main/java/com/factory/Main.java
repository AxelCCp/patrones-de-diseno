package com.factory;


import com.factory.factories.ElegantClothesFactory;
import com.factory.factories.SportClothesFactory;
import com.factory.products.Shirt;
import com.factory.products.pants.ElegantPants;
import com.factory.products.pants.SportPants;
import com.factory.products.shirt.GalaShirt;
import com.factory.products.shirt.SportShirt;
import com.factory.products.shirt.shoe.ElegantShoe;
import com.factory.products.shirt.shoe.SportShoe;

public class Main {
    public static void main(String[] args) {

        //fabrica de ropa deportiva

        ClothesFactory sportClothesFactory = new SportClothesFactory();

        SportShirt sportShirt = (SportShirt) sportClothesFactory.createShirt();
        SportShoe sportShoe = (SportShoe) sportClothesFactory.createShoes();
        SportPants sportPants = (SportPants) sportClothesFactory.createPants();

        System.out.println("\n ----> Ejemplo de ropa deportiva <----");
        sportShirt.hasButtons();
        sportShoe.isRunningShoes();
        sportPants.getClosureType();


        //fabrica de ropa elegante

        ClothesFactory elegantClothesFactory = new ElegantClothesFactory();

        GalaShirt galaShirt = (GalaShirt) elegantClothesFactory.createShirt();
        ElegantShoe elegantShoe = (ElegantShoe) elegantClothesFactory.createShoes();
        ElegantPants elegantPants = (ElegantPants) elegantClothesFactory.createPants();

        System.out.println("\n ----> Ejemplo de ropa elegante <----");

        galaShirt.hasButtons();
        elegantShoe.isRunningShoes();
        elegantPants.getClosureType();
    }
}