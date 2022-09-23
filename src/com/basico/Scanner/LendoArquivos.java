package com.basico.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LendoArquivos {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("/home/meunotebook/Downloads/contas.csv"));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);
        }
        scanner.close();
    }
}
