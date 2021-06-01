
public class Main {

	public static void main(String[] args) {
		int number=-7;
		boolean isPositive=(number>0);
		if(number>0)
			number=-100;
		if(isPositive)
			System.out.println("Positive");
		else 
			System.out.println("Not positive");
		System.out.println(number);
		

	}

}
