package com.mycompany.odev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int starCount;
        System.out.print("enter number of stars :");
        starCount=scanner.nextInt();
        int i=1;
        while (i<=starCount){
            System.out.println("*");
            i++;
        }
    }
}
