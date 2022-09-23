package com.basico.Praticando.Exception.try_catch;

public class Segundo {
    public static void main(String[] args) {
        try {
            System.out.println(3/0); // codigo que irá ser testado
        } catch (Exception e){  // definições a ser testadas, caso aconteca um erro
            System.out.println("Exceção de tempo de execução de captura = %s/n" + e);
        }
    }
}
