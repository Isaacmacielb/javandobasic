package com.basico.Praticando;

public class ArrayeLaços {
    public static void main(String[] args) {
        int[] idades = {18, 19, 18, 18, 18};
        // mudando a idade
        idades[0] = 19 ;
        System.out.println(idades[0]);

        // criando um loop
        for (int i = 0; i <idades.length; i++){
            System.out.println("Legal");
        }
    }

}
