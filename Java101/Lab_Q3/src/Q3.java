import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Enter the time in the format hh:mm:ss.");
		String time=keyboard.nextLine();
		System.out.println("Current hours:"+time.substring(0,2));
		System.out.println("Current minutes:"+time.substring(3,5));
		System.out.println("Current seconds:"+time.substring(6,8));
		System.out.println("This maxim has always guided me:\n\n \" Our true mentor in life is science.\" \nM.K.Ataturk");
		
		/*escape characters \escapecharacter
		 * \t  :tab
		 * \n:new line
		 * \' single quote
		 * \" double quote
		
		*/
		

	}

}
