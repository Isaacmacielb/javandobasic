package com.basico.bytebanl;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        // cria o objeto
        Conta contaDaMarcela = new Conta();

        // cria o novo cliente
        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);

        // adiciona o nome da cliente
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);

        // adicionando um novo saldo ao cliente

        //contaDaMarcela.saldo = 1000;
        //System.out.println(contaDaMarcela.saldo);

        // adicionando mais saldo depois de um pix

        //contaDaMarcela.saldo += 110;
        //System.out.println(contaDaMarcela.saldo);

        // Atribuito saldo está private.
    }
}
