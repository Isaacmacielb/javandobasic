package com.basico.Array2_Alura;

import com.basico.Java_lang.Modelo.ContaCorrente;

public class TesteArrayReferencia {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        ContaCorrente cc2 = new ContaCorrente(22, 22);

        contas[0] = cc1;
        contas[1] = cc2;

        System.out.println(contas[0].getNumero());

    }
}
