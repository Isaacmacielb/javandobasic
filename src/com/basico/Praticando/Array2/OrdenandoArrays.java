package com.basico.Praticando.Array2;

import java.util.Arrays;

public class OrdenandoArrays {
    public static void main(String[] args) {
        int[] numeros = new int[]{43, 15, 64, 22, 89};

        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));
    }
}
