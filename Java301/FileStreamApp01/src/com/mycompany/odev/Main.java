package com.mycompany.odev;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
	File file=new File("hello.txt");
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream(file);
         fileOutputStream.write("merhaba".getBytes(StandardCharsets.UTF_8));
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            if(fileOutputStream!=null)
               try {
                   fileOutputStream.close();
               }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
