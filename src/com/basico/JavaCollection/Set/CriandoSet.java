package com.basico.JavaCollection.Set;

import java.util.HashSet;

public class CriandoSet {
    public static void main(String[] args) {
        HashSet<String> criando = new HashSet<String>();

        criando.add("Vermelho");
        criando.add("Green");
        criando.add("Black");
        criando.add("White");
        criando.add("Pink");
        criando.add("Yellow");

        System.out.println("Criando os set: " + criando);
    }
}
