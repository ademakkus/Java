
public class Driver {

	public static void main(String[] args) {
		String sehir1="ankara";
		String sehir2="ankara";
		int result=sehir1.compareTo(sehir2);
		if(result==0)
			System.out.println("Strings are equal.");
		else
			System.out.println("Strings are NOT equal.");
		
		System.out.println("abc".equals("ABC"));
		System.out.println("abc".equalsIgnoreCase("ABC"));
		
		boolean result2=sehir1.equals(sehir2);
		if(result2)
			System.out.println("Same");
		else
			System.out.println("Not same");
		String greeting="Merhaba Ramadan Ramadan Ramadan";
		
		int indexOfd=greeting.indexOf("Ram");
		System.out.println(indexOfd);
		int lastIndexOfRam=greeting.lastIndexOf("Ram");
		System.out.println(lastIndexOfRam);
		
		String newGreeting=greeting.replace('d', 'z');
		System.out.println(newGreeting);
				
		
	}

}
