package com.factory.products.shirt;

import com.factory.products.Shirt;

public class SportShirt implements Shirt {

    @Override
    public boolean hasLongSleeves() {
        System.out.println("Camisa deportiva --- tiene mangas largas? ---> no");
        return false;
    }

    @Override
    public boolean hasButtons() {
        System.out.println("Camisa deportiva --- tiene botones? ---> no");
        return false;
    }

}
