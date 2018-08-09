import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedStudent {
public static void main(String[] args) throws Exception {
	Student polo = new Student(39,74,45);
	polo.result();
	
	String file="D:/New folder/student1.dat";
	//serialization code
	FileOutputStream fstream = new FileOutputStream(file);
	ObjectOutputStream ostream = new ObjectOutputStream(fstream);
	ostream.writeObject(polo);
	ostream.close();
	fstream.close();
	
	//deserialization code
	
	ObjectInputStream istream = new ObjectInputStream(new FileInputStream(file));
	Object obj =istream.readObject(); //student deserialized
	Student student = (Student) obj;
	student.result();
	istream.close();
	
}
}
