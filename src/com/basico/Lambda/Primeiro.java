package com.basico.Lambda;

import java.util.ArrayList;

public class Primeiro {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(9);
        numeros.add(8);
        numeros.add(1);
        numeros.forEach( (n) -> {
            System.out.println(n);
        });
    }
}
//foreach é um laço for mais simplificado que retorna um código mais leǵivel
//é um for melhorado, uma nova forma de se escrever  o for
// lambda é um pequeno bloco de código que recebe parÂmetros e retorna um valor
// parâmetro -> expressão