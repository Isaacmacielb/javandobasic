package com.basico.desafio;

import java.math.BigDecimal;

public class ContaCorrente {
    private String cliente;
    private BigDecimal saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void logarSaldo(){
    ContaCorrente contaCorrente = new ContaCorrente();
    contaCorrente.setCliente("João");
    contaCorrente.setSaldo(new BigDecimal(100.00));

    ContaCorrente corrente = new ContaCorrente();
    corrente.setCliente("Maria");
    corrente.setSaldo(new BigDecimal(500.00));
    }
}
