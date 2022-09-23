package com.basico.Praticando.Exception.try_catch;

public class Try_c {
    public static void main(String[] args) {
        try {
            int [] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e){
            System.out.println("Testando");
        } finally {
            System.out.println("testando 1");
        }
    }
}
