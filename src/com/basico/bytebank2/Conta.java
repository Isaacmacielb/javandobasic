package com.basico.bytebank2;

import com.basico.bytebanl.Cliente;

public class Conta {
    // atribuitos
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
//Static serve para referenciar todos aqueles atributos/métodos da classe, ou seja, que podem ser
// acessados diretamente da definição da classe
// sem precisar instanciar nenhum objeto.

    // construtor padrão
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("o total de contas é: " + total);

        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("estou criando uma conta: " + this.numero);

    }


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

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int novoNumero){
        if (numero <= 0){
            System.out.println("nao pode valor menor igual a 0");
            return;
        }
        this.numero = novoNumero;
            }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular () {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public int getTotal(){
        return Conta.total;
    }
}
//Um método define o comportamento ou a maneira de fazer algo.
//definir o que um objeto sabe fazer. O comportamento é implementado dentro do método.
