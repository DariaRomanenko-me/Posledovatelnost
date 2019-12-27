package com.company.Flock;

import java.util.Random;
import java.util.Scanner;

public class Task137 {
    public static void main(String[] args) {
        Random rd = new Random();
        int PosMax1 = 0;
        int PosMax2 = 0;
        int max = -1;
        int count = 0;
        for(int i = 0; i < 9; i++) {
            int number = rd.nextInt(9);
            System.out.println(number);
            count++;
            if( number > max) {
                max = number;
                PosMax1 = count;
                PosMax2 = count;
            }
            else if(number == max) {
                PosMax2 = count;
            }
        }
        System.out.println("Номер первого max числа: " + PosMax1);
        System.out.println("Номер последнего max числа: " + PosMax2);
    }

}
