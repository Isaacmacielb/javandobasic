package com.basico.Praticando.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();

        objArray2.add(0,"comum1");
        objArray2.add(1,"comum2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"comum");
        objArray.add(1,"comum");
        objArray.add(2,"comum2");
        System.out.println("Elementos de matriz de matriz1" +objArray);
        System.out.println("Elementos de matriz de matriz" +objArray2);
        objArray.removeAll(objArray2);
        System.out.println("Array1 após remover array2 de array1\n"+objArray);
    }
}
