package com.mycompany.odev;

public class Main {

    public static void main(String[] args) {
	Square square=new Square();
	square.setLength(-1);
	square.setX(100);
	square.setY(25);
        System.out.println(square.getLength());
        System.out.println(square.getX());
        System.out.println(square.getY());
    }
}
