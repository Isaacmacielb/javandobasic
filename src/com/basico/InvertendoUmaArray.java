package com.basico;

import java.util.Arrays;

public class InvertendoUmaArray {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array Original : "+ Arrays.toString(numeros));
        for(int i = 0; i < numeros.length / 2; i++)
        {
            int tempo = numeros[i];
            numeros[i] =  numeros[numeros.length - i - 1];
            numeros[numeros.length - i - 1] = tempo;
        }
        System.out.println("Array Inverso : "+Arrays.toString(numeros));
    }
}
