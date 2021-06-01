import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		Random random=new Random();
		int len;
		int count;
		System.out.print("Count :");
		count=random.nextInt(10);
		String[] names=new String[count];
		System.out.println("Size of array :"+names.length);
		System.out.println("Index of first element is: 0");
		System.out.println("Last index of array:"+(names.length-1));
		len=names.length;
		for(int i=0;i<len;i++) {
			System.out.println("Enter"+(i+1)+" .value:");
			names[i]=keyboard.next();
		}
		for(String newElement:names) {
			System.out.println(newElement+" ");
		}
		
		
		
		System.out.println();
		System.out.println(Arrays.toString(names));

	}

}
