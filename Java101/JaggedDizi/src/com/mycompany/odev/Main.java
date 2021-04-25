package com.mycompany.odev;

public class Main {

    public static void main(String[] args) {
	String[][] names=new String[3][3];
	names[0][0]="Adem";
	names[0][1]="Gülten";
	names[0][2]="Furkan";



        names[1][0]="Kerem";
        names[1][1]="Can";
        names[1][2]="Canan";

        names[2][0]="Veli";
        names[2][1]="Deli";
        names[2][2]="Kırkdokuz";
	for (int i=0;i< names.length;i++){
        for (int j = 0; j < names[i].length ; j++) {
            System.out.print(i+" "+j+":"+names[i][j]+" ");
        }
        System.out.println();
    }
    }
}
