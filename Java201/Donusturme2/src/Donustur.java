
public class Donustur {

	public static void main(String[] args) {
		int sayi=1234;
		float sonuc=(float)sayi/5;    //promotion
		System.out.println(sonuc);
		
		float sayi2=1234.123f;
		int result=(int)sayi2;
		System.out.println(result); //explicit
		
		
		int sayi3=1234;
		float sayi4=sayi3;
		System.out.println(sayi4); //implicit

	}

}
