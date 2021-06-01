import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter grade :");
		int grade=keyboard.nextInt();
		if(grade<0||grade>100)					// || or veya
			System.out.println("Invalid grade");
		
		else if(grade<100 && 80<grade)
			System.out.println("A");
		else if(grade<=80 && 60<grade)
			System.out.println("B");
		else if(grade<=60 && 40<grade)
			System.out.println("C");
		else if(grade<=40)
			System.out.println("FF");
		else
			System.out.println("Invalid letter");

	}

}
