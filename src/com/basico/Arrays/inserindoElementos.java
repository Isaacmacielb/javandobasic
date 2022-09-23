package com.basico.Arrays;

import java.util.ArrayList;
import java.util.List;

public class inserindoElementos {
    public static void main(String[] args) {
        List<String> Arraylistar = new ArrayList<String>();
        Arraylistar.add("Audi");
        Arraylistar.add("BMW");
        Arraylistar.add("Bugatti");
        Arraylistar.add("Ford");
        Arraylistar.add("Honda");
        Arraylistar.add("Hyundai");

        System.out.println(Arraylistar);

        Arraylistar.add(0, "Ferrari");
        Arraylistar.add(7, "Fiat");

        System.out.println(Arraylistar);
    }
}
