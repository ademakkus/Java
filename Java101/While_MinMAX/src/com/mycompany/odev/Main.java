package com.mycompany.odev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int x=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while (x<10){
            System.out.print(x+1+". Enter a number : ");
            int input=scanner.nextInt();
            if(input<min)min=input;
            if(input>max)max=input;

            x++;
        }
        System.out.println("min : "+min);
        System.out.println("MAX : "+max);
    }
}
