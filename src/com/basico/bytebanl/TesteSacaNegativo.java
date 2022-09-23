package com.basico.bytebanl;

public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(101));

        conta.saca(101);

        System.out.println(conta.getSaldo());

        conta.numero = 1377;
    }
}
//get - pega um valor contido em uma determinada variável.
//set - seta valor em uma determinada variável.
