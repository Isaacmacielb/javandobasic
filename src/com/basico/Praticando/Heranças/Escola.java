package com.basico.Praticando.Heranças;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        // para entrar na escola tem que ser maior de 10 anos
        // qual a idade de Isaac?
        int idade = 11;

        if (idade > 10){
            System.out.println("Parabéns você conseguiu uma vaga na nossa instituição");
        } else {
            System.out.println("Não foi dessa vez, boa sorte na proxima tentativa");
        }

        System.out.println("Sua matricula á baixo!");

        aluno.nome = "Isaac";
        aluno.sobreNome = "Maciel";
        aluno.matricula = "G4401";

        System.out.println("O Nome do aluno é:" + aluno.nome);
        System.out.println("O sobrenome do aluno é: " + aluno.sobreNome);
        System.out.println("A matricula do aluno é: " + aluno.matricula);



    }
}
