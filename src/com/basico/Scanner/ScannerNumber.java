package com.basico.Scanner;

import java.util.Scanner;

public class ScannerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.print("O valor informado foi " + numero);
    }
}
