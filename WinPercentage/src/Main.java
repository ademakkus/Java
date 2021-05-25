import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	final int NUM_GAMES=12;
	int won;
	int count=1;
	double ratio;
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the number of games won (0 t0 12):");
	won=scanner.nextInt();
	while(won<0 ||won>12) {
		System.out.print("Invalid number of games won (0 t0 12):");
		won=scanner.nextInt();
		count++;
		if(count>5)
			break;
		}
if(count>5)
	System.out.println("Game over.");
else
{
	ratio=(double)won/NUM_GAMES;
	System.out.println("Winning percentage:"+(ratio*100)+"%");
}
	}

}
