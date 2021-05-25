import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int N = 100;
		int b = 1;
		while (b<=N/2)
		{
		
		b = b*2;
		if(b>50)break;
		System.out.println(b);
		}
		System.out.println("b nin son değeri="+b);
		int sayac=0;
		int toplam=0;
		int sayi;
		do
		{
			System.out.print("Enter a number (for quit 0) : ");
			sayi=keyboard.nextInt();
			sayac++;
			toplam+=sayi;		//toplam=toplam+sayi
			System.out.println(sayi);
			
		}while(sayi!=0);
		
		System.out.println("Toplam="+toplam);
		System.out.println("Ortalama="+toplam/sayac);

	}

}
