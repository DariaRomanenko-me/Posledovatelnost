package com.company.Flock;

import java.util.Random;


public class Task133 {
    public static void main(String[] args){
        Random rd = new Random();
        int max = -1;
        int count = 0;
        for(int i = 0; i < 10; i++) {
            int number = rd.nextInt(9);
            System.out.println(number);
            if( number > max) {
                max = number;
                count = 1;
            }
            else if( max == number ) {
                count++;
            }
        }
        System.out.println("Количество max чисел: " + count);
    }
}
