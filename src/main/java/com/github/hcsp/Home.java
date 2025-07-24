package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    private static Cat cat;

    public static void main(String[] args) {
        System.out.println(cat);
        cat = newCat();
        System.out.println(cat);
    }

    public static Cat newCat() {
        Cat cat = new Cat();
        return cat;
    }
}
