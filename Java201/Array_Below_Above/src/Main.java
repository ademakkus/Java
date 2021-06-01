import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int count;
		int sum=0;
		double average=0.0;
		System.out.print("Enter the size of array:");
		count=keyboard.nextInt();
		int[] numbers=new int[count];
		for(int i=0;i<count;i++) {
			System.out.print("Type value of element "+(i+1)+":");
			numbers[i]=keyboard.nextInt();	
			sum+=numbers[i];
		}
System.out.println("Sum of elements in array:"+sum);
average=(double)sum/(double)count;
System.out.println("Average of elements in array: "+average);
int belowCount=0;
int aboveCount=0;
for(int i=0;i<count;i++) {
	if(numbers[i]<average)
		belowCount++;
	else
		aboveCount++;
	}
System.out.println("Above elements:"+aboveCount);
System.out.println("Below elements :"+belowCount);
	}
}
