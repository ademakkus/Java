package com.mycompany.odev;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("File path:");
        String filePath=scanner.nextLine();
        File file=new File(filePath);
        if(!file.exists()){
            try {
                boolean fileCreated=file.createNewFile();
                if (fileCreated){
                    System.out.println("File created");
                }
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(file);
            String line=null;
            do {
                line=scanner.nextLine();
                fileWriter.write(line);
                fileWriter.write(System.lineSeparator());
            }while(!line.equalsIgnoreCase("quit"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


        scanner.close();
        System.out.println("File writing successful!");
        System.out.println("File length:"+file.length());
    }
}
