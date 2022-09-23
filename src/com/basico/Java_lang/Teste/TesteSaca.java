package com.basico.Java_lang.Teste;

import com.basico.Java_lang.Modelo.Conta;
import com.basico.Java_lang.Modelo.ContaCorrente;
import com.basico.Java_lang.Modelo.SaldoInsuficienteException;

public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);



        System.out.println(conta.getSaldo());
    }
}
