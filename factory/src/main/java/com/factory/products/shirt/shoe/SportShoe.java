package com.factory.products.shirt.shoe;

import com.factory.products.Shoes;

public class SportShoe implements Shoes {

    @Override
    public boolean isElegantShoes() {
        System.out.println("Zapatos deportivos --- son zapatos elegantes? ---> no");
        return false;
    }

    @Override
    public boolean isRunningShoes() {
        System.out.println("Zapatos deportivos --- son zapatos para correr? ---> si");
        return true;
    }

}
