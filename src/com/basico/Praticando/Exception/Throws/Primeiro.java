package com.basico.Praticando.Exception.Throws;

import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        System.out.println("Entre com um número decimal");
        try {
            double num = leNumero();
            System.out.println("Você digitou " + num);
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }

    }

    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
// A função do throw é lançar a exceção para o método chamador
// ou seja, leva o erro adiante.
