package com.basico.lacos;

public class while1 {
    public static void main(String[] args) {
        int i = 1, j =1;

        while (i <= 10)
        {
            while (j <= 10)
            {
                System.out.println("*");
                j++;
            }
            i++;
            System.out.println(" ");
            j = 1;
        }
    }
}
