import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteOku {

	
	public static void main(String[] args) throws IOException {
		File file=new File("logo.png");
		System.out.println(file.exists());
		System.out.println("Absolute path:"+	file.getAbsolutePath());
		System.out.println("Canonical Path:"+file.getCanonicalPath());
		System.out.println("File Name:"+file.getName());
		System.out.println("File Parent: "+file.getParent());
		System.out.println("File Path : "+file.getPath());
		
		if(file.exists()) {
			FileInputStream fileInputStream=null;
			try {
				fileInputStream=new FileInputStream(file);
				byte[] buffer=new byte[1024];
				fileInputStream.read(buffer);
				int length=0;
				while((length=fileInputStream.read(buffer))!=-1) {
					System.out.println(Arrays.toString(buffer));
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			finally {
				if(fileInputStream!=null)
					try {
						fileInputStream.close();
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
			}
		}
		

	}

}
