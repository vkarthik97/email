import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileFastCopyDemo {
	public static void main(String[] args) throws IOException {
		BufferedInputStream fis =new BufferedInputStream( new FileInputStream("D:/vsc.exe"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:/vsc2.exe"));
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
