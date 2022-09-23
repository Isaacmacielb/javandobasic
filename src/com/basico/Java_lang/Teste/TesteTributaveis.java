package com.basico.Java_lang.Teste;

import com.basico.Java_lang.Modelo.CalculadorDeImposto;
import com.basico.Java_lang.Modelo.ContaCorrente;
import com.basico.Java_lang.Modelo.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc= new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
