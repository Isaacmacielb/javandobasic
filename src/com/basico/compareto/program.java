package com.basico.compareto;

public class program {
    public static void main(String[] args) {
        String abc = new String("abc");
        String abc1 = new String("ab");
        int x = abc.compareTo(abc1);

        System.out.println("O valor é: "+x);
    }
}
