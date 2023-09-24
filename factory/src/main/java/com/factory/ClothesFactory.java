package com.factory;

import com.factory.products.Pants;
import com.factory.products.Shirt;
import com.factory.products.Shoes;

public interface ClothesFactory {

    Shoes createShoes();
    Shirt createShirt();
    Pants createPants();

}
