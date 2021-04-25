package com.mycompany.odev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] numbers=new int[10];
        Arrays.fill(numbers,10);
        //dizi elemanlarına  aynı değeri ata
        System.out.println(Arrays.toString(numbers));

        int[] numbers2=new int[10];
        Arrays.fill(numbers2,1,4,20);
        //dizinin aralıktaki 1- 4 yani ( numbers2[1],numbers2[2],numbers2[3]
        // 9elemanlarına  aynı değeri
        // ata
        System.out.println(Arrays.toString(numbers2));
    }
}
