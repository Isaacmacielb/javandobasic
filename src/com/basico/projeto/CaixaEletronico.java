package com.basico.projeto;

import java.math.BigDecimal;

public class CaixaEletronico {

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

    public void saque(ContaCorrente corrente, BigDecimal saldo){
        corrente.sacarSaldo(100.00);
        this.saldo = saldo;
    }
}
