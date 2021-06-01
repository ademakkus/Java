import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// kullanıcıdan girilen sayıya göre gün ismini yazsın
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Bir sayı giriniz: (1-7 aralığında)");
		int sayi=keyboard.nextInt();
		switch(sayi) {
		
		case 1: System.out.println("Pazartesi");break;
		case 2: System.out.println("Salı");	break;
		case 3:System.out.println("Çarşamba");break;
		case 4:System.out.println("Perşembe");break;
		case 5:System.out.println("Cuma");break;
		case 6:System.out.println("Cumartesi");break;
		case 7: System.out.println("Pazar");break;
		default:
		System.out.println("Geçersiz gün değeri");
		}

	}

}
