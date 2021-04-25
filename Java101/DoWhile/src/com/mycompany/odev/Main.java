package com.mycompany.odev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String password=null;
        Scanner scanner=new Scanner(System.in);

	do {
        System.out.print("Parola giriniz: ");
        password=scanner.next();



    }while(!password.equals("1234"));
        System.out.println("tebrikler!");
    }
}
