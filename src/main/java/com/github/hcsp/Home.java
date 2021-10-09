package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {
    private static Cat cat;
    private static Cat newCat;
    //我应该是在这里创建了一个新的Cat实例，这个是全局变量。

    public static void main(String[] args) {
        System.out.println(cat);
        cat = newCat();
        System.out.println(cat);
    }

    public static Cat newCat() {
        // Create a new Cat instance and return it here
        // 在这里创建一个新的Cat实例并返回之
        return newCat;
    }
}
