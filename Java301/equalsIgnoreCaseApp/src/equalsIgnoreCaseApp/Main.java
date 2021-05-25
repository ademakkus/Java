package equalsIgnoreCaseApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		/* String secenek=" ";
		do {
			
			System.out.println("Enter number");
			secenek=keyboard.next();
		}while(!secenek.equalsIgnoreCase("quit"));
		
				*/
		String str1="ankara";
		String str2="ankara";
		int sonuc=str1.compareTo(str2);
		if(sonuc<0)
			System.out.println("daha önce geliyor ");
		if(sonuc>0)
			System.out.println("daha sonra geliyor");
		if(sonuc==0)
			System.out.println("birbirine eşit!");
		
		for(char harf='A';harf<='Z';harf++) {
			System.out.print(harf+"-");
		}
	

}
