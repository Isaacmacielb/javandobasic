package com.basico.Praticando.Array2;

import java.util.ArrayList;

public class ComoUsarArrayList {
    public static void main(String[] args) {
        // declarando uma nova ArrayList
        ArrayList<String> nomes = new ArrayList<String> ();
        // adicionando novos nomes na lista
        nomes.add("Isaac");
        nomes.add("Lucas");
        nomes.add("Mattheus");
        nomes.add("Jõao pedro");

        //Para remover e verificar a existência do mesmo na lista:
        System.out.println(nomes.contains("Isaac")); // true
        System.out.println(nomes.contains("Yan")); // false

        //true, encontrado e removido
        boolean removida = nomes.remove("Isaac");

        System.out.println("Isaac");

        // Listar a lista
        System.out.println(nomes);

        //Veficar o tamanho de nossa ArrayList:
        System.out.println(nomes.size());

        //adicionando uma coleção inteira em outra:

        ArrayList<String> times = new ArrayList<String>();
        nomes.add("Flamengo");
        nomes.add("Vasco");

        ArrayList<String> paises = new ArrayList<String>();
        paises.add("Coreia");
        paises.add("Brasil");

        ArrayList<String> tudo = new ArrayList<String>();
        tudo.addAll(nomes);
        tudo.addAll(paises);
        System.out.println(tudo.size()); // imprime 4

     }
}

// Podemos dizer que ArrayList é uma classe para coleções
