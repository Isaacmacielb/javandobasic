package com.basico.Praticando.Switch;

public class Terceiro {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        switch (a + b){
            case 2:
                System.out.println("Se for essa condição, pare aqui!! one");
                break;
            case 3:
                System.out.println("se for essa condição, pare aqui!! two");
                break;
            case 4:
                 System.out.println("se for essa condição pare aqui!! tree");

            default:
                System.out.println("ultima condição");
                break;
        }
    }
}
