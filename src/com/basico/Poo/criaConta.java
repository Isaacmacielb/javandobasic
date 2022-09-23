package com.basico.Poo;

import java.awt.*;

public class criaConta {
    public static void main(String[] args) {
        //criando um objeto com new e (instanciando e pôe na memoria)
        Conta primeiraConta = new Conta(); // se referenciando a class e criando a variavel
        primeiraConta.saldo = 200;  // me referindo ao atribuito da classe conta
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem:" + primeiraConta.saldo);
        System.out.println("segunda conta tem:" + segundaConta.saldo);

    }
}
