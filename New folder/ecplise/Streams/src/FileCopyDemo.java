import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:/vsc.exe");
		FileOutputStream out = new FileOutputStream("D:/vsc2.exe");
		long startTime = System.currentTimeMillis();
		int ch =0;
		while(true) {
			ch=fis.read();
			if(ch==-1)break;
			out.write(ch);
		}
		System.out.println("Time:"+(System.currentTimeMillis()-startTime));
		out.close();
		fis.close();
	}
}
