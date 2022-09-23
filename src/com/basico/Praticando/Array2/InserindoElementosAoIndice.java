package com.basico.Praticando.Array2;

import java.util.ArrayList;
import java.util.List;

public class InserindoElementosAoIndice {
    public static void main(String[] args) {
        // Criar uma lista e adiciona algumas cores à lista
        List<String> cores = new ArrayList<String>();
        cores.add("Red");
        cores.add("Green");
        cores.add("Orange");
        cores.add("White");
        cores.add("Black");
        // Mostre a lista
        System.out.println(cores);
        // // Agora insira uma cor na primeira e última posição da lista
        cores.add(0, "Pink");
        cores.add(5, "Yellow");
        // Print the list
        System.out.println(cores);
    }
}
