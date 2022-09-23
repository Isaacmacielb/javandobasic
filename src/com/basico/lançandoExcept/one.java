package com.basico.lançandoExcept;

import java.util.ArrayList;

public class one {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<>();
/*
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Fusion");


 */
        int nota1, nota2, res;

        nota1 = 50;
        nota2 = 20;

        if (nota1 > 50){
            throw new IllegalArgumentException("Valor de nota invalido");
        } if (nota2 > 50){
            throw new IllegalArgumentException("Valor de nota invalido");
        } res = nota1 + nota2;
        System.out.println("Nota resultado: " + res);

       /* try{
            System.out.println(carros.get(1));
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error: valor fora do indice do array");
        } finally {
            System.out.println("Fim do try");
        }

        */
    }
}
