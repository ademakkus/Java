import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int count;
		int temp;
		Random random=new Random();
		System.out.print("Enter count :");
		count=keyboard.nextInt();
		int[] kareler=new int[count];
		
		for(int i=0;i<kareler.length;i++) {
			temp=random.nextInt(10);
			System.out.print(temp+" ");
			kareler[i]=temp*temp;
			
		}
		System.out.println();
		for(var karesi:kareler) {
			System.out.print(karesi+" ");
		}
	}

}
