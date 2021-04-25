package com.mycompany.odev;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int boyut;
	int toplam=0;
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.print("dizi boyutu giriniz: ");
        boyut=scanner.nextInt();
        int[] numbers=new int[boyut];
        for (int i = 0; i <boyut ; i++) {
        numbers[i]=random.nextInt(100);
        toplam+=numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        for (var number:
             numbers) {
            System.out.print(number+",");
        }
        System.out.println("\nSayıların toplamı :"+toplam);
        System.out.println("Sayıların ortalaması: "+toplam/ numbers.length);
    }
}
