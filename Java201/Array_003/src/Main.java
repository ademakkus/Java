import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// kullanıcı tarafından girilen boyutta dizi oluşturalım
		Scanner keyboard=new Scanner(System.in);
		int diziBoyutu;
		System.out.print("Dizi boyutunu giriniz:");
		diziBoyutu=keyboard.nextInt();
		
		String[] isimler=new String[diziBoyutu];
		for(int i=0;i<diziBoyutu;i++) {
			System.out.print(i+" indisli elemanı giriniz: ");
			isimler[i]=keyboard.next();
		}
		System.out.println(Arrays.toString(isimler));

	}

}
