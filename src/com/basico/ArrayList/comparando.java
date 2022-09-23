package com.basico.ArrayList;

import java.util.ArrayList;

public class comparando {
    public static void main(String[] args) {
        ArrayList<String> Stringslista1= new ArrayList<String>();

        Stringslista1.add("Audi");
        Stringslista1.add("BMW");
        Stringslista1.add("Bugatti");
        Stringslista1.add("Ford");
        Stringslista1.add("Honda");
        Stringslista1.add("Hyundai");

        ArrayList<String> Stringslist2= new ArrayList<String>();
        Stringslist2.add("Audi");
        Stringslist2.add("BMW");
        Stringslist2.add("Bugatti");
        Stringslist2.add("Ford");

        ArrayList<String> Stringslist3 = new ArrayList<String>();
        for (String e : Stringslista1)
            Stringslist3.add(Stringslist2.contains(e) ? "Sim" : "Não");
        System.out.println(Stringslist3);
    }
}
