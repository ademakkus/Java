import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int start,finish;
		int evenCounter=0,oddCounter=0;
		int sumOfEven=0;
		int sumOfOdd=0;
		int sumOfTotal=0;
		System.out.print("Enter start number:");
		start=keyboard.nextInt();
		System.out.print("Enter finish number:");
		finish=keyboard.nextInt();
		for(int i=start;i<=finish;i++) {
			if(i%2==0) {
				sumOfEven+=i;
				evenCounter++;
			}
								
			if(i%2==1) {
				sumOfOdd+=i;
				oddCounter++;
			}
				
		}
		System.out.println("Even number count="+evenCounter);
		System.out.println("Odd number count="+oddCounter);
		System.out.println("Sum of even numbers="+sumOfEven);
		System.out.println("Sum of odd numbers="+sumOfOdd);
		sumOfTotal=sumOfEven+sumOfOdd;
		System.out.println("Sum of total ="+sumOfTotal);
	}

}
