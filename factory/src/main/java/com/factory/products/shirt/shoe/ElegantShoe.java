package com.factory.products.shirt.shoe;

import com.factory.products.Shoes;

public class ElegantShoe implements Shoes {

    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatos elegantes --- son zapatos elegantes ---> si");
        return true;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos elegantes --- son zapatos para correr ---> no");
        return false;
    }

}
