package com.basico.AdicionandoPOO;

public class Program {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Isaac";

        p.endereco = new Endereco();

        p.endereco.logradouro = "Aveninda XYZ";

        System.out.println(p.nome);
        System.out.println(p.endereco);
        System.out.println(p.endereco.logradouro);
    }
}
