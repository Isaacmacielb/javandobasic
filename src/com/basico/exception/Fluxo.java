package com.basico.exception;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            metodo1();
        } catch (ArithmeticException e){
            String msg = e.getMessage();
            System.out.println("ArithmeticException Localizado" + msg);
            e.printStackTrace(); // exibe mensagem de erro no console
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        //try {
            metodo2();
        //}catch (ArithmeticException e){
            //System.out.println("ArithmeticException Achado");
        //}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
               // try{
                    //int a = i /0;
                //} catch (ArithmeticException e){
                   // System.out.println("ArithmeticException Encontrado");
              //  }
        }
        System.out.println("Fim do metodo2");
    }
}
