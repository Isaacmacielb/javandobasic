package com.basico.compareto;

import java.math.BigDecimal;

public class one {
    public static void main(String[] args) {
        BigDecimal b1, b2;

        b1 = new BigDecimal(67891);
        b2 = new BigDecimal(12346);

        if (b1.compareTo(b2) == 0) {
            System.out.println(b1 + " e " + b2 + " nenhuma.");
        }
        else if (b1.compareTo(b2) == 1) {
            System.out.println(b1 + " é maior que " + b2 + ".");
        }
        else {
            System.out.println(b1 + " é menor do que " + b2 + ".");
        }
    }
}
