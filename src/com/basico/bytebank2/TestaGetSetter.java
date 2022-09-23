package com.basico.bytebank2;

public class TestaGetSetter {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();

        paulo.setNome("paulo silveira");
       // conta.setTitular(paulo);
        //System.out.println(conta.getTitular().getN);
    }
}
//get - pega um valor contido em uma determinada variável.
//set - seta valor em uma determinada variável.