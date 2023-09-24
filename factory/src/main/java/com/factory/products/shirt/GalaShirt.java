package com.factory.products.shirt;

import com.factory.products.Shirt;

public class GalaShirt implements Shirt {

    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa elegante --- tiene mangas largas? ---> si");
        return true;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa elegante --- tiene botones? ---> si");
        return true;
    }

}
