import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter a number (for quit 0) : ");
		int sayi=keyboard.nextInt();
		int sayac=0;
		int toplam=0;
		while(sayi!=0)
		{
			sayac++;
			toplam+=sayi;		//toplam=toplam+sayi
			System.out.println(sayi);
			System.out.print("Enter a number (for quit 0): ");
			sayi=keyboard.nextInt();
		}
		System.out.println("Toplam="+toplam);
		System.out.println("Ortalama="+toplam/sayac);
	}

}
