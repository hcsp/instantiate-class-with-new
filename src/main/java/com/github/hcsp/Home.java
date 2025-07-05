package com.github.hcsp;

import com.github.hcsp.pet.Cat;

public class Home {           // Home class
    private static Cat cat;         // 成员变量cat

    public static void main(String[] args) {     //程序入口
        System.out.println(cat);
        cat = newCat();       //函数调用
        System.out.println(cat);
    }

    public static Cat newCat() {      //函数声明
        return new Cat();
        // Create a new Cat instance and return it here
        // 在这里创建一个新的Cat实例并返回之
    }
}
