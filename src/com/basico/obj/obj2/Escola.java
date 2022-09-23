package com.basico.obj.obj2;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Isaac Maciel", 199201);
            System.out.println(aluno1.getNome());
            System.out.println(aluno1.getMatricula());

        Aluno aluno2 = new Aluno("Nicolas Cassunde", 10011);
            System.out.println(aluno2.getNome());
            System.out.println(aluno2.getMatricula());
    }
}
