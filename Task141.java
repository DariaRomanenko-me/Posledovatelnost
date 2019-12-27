package com.company.Flock;

import java.util.HashSet;
import java.util.Random;

public class Task141 {
    public static void main(String[] args) {
        Random rd = new Random();
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        c: for(int i = 0; i < 15; i++) {
            int a = rd.nextInt(100) + 2;
            System.out.println(a);
            if (!set.contains(a)) {
                set.add(a);
                for (int z : set) {
                    for (int y : set) {
                        if (a * y == z) {
                            System.out.println("x = " + a);
                            System.out.println("y = " + y);
                            System.out.println("z = " + z);
                            found = true;
                            break c;
                        }
                        if (z * y == a) {
                            System.out.println("x = " + z);
                            System.out.println("y = " + y);
                            System.out.println("z = " + a);
                            found = true;
                            break c;
                        }
                    }
                }
            }
        }
        if (!found)
            System.out.println("No");
    }
}