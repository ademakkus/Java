package com.mycompany.odev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int i=1;
        int starsCount;
        System.out.print("Enter the number of stars : ");
        starsCount=scanner.nextInt();
        while(i<=starsCount){
            int j=0;
            while (j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;

        }
    }
}
