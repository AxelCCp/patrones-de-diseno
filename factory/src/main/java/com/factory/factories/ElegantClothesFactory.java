package com.factory.factories;

import com.factory.ClothesFactory;
import com.factory.products.Pants;
import com.factory.products.Shirt;
import com.factory.products.Shoes;
import com.factory.products.pants.ElegantPants;
import com.factory.products.shirt.GalaShirt;
import com.factory.products.shirt.shoe.ElegantShoe;

public class ElegantClothesFactory implements ClothesFactory {

    @Override
    public Shoes createShoes() {
        return new ElegantShoe();
    }

    @Override
    public Shirt createShirt() {
        return new GalaShirt();
    }

    @Override
    public Pants createPants() {
        return new ElegantPants();
    }
}
