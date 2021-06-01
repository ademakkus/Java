import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Adınızı giriniz:");
		String ad=scanner.nextLine();
		System.out.println(ad);
		System.out.print("Soyadınızı giriniz:");
		String soyad=scanner.nextLine();
		System.out.println(soyad);
		int yas;
		System.out.print("Yaşınızı giriniz:");
		
		yas=scanner.nextInt();
		System.out.format("Yaşınız :%d",yas);
		
		

	}

}
