package com.company.Flock;

import java.util.Random;

public class Task138 {
    public static void main(String[] args) {
        Random rd = new Random();
        int firstZero = 0;
        int count = 0;
        for(int i = 0; i < 9; i++) {
            int a = rd.nextInt(9);
            System.out.println(a);
            ++count;
            if( a == 0) {
                firstZero = count;
                break;
            }
        }
        System.out.println("Позиция первого нуля: " + firstZero);
    }
}