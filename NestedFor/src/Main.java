import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int heigth,width;
		System.out.println("Enter height of rectangle:");
		heigth=keyboard.nextInt();
		System.out.println("Enter width of rectangle:");
		width=keyboard.nextInt();
		for(int i=1;i<=heigth;i++) {
			if(i%2==0)
			{
				for(int j=1;j<=width;j++) {
					System.out.print("O");
				}
			}
			if(i%2==1)
			{
				for(int j=1;j<=width;j++) {
					System.out.print("X");
				}
			}
			System.out.println();
			
		}

	}

}
