package com.basico.JavaCollection.Set;

import java.util.HashSet;

public class RemovaTodos {
    public static void main(String[] args) {
        HashSet<String> criando = new HashSet<String>();

        criando.add("Vermelho");
        criando.add("Green");
        criando.add("Black");
        criando.add("White");
        criando.add("Pink");
        criando.add("Yellow");

        System.out.println("Todos os set: " + criando);

        // removendo todos
        criando.removeAll(criando);
        System.out.println("Removi todo os set " + criando);
    }
}
