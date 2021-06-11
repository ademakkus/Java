import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int number,guessedNumber;
		int counter=1;
		Random random=new Random();
		number=random.nextInt(100);
		System.out.println(number);
		
		System.out.println("I picked a number between 0 and 100!");
		
		do {
			System.out.print("Guess the number:");
			guessedNumber=keyboard.nextInt();
			if(guessedNumber<0 ||guessedNumber>100) {
				System.out.println("Inavid number!Please enter  a number between 0 and 100! ");
				System.out.print("Guess the number:");
				guessedNumber=keyboard.nextInt();
			}
			else {
				while(number!=guessedNumber) {
					if(guessedNumber<number) {
						System.out.println("Increase your guess");
						System.out.print("Guess the number:");
						guessedNumber=keyboard.nextInt();
						counter++;
					}
					else if(guessedNumber>number){
						System.out.println("Decrease your guess");
						System.out.print("Guess the number:");
						guessedNumber=keyboard.nextInt();
						counter++;
					}
					else {
						counter++;
						break;
					}
				}
					
			}
		
		}while(guessedNumber!=number);
		System.out.println("You found the number after "+ counter +" guess!");
		

	}

}
