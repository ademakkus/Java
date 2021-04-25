package com.mycompany.odev;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.print("Total number of how many will be produced? :");
        int count=scanner.nextInt();
        int[] numbers=new int[count];
        int[] evenNumbersArray=new int[count];
        int[] addNumbersArray=new int[count];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= random.nextInt(100);
            if(numbers[i]%2==0)
                evenNumbersArray[i]=numbers[i];
            else
                addNumbersArray[i]=numbers[i];

        }
        float total= 0.0F;
        for (int element:
                numbers) {
            total+=element;
        }

        System.out.println("------ Print Array ----");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Total of array elements :"+total);
        System.out.println("Average of array elements :"+total/count);
        System.out.println(Arrays.toString(evenNumbersArray));
        System.out.println(Arrays.toString(addNumbersArray));
    }
}
