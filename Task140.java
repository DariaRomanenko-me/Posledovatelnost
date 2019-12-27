package com.company.Flock;

import java.util.Random;

public class Task140 {
    public static void main(String[] args) {
        Random rd = new Random();
        int max1 = -1;
        int max2 = -1;
        for(int i = 0; i < 9; i++) {
            int a = rd.nextInt(9);
            System.out.println(a);
            if( a > max1) {
                max2 = max1;
                max1 = a;
            }
            else if( a < max1 && a > max2) {
                max2 = a;
            }
        }
        if( max2 == -1) {
            System.out.println("No");
        }
        else {
            System.out.println("Второе по величине число: " + max2);
        }
    }
}