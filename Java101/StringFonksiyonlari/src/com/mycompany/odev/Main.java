package com.mycompany.odev;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String str1="Hello";
	String str2="HELLO";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.print("metin giriniz:");
        Scanner scanner=new Scanner(System.in);
        String metin=scanner.nextLine();
        System.out.println(metin.toLowerCase(Locale.ROOT));
        System.out.println(metin.toUpperCase());
        System.out.println("Metnin uzunluğu"+metin.length());
        System.out.println("metnin dördüncü harfi :"+metin.charAt(3));
        System.out.println(metin.substring(3));
        System.out.println(metin.isBlank());
        System.out.println(metin.isEmpty());
        System.out.println(metin.replace("mer","hel"));
        System.out.println(metin.indexOf('a'));
        System.out.println(metin.lastIndexOf("ha"));
    }
}
