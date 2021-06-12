/*
 * 
 * Günlük satış miktarı <50 ise 15 tl sabit ucret ve her ürün için 1 tl
 *  
 * Günlük satış miktarı >=50 ise ise 15 tl sabit ucret ve ilk 50  her ürün için 2 tl ve 
 * 50 adedi aşan her ürün için 3 tl prim versin
 */
import java.io.IOException;
import java.text.DecimalFormat; 
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		double sold,wage;
		DecimalFormat df=new DecimalFormat("###,###.00");
		System.out.print("How many products were daily sold?:");
		sold=input.nextInt();
		if(sold<50)
			wage=15.0+sold*1.0;
		else
			wage=15.0+sold*2.0+(sold-50)*3.0;
System.out.println("Your daily wage is:"+df.format(wage)+" TL");
	}
	

}
