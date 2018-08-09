import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo  {
	public static void main(String[] args) throws Exception {
		String file="src/person.info";
		
		Properties p=new Properties();
		p.load(new FileReader(file));
		
		System.out.println("name:"+p.getProperty("name"));
		System.out.println("dob:"+p.getProperty("dob"));
		//for(String prop:)
		
	}

}
