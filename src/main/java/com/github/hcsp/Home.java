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
        Home cat1=new Home();
        cat1.cat = null;
        return cat1.cat;
        // Create a new Cat instance and return it here
        // 在这里创建一个新的Cat实例并返回之
    }
}
