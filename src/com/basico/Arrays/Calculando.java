package com.basico.Arrays;

public class Calculando {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int soma = 0;

        for (int i : array)
            soma += i;
        System.out.println("A soma do array é: " + soma);
    }
}
