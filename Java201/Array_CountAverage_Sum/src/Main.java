import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	//  kullanıcı tarafından girilen boyutta dizi oluşturalım
	//0-100 rastgele değer ataması yapsın
		//1-ve dizi for döngüsü ekrana yazdıralım
		//2 ortalama ve toplamını yazdıralım
		//3- ortalamanın altında ve üstünde olanları tanımlayalım
		Scanner keyboard=new Scanner(System.in);
		Random random=new Random();
		int count;
		int sum=0;
		double average=0.0;
		System.out.print("Enter the size of array:");
		count=keyboard.nextInt();
		int[] numbers=new int[count];
		for(int i=0;i<count;i++) {
			System.out.print("Type value of element "+(i+1)+":");
			numbers[i]=keyboard.nextInt();	
			sum+=numbers[i];
		}
System.out.println("Sum of elements in array:"+sum);
average=(double)sum/(double)count;
System.out.println("Average of elements in array: "+average);
	for(int i=0;i<count;i++) {
	if(numbers[i]<average)
		System.out.println(numbers[i]+" below the average");
	else
		System.out.println(numbers[i]+" Above the average.");
	}
	}

}
