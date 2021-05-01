package com.mycompany.odev;

public class Main {

    public static void main(String[] args) {
	boolean newResult;
	int[] arr1={1,2,3,4,5};
	int[] arr2={2,3,4,5,6};
	newResult=isEqual(arr1,arr2);
        System.out.println(newResult);
    }
    public  static  boolean isEqual(int[] x,int[] y){

       boolean result;
        if(x.length==y.length){
result=true;
            for (int i = 0; i < x.length; i++) {
                if(x[i]!=x[i]){
                  result=false;
                    break;
                }
            }
        }
        else {
            result=true;
        }
        return  result;
    }
}
