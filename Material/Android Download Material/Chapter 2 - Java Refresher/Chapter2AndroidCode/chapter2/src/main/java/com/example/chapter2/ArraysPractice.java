package com.example.chapter2;

import java.util.ArrayList;

public class ArraysPractice {
    public static void main(String[] args) {
        int harry[] = {10, 20, 30, 4, 6};
        System.out.println(harry[0]);
        System.out.println(harry[1]);
        ArrayList p = new ArrayList();
        p.add(3);
        p.add("4543");
        p.add(23);
        for (Object o : p){
            System.out.println("Object is: " + o);
        }
    }
}
