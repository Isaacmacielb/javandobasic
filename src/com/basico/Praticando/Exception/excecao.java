package com.basico.Praticando.Exception;

public class excecao {
    public static void main(String[] args) {
        try {
            int [] vetor = new int[4];
            System.out.println("ANTES DA EXCEPTION");
            vetor[4] = 1;

            System.out.println("Esse texto não será impresso");

        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um indice do vetor");
        }
        System.out.println("Esse texto será impresso apoós a exception");
    }
}
