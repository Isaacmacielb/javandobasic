package com.basico.JavaCollection.Arrays;

import java.util.ArrayList;

public class AcessandoElemento {
    public static void main(String[] args) {


                String curso1 = "JS na Web: Manipule o DOM com JavaScript";
                String curso2 = "HTML5 e CSS3";
                String curso3 = "Java e java.io: Streams, Reader e Writers";

                ArrayList<String> cursos = new ArrayList<>();

                cursos.add(curso1);
                cursos.add(curso2);
                cursos.add(curso3);

                cursos.remove(1);

                System.out.println("O primeiro curso da lista eh o: " + cursos.get(0));
            }
}
