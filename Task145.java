package com.company.Flock;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.Random;

public class Task145 {
    public static void main(String[] args) {
        Random rd = new Random();
        PrimitiveIterator.OfInt intStream = rd.ints(100, 1, 3).iterator();
        //intStream = Arrays.stream(new int[] {1,2,1,2,1,2,1,2,2,1,2,1,2,1,2,1,1,1,5,6,3,463,1,2}).iterator();
        int [] mass = {1, 2, 1, 2, 1, 2};
        int indexNumber = 0;
        int countIn = 0;
        while (intStream.hasNext()) {
            int a = intStream.nextInt();
            System.out.println(a);
            if( a == mass[indexNumber]) {
                indexNumber++;
                if(indexNumber == mass.length) {
                    indexNumber = 4;
                    countIn++;
                }
            }
            else
                indexNumber = 0;
        }
        System.out.println("Количество вхождений: " + countIn);
    }
}