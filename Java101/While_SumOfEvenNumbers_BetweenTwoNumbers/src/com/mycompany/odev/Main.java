package com.mycompany.odev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int startNumber,endNumber;
        System.out.print("Enter the  start number: ");
        startNumber=scanner.nextInt();
        long sumOfEvenNumbers=0,sumOfAddNumbers=0;
        System.out.print("Enter the end number: ");
        endNumber=scanner.nextInt();
        while (startNumber<=endNumber){
            if(startNumber%2==0)
                sumOfEvenNumbers+=startNumber;
            else
                sumOfAddNumbers+=startNumber;

            startNumber++;

        }
        System.out.println("Sum of even numbers: "+sumOfEvenNumbers);
        System.out.println("Sum of add numbers: "+sumOfAddNumbers);
    }
}
