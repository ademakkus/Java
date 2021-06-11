import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number;
		int counter=1;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		number=scanner.nextInt();
		while(counter<=number) {
			sum+=counter;
			System.out.print("\nSum of numbers from 1 to "+counter);
			System.out.print(":"+sum);
			counter++;
		}

	}

}
