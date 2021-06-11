import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int heigth,width;
		int counter=1;
		System.out.println("Enter height of rectangle:");
		heigth=keyboard.nextInt();
		System.out.println("Enter width of rectangle:");
		width=keyboard.nextInt();
		while(heigth>0) {
			 
				if(heigth%2==1)
				{
					while(width>0) {
						System.out.print("X");
						width--;
					}
				}
					
				if(heigth%2==0)
				{
					while(width>0) {
						System.out.print("O");
						width--;
					}
				}
					
				System.out.println();
				heigth--;
			}
			
			
		}

	}


