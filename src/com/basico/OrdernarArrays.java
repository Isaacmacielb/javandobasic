package com.basico;

import java.util.Arrays;

public class OrdernarArrays {
    public static void main(String[] args) {
        int [] numeros = new int [] {12,3,5,21,4,85,6,9,2,1};
        for (int i : numeros) {
            System.out.print(i+" ");
        }
        Arrays.sort(numeros);
        System.out.println("\nAfter Sorting...");
        for (int i : numeros) {
            System.out.print(i+" ");
        }
    }
}
