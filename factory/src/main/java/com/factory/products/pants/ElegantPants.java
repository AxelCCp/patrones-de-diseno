package com.factory.products.pants;

import com.factory.products.Pants;

public class ElegantPants implements Pants {
    @Override
    public boolean hasPockets() {
        System.out.println("Pants elegantes --- tienen bolsillos ---> si");
        return true;
    }

    @Override
    public String getClosureType() {
        System.out.println("Pants elegantes --- tipo de cierre ---> cierre  - cremayera");
        return "cierre  - cremayera";
    }
}
