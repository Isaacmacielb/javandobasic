package com.basico.lançandoExcept;

public class segunda {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try{
            novaFrase = frase.toUpperCase();
        }
        // capturando a exce e tratando a propria
        catch (NullPointerException e){
                System.out.println("O frase inicial está nula para solucional tal o problema, foi lhe atribuito um valor default.");
                frase = "Frase vazia";
                novaFrase = frase.toUpperCase();
        }

        System.out.println("Frase antiga " + frase);
        System.out.println("Frase nova " + novaFrase);
    }
}
