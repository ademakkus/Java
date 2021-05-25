import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1-5 hafta içi 6,7 haftasonu
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Bir sayı giriniz: (1-5 hafta içi, 6ve 7 haftasonu");
		int sayi=keyboard.nextInt();
		String gun="";
		switch(sayi) {
		
		case 1:
		case 2: 
		case 3:
		case 4:
		case 5:System.out.println("Hafta içi ve gun="+gun);break;
		case 6:
		case 7: System.out.println("Haftasonu yaşasın");break;
		default:
		System.out.println("Geçersiz gün değeri");
		}

	}

}
