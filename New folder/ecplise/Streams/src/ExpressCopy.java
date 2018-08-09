import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ExpressCopy {
	
	public static void main(String[] args) {
		Path sourceFile = Paths.get("D:/vsc.exe");
		Path targetFile = Paths.get("D:/vsco.exe");
		long startTime = System.currentTimeMillis();
		 
		try {
		 
		    Files.copy(sourceFile, targetFile);
		 
		} catch (IOException ex) {
		    System.err.format("I/O Error when copying file");
		}
		System.out.println("Time:"+(System.currentTimeMillis()-startTime));
	}

}
