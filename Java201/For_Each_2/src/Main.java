
public class Main {
final static int MAX=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,20,30,40,50,60};
		System.out.println("foreach loop");
		for(var number:numbers) {
			System.out.print(number+" ");
		}
		
		System.out.println("\nfor loop with lentgh function");
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println("\nfor loop");
		for(int i=0;i<6;i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println("\nfor loop with MAX");
		for(int i=0;i<MAX;i++) {
			System.out.print(numbers[i]+" ");
		}
	}

}
