package com.factory.factories;

import com.factory.ClothesFactory;
import com.factory.products.Pants;
import com.factory.products.Shirt;
import com.factory.products.Shoes;
import com.factory.products.pants.SportPants;
import com.factory.products.shirt.SportShirt;
import com.factory.products.shirt.shoe.SportShoe;

public class SportClothesFactory implements ClothesFactory {

    @Override
    public Shoes createShoes() {
        return new SportShoe();
    }

    @Override
    public Shirt createShirt() {
        return new SportShirt();
    }

    @Override
    public Pants createPants() {
        return new SportPants();
    }
}
