import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enetr a number :");
		int number=keyboard.nextInt();
		if(number<0) {
			System.out.println("Less than zero");
		}
		if(number==0)
		{
			System.out.println("Number equals zero");
		}
		if (number>0){
			System.out.println("GREATER than zero");
		}
			

	}

}
