package com.mycompany.odev;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int first,second;
        Random random=new Random();
        System.out.print("Enter the first dimension:");
        first=scanner.nextInt();
        System.out.print("Enter the first dimension:");
        second=scanner.nextInt();
        int[][] multi=new int[first][second];
        for (int i = 0; i <multi.length ; i++) {
            for (int j = 0; j <multi[0].length ; j++)
            {
                multi[i][j] = random.nextInt(100);
                System.out.print( multi[i][j]+" ");
            }
            System.out.println();
        }

    }
}
