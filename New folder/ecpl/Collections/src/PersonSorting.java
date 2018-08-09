import java.util.TreeSet;

public class PersonSorting {
	public static void main(String[] args) {
		//TreeSet<Person> persons=new TreeSet<>();
		
		TreeSet<Person> persons=new TreeSet<>((p1,p2) -> p1.getAge() -p2.getAge());
		
		persons.add(new Person("polo",23));
		persons.add(new Person("lili",22));
		persons.add(new Person("milli",21));
		
		persons.forEach(System.out::println);
		
			
	}

}
