import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Driver {

	public static void main(String[] args) {
	File inputFile=new File("lorem.txt");
	File outputFile=new File("lorem_out.txt");
if (inputFile.exists()) {
	FileInputStream fileInputStream=null;
	FileOutputStream fileOutputStream=null;
	try {
		fileInputStream=new FileInputStream(inputFile);
		fileOutputStream=new FileOutputStream(outputFile);
		int c=0;
		int byteCount=0;
		while((c=fileInputStream.read())!=-1) {
			System.out.print(c+"-");
			byteCount++;
			char ch=(char)c;
			fileOutputStream.write(Character.toUpperCase(ch));
		}
		System.out.println("\nbyte count:"+byteCount);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		if(fileInputStream!=null) {
			try {
				fileInputStream.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		if(fileOutputStream!=null) {
			try {
				fileOutputStream.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
	}
	
		
	
}
else {
	System.out.println("Dosya bulunamadı.");
}	
	}

}
