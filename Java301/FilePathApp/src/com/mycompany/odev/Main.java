package com.mycompany.odev;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
        System.out.print("Dosya yolu yazınınız:");
        String path=scanner.nextLine();
        File file=new File(path);
        String[] content=file.list();
        for (int i = 0; i < content.length ; i++) {
            System.out.println(content[i]);
        }
        scanner.close();
    }
}
