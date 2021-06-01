import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// integer tipinde dizi
		int[] sayilar=new int[20];	//n=20 dizinin boyutu
		//int[] sayilar2= {1,2,3,4,5,6,7,8,9,10};
		sayilar[0]=10;		//dizinin ilk elemanı değeri:10
		sayilar[5]=60;		//dizinin 6. elemanı değeri:60
		sayilar[11]=120;		//dizinin 12. elemanı değeri:120
		sayilar[19]=200;		//dizinin 20. elemanı değeri:200
		System.out.println(Arrays.toString(sayilar));
		
		String[] isimler=new String[5];
		isimler[0]="Serhan";	//dizinin ilk elemanı değeri:Serhan
		isimler[2]="Kerem";		//dizinin 3. elemanı değeri:Kerem
		isimler[4]="Adem";		////dizinin 5. elemanı değeri: Adem
		
		System.out.println(Arrays.toString(isimler));

	}

}
