package com.example.chapter2;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello Harry");
        String name = "This is my name";
        System.out.println(name.substring(1, 3));
        int a = 75;
        int b = 4;
         a +=7;
        System.out.println(a);
        float b1 = 6.44f;
        double b2 = 6.544d;
        boolean isTrue = false;
//        System.out.println(name);
//        System.out.println(a+b);
        // Use this to print name
        /* This is a multi line comment
        in java
         */

//        if-else Conditionals
        int var = 9;
        if(var>45){

            System.out.println("The variable is greater than 45");
        }
        else{
            if(var==8){
                System.out.println("Wow this is an 8");
            }
            System.out.println("The variable is lesser than or equal to 45");
        }

        // Loops in java
        for (int i = 0; i < 8 ; i++) {
            System.out.println(i);
        }
    }



}

