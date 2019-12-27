package com.company.Flock;

import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.Random;


public class Task144 {
    public static void main(String[] args) {
        Random rd = new Random();
        PrimitiveIterator.OfInt intStream = rd.ints(1001, 1, 7).iterator();
        //intStream = Arrays.stream(new int[] {1,2,3,4,4,1,2,3,4,5,6,4,2,41,1,2,3,4,5,6,3,1,2}).iterator();
        int [] mass = {1, 2,  3, 4, 5, 6};
        int indexNumber = 0;
        int countIn = 0;
        while (intStream.hasNext()) {
            int a = intStream.nextInt();
            System.out.println(a);
            if( a == mass[indexNumber]) {
                indexNumber++;
                if(indexNumber == mass.length) {
                    indexNumber = 0;
                    countIn++;
                }
            }
            else
                indexNumber = 0;
        }
        System.out.println("Количество вхождений: " + countIn);
    }
}