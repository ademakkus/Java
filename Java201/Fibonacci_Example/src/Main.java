import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int newFib,number;
		System.out.print("Enter a number bigger than 2:");
		number=input.nextInt();
		int first=1;
		System.out.print(first+" ");
		int second=1;
		System.out.print(second+" ");
	
		
for(int i=3;i<=number;i++) {
	newFib=first+second;
	System.out.print(newFib+" ");
	first=second;
	second=newFib;
}
	}

}
