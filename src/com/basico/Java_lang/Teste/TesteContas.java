package com.basico.Java_lang.Teste;

import com.basico.Java_lang.Modelo.ContaCorrente;
import com.basico.Java_lang.Modelo.ContaPoupanca;
import com.basico.Java_lang.Modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        try{
            int a = 3;
            int b = a / 0;
        } catch (ArithmeticException ex){
            System.out.println("ArithmeticException sucesso");
        }

        //ContaCorrente outros = null;
        //outros.deposita(200.0);

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
