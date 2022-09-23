package com.basico.Array2_Alura;

public class Segundo {
    public static void main(String[] args) {
        //Array com laços de repetições

        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++){
                idades[i] = i * i;
        }
        for (int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}
