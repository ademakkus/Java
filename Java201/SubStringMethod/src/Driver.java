
public class Driver {

	public static void main(String[] args) {
		
		String dosyaIsmi="belgem.doc";
		
		int uzunluk=dosyaIsmi.length();
		System.out.println("Uzunluk:"+uzunluk);
		String uzanti=dosyaIsmi.substring(uzunluk-3, uzunluk);
		System.out.println("Dosya uzantısı:"+uzanti);
		System.out.println("dosya ismi:"+dosyaIsmi.substring(0, 6));
		
		int noktaIndexOf=dosyaIsmi.indexOf(".");
		String uzanti2=dosyaIsmi.substring(noktaIndexOf+1,uzunluk);
		System.out.println("Uzantı 2:"+uzanti2);
		
		String metin="    Merhaba    dünya           ";
		System.out.println(metin.length());
		System.out.println(metin.trim());
		System.out.println(metin.trim().length());
		System.out.println("\"Java\" is programming language.");
		System.out.println("c:\\belglerim\\metin.doc");
		
	}

}
