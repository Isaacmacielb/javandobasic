package com.basico.bytebanl;

public class Conta {
    // atribuitos
   private double saldo;
    int agencia;
    int numero;
    Cliente titular;


    //métodos
    public void deposita(double valor){
        this.saldo +=valor;
    }
    public boolean saca(double valor){
        if (this.saldo >- valor){
            this.saldo -= valor;
            return false;
        } else {
            return true;
        }
    }

    public boolean transfere(double valor, Conta destino){
            if(this.saldo >= valor){
                this.saldo -= valor;
                destino.deposita(valor);
                return true;
            } else {
                return false;
            }
    }

    public double getSaldo(){
        return this.saldo;
    }
}
//Um método define o comportamento ou a maneira de fazer algo.
//definir o que um objeto sabe fazer. O comportamento é implementado dentro do método.
