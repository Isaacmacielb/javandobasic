package com.basico.Scanner;


import java.util.Scanner;

public class AprendendoAUsar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // O System.in já é pronto para receber dados, ele corresponde ao informação do teclado no console
        System.out.print("Qual o seu nome: ");
        String nome = scanner.next();
        System.out.println("Seja bem vindo " + nome + "!");
    }
}
// a classe Scanner nos ajuda a interagir com o console, com entradas de dados atráves do teclado