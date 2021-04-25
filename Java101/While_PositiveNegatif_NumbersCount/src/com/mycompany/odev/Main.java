package com.mycompany.odev;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int positiveNumbersCount=0;
        int negativeNumbersCount=0;

        while (true){
            System.out.print("Enter a number :");
            int number=scanner.nextInt();

            if(number>0)
                positiveNumbersCount++;
            else if(number<0)
                negativeNumbersCount++;
            else
                break;;


        }
        System.out.println("Number of positive : "+positiveNumbersCount);
        System.out.println("Number of negative : "+negativeNumbersCount);
    }
}
