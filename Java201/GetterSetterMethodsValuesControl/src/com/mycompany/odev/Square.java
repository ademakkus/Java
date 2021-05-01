package com.mycompany.odev;

public class Square {
    private  int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
      if(x<0)
          System.out.println("Enter x value greater than 0");
      else
          this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
     if(y<0)
         System.out.println("Enter y value greater than zero");
     else
         this.y=y;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length<0)
            System.out.println("Enter length value greater than zero");
        else
            this.length = length;
    }

    private int y;
    private int length;
}
