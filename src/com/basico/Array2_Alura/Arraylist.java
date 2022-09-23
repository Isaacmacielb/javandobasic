package com.basico.Array2_Alura;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("guilherme");
        nomes.add("mario");
        nomes.add("paulo");
        nomes.add("mauricio");
        nomes.add("adriano");
        nomes.add("alberto");
        nomes.add("mario");

        System.out.println(nomes.indexOf("guilherme")); // 0
        System.out.println(nomes.indexOf("mario")); // 1
        System.out.println(nomes.indexOf("joao")); // -1
        System.out.println(nomes.lastIndexOf("mario")); // 6
        System.out.println(nomes.lastIndexOf("joao")); // -1
    }
}
