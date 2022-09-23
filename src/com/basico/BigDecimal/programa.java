package com.basico.BigDecimal;

import java.math.BigDecimal;

public class programa {
    public static void main(String[] args) {
        double a = 0.03;
        double b = 0.04;
        double c = b - a;

        System.out.println(c);

        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);

        System.out.println(_c);

        BigDecimal bd1 = new BigDecimal("123456789.0987654321");
        BigDecimal bd2 = new BigDecimal("012333333.0000022222");
        System.out.println(bd1.add(bd2));
    }

}
