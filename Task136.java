package com.company.Flock;

import java.util.Random;

public class Task136 {
    public static void main(String[] args) {
        Random rd = new Random();
        int length = 1;
        int maxLenght = 1;
        int number = rd.nextInt(3);
        System.out.println(number);
        for(int i = 0; i < 9; i++) {
            int otherNumber = rd.nextInt(3);
            System.out.println(otherNumber);
            if( number == otherNumber) {
                length++;
            }
            else {
                if(length > maxLenght) {
                    maxLenght = length;
                }
                number = otherNumber;
                length = 1;
            }
        }
        if(length > maxLenght) {
            maxLenght = length;
        }
        System.out.println("Длина max последовательности: " + maxLenght);
    }
}
