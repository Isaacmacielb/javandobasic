package com.basico.bank;
import java.math.BigDecimal;

public class Banco {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        //Alterando valores de minhaConta
        minhaConta.setTitular("Isaac Maciel");
        minhaConta.setSaldo(new BigDecimal(1000));

        //saca 200 Reais
        System.out.println("Saldo atual da conta: R$ %s\n" + minhaConta.saca(200));

        //Deposita 500 reais
        System.out.println("Saldo atual da conta: R$ %s\n" + minhaConta.deposita(500));

        System.out.println("Seu saldo atual é de R$ %s"+ minhaConta.getSaldo().setScale(2).toString().replace(".", ","));
    }
}

