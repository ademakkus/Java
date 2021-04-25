package com.mycompany.odev;

import java.util.Scanner;
/*
* find and print the even number between start number and end number
* */

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int startNumber,endNumber;
        System.out.print("Enter the start number : ");
        startNumber=scanner.nextInt();
        System.out.print("Enter the end number : ");
        endNumber=scanner.nextInt();
        while(startNumber<endNumber){
            if(startNumber%2==0)
                System.out.println(startNumber);

            startNumber++;
        }
    }
}
