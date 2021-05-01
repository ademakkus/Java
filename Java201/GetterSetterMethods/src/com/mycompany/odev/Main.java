package com.mycompany.odev;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
Worker worker=new Worker();
worker.setName("Adem AKKUŞ");
worker.setHiringDate(new Date());
worker.setSalary(4000);
        System.out.println(worker.getName());
        System.out.println(worker.getSalary());
        System.out.println(worker.getHiringDate());
    }
}
