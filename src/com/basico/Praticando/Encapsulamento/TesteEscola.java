package com.basico.Praticando.Encapsulamento;

public class TesteEscola {
    public static void main(String[] args) {
        Escola escola = new Escola(11, 111);
        escola.deposita(400);

        System.out.println(escola.getSaldo());

    }
}
