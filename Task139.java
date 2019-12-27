package com.company.Flock;

import java.util.Random;

public class Task139 {
    public static void main(String[] args) {
        Random rd = new Random();
        int count = 1;
        int curNumber = rd.nextInt(9);
        System.out.println("Первое число: " + curNumber);
        int predNumber;
        for(int i = 0; i < 9; i++) {
            predNumber = curNumber;
            curNumber = rd.nextInt(9);
            System.out.println(curNumber);
            if( curNumber > predNumber) {
                count++;
            }
        }
        System.out.println("Число элементов больше предыдущего:" + count);
    }
}