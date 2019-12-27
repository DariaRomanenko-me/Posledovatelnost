package com.company.Flock;

import java.util.PrimitiveIterator;
import java.util.Random;

public class Task143 {
    public static void main(String[] args) {
        Random rd = new Random();
        PrimitiveIterator.OfInt intStream = rd.ints(20, 0, 2).iterator();
        int grCount = 0;
        int predNumber = 0;
        while(intStream.hasNext()) {
            int a = intStream.nextInt();
            System.out.println(a);
            if( a == 1 && predNumber == 0) {
                grCount++;
            }
            predNumber = a;
        }
        System.out.println("Количество групп: " + grCount);
    }
}