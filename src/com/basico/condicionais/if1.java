package com.basico.condicionais;

public class if1 {
    public static void main(String[]args){
        System.out.println("TESTANDO CONTROLE DE FLUXO");
        int idade = 20;
        int quantidadePessoas =3;

        boolean acompanhado = quantidadePessoas >=2;

        System.out.println("valor de acompanhado" + acompanhado);

        if(idade >= 18 && acompanhado){
            System.out.println("Você é de maior");
            System.out.println("Seja bem vindo!!!");
        } else {
            System.out.println("Infelizmente voce nao pode entrar");
        }
    }
}
// condicional if é uma estrutura condicional que executa a afirmação, dentro do bloco, se determinada condição for verdadeira.
// Se for falsa, executa as afirmações dentro de else.