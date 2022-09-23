package com.basico.bank;

import java.math.BigDecimal;

public class Conta {
    private BigDecimal saldo;
    private String titular;

    public Conta() {
    }

    public Conta(BigDecimal saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String saca(double valor) {
        BigDecimal v = BigDecimal.valueOf(valor).setScale(2);
        System.out.println(String.format("Efetuando saque de R$ %s", v.toString().replace(".", ",")));
        saldo = saldo.subtract(v);
        return saldo.setScale(2).toString().replace(".", ",");
    }

    public String deposita(double valor) {
        BigDecimal v = BigDecimal.valueOf(valor).setScale(2);
        System.out.println(String.format("Efetuando depósito de R$ %s", v.toString().replace(".", ",")));
        saldo = saldo.add(v);
        return saldo.setScale(2).toString().replace(".", ",");
    }
}

