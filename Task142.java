package com.company.Flock;

import java.util.PrimitiveIterator.OfInt;
import java.util.Random;

public class Task142 {
    public static void main(String[] args) {
        Random rd = new Random();
        OfInt intStream = rd.ints(10, 1, 10).iterator();
        int asc = 1;
        int maxAsc = 1;
        int desc = 1;
        int maxDesc = 1;
        int currNumber = intStream.nextInt();
        System.out.println(currNumber);
        int predNumber = 0;
        while (intStream.hasNext()) {
            predNumber = currNumber;
            currNumber = intStream.nextInt();
            System.out.println(currNumber);
            if( currNumber >= predNumber) {
                asc++;
                if( maxAsc < asc ){
                    maxAsc = asc;
                }
            }
            else {
                asc = 1;
            }
            if ( currNumber <= predNumber) {
                desc++;
                if( maxDesc < desc) {
                    maxDesc = desc;
                }
            }
            else{
                desc = 1;
            }
        }
        if( maxAsc > maxDesc) {
            System.out.println("Максимальная последовательность: " + maxAsc);
        }
        else
            System.out.println("Максимальная последовательность: " + maxDesc);
    }
}