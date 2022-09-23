package com.basico.Praticando.Exception;

public class Exception1 {
    public static void main(String[] args) {
        try {
            System.out.println(0 / 0);
        } catch (Exception e ){
            System.out.println("Erro");
        }
    }
}
