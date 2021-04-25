package com.mycompany.odev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
String[] gunler={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma",
                "Cumartesi","Pazar"};
        System.out.println(gunler[0]);
        int[] numbers=new int[100];
        System.out.println(Arrays.toString(numbers));
int[] newnumbers={};
        System.out.println(Arrays.toString(newnumbers));
        String[] names=new String[10];
        System.out.println(Arrays.toString(names));
        names[2]="Adem";
        System.out.println(Arrays.toString(names));
    }
}
