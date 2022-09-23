package com.basico.Herdado;

public class Administrador extends Funcionario implements Autenticavel {
    private AutenticacaoUtil autenticador;

    public Administrador() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}
// anotação @override, o que é?
// Ele é uma forma de garantir que você está sobrescrevendo um método e não criando um novo.

// o que são anotações?
//Elas permitem que metadados sejam escritos diretamente no código.
//Metadados são, por definição, dados que fazem referência aos próprios dados.
// de outro modo, As anotações são especificações declarativas para informar como as ferramentas devem gerar código
