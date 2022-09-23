package com.basico.Praticando.Encapsulamento;

import com.basico.Praticando.Heranças.Aluno;
import com.basico.encapsulamento.Conta;

public class Escola {
    private double horario;
    private int saldo;
    private int numeroDeChamada;
    private Aluno honra;
    private static int total = 0;


    public Escola(int numeroDaCadeira, int numeroDeChamada) {
        Escola.total ++;
        System.out.println("O total de matriculas são: " + Escola.total);
        this.saldo = numeroDaCadeira;
        this.numeroDeChamada = numeroDeChamada;
        this.horario = 7.7;
        System.out.println("Estou matriculando minha filha, eu quero a chamada dela: " + this.numeroDeChamada);
    }


    public void deposita(double valor) {
        this.saldo = (int) (this.saldo + valor);
    }


    public boolean transferenciaEscolar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean ValorDaMatricula(double valor, Conta destino) {
        if(this.transferenciaEscolar(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }





    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDeChamada() {
        return numeroDeChamada;
    }

    public void setNumeroDeChamada(int numeroDeChamada) {
        this.numeroDeChamada = numeroDeChamada;
    }

    public Aluno getHonra() {
        return honra;
    }

    public void setHonra(Aluno honra) {
        this.honra = honra;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Escola.total = total;
    }
}
