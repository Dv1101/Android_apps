package com.example.chapter2;


public class Chapter2PS {
    public static void main(String[] args) {
        int a = 6;
        int j;
        for (int i = 0; i < 10; i++) {
            j = i+1;
            System.out.println(a + "X" + j + "=" + a*j);
        }

        int sum = 0;
        int i = 0;
        int n = 3;
        // Calculating the sum
        while(i<n){
            sum += 2*i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
