import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//  kullanıcı tarafından girilen boyutta dizi oluşturalım
		//0-100 rastgele değer ataması yapsın
		//ve dizi for döngüsü ekrana yazdıralım
		int len;
		Scanner keyboard=new Scanner(System.in);
		Random random=new Random();
		System.out.print("Dizinin boyutunu giriniz:");
		len=keyboard.nextInt();
		
		int[] numbers=new int[len];
		for(int i=0;i<len;i++) {
			numbers[i]=random.nextInt(100);
		}
		//System.out.println(Arrays.toString(numbers));
		System.out.print("[");
		for(int j=0;j<len;j++) {
			System.out.print(numbers[j]);
			if(j==len-1)
				break;
			
			System.out.print(",");
		}
		System.out.print("]");
		System.out.println();
		System.out.println(Arrays.toString(numbers));

	}

}
