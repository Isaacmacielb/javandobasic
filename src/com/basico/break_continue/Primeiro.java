package com.basico.break_continue;

import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scanner.nextInt();

        System.out.println("Entre com um limite");
        int max = scanner.nextInt();

            for (int i = num; i <= max; i++){
                if (i % 7 == 0){
                    System.out.println("O valor de i é:" + i);
                    break;
                }
            }
    }
}
