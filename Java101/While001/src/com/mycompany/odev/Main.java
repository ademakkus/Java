package com.mycompany.odev;
import  java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws  InterruptedException {
//	while(true){
//        System.out.println(new Date());
//        Thread.sleep(1000);
//    }
//        for(;;){
//            System.out.println(new Date());
//            Thread.sleep(1000);
//        }
        Scanner scanner=new Scanner(System.in);
        while (true){
            int i;
            System.out.print("\nSayı giriniz:");
            i=scanner.nextInt();
            System.out.print("Sayının karesi:");
            System.out.print(Math.pow(i,2));

        }
    }
}
