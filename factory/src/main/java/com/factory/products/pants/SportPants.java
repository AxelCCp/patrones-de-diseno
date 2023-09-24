package com.factory.products.pants;

import com.factory.products.Pants;

public class SportPants implements Pants {

    @Override
    public boolean hasPockets() {
        System.out.println("Pants deportivos --- tienen bolsillos ---> no");
        return false;
    }

    @Override
    public String getClosureType() {
        System.out.println("Pants deportivos --- tipo de cierre ---> sin cierre");
        return null;
    }

}
