package com.mycompany.odev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stars :");
        int starCount = scanner.nextInt();
        int i = 1;
        while (i <= starCount) {


            int j = 0;


            while (j < i) {

                System.out.print("*");
                j++;
            }


            System.out.println();
            i++;
        }


        }
    }

