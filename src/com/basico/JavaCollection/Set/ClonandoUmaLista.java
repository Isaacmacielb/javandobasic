package com.basico.JavaCollection.Set;

import java.awt.*;
import java.util.HashSet;

public class ClonandoUmaLista {
    public static void main(String[] args) {
        HashSet<String> criando = new HashSet<String>();

        criando.add("Vermelho");
        criando.add("Green");
        criando.add("Black");
        criando.add("White");
        criando.add("Pink");
        criando.add("Yellow");

        System.out.println("A Lista do hash set: " + criando);

        HashSet <String> new_criando = new HashSet<String>();
        new_criando = (HashSet)criando.clone();
        System.out.println("Clonando " + new_criando);
    }
}
