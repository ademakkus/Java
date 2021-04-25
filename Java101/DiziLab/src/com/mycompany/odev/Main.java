package com.mycompany.odev;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizi uzunluğunu giriniz: ");
        int boyut=scanner.nextInt();
        int[] numbers=new int[boyut];
        for (int i = 0; i <boyut ; i++) {
            numbers[i]= scanner.nextInt();

        }
        System.out.println(Arrays.toString(numbers));
    }
}
