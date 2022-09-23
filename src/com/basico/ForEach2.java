package com.basico;

import java.util.Hashtable;
import java.util.Map;

public class ForEach2 {
    public static void main(String[] args) {
        Map<String, Integer>
                    tabela = new Hashtable<>();

        tabela.put("Isaac Maciel", 10);
        tabela.put("Nicolas", 500);
        tabela.put("Mattheus", 400);
        tabela.put("Lucas", 5000);
        tabela.put("Yan", 2500);

        tabela.forEach((k, v) -> {

            v = v + 100;
            tabela.replace(k, v);
        });

        tabela.forEach(
                (k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}
