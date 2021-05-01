package com.mycompany.odev;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	File file=new File("hello.txt");
        System.out.println("file is exist: "+file.exists());
        System.out.println("file can be execute : "+file.canExecute());
        System.out.println("file can be write : "+file.canWrite());
        System.out.println("file is directory : "+file.isDirectory());
        System.out.println("get file absolute path : "+file.getAbsolutePath());
        System.out.println("file get parent :"+file.getParent());
        System.out.println("file length: "+file.length());
        System.out.println("file last modified : "+new Date(file.lastModified()));
        File file1=new File("hello2.txt");
        if(!file.exists()){

            try {
                //System.out.println("file is not exist");
                file1.createNewFile();

            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
