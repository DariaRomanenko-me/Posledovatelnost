package com.company.Flock;

import java.util.Random;

public class Task135 {
    public static void main(String[] args) {
        Random rd = new Random();
        int count = 0;
        double sum = 0;
        for(int i = 0; i < 9; i++) {
            double a = rd.nextDouble()*100-50;
            System.out.println("Все числа: " + a);
            count++;
            sum += a;
        }
        double average = sum/count;
        System.out.println(average);
    }
}