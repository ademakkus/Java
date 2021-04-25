package com.mycompany.odev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int count=0;
        while(true){

            System.out.print("Enter a number (for quit enter 0): ");
            int x=scanner.nextInt();
            sum+=x;

            if(x==0)
                break;
            count++;
        }
        System.out.println("sum of numbers: "+sum);
        System.out.println("average  of numbers: "+sum/count);

    }
}
