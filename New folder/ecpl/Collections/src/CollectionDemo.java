import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Oracle");
		v.add("Microsoft");
		v.add("Google");
		v.add("Apple");
		v.add("IBM");
	

		System.out.println("--- Iteration over vector using for Each");
		for (String elen : v) {
			System.out.println(elen);
		}
		System.out.println("---- Itration over vector using iterator");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		LinkedList<String> lst = new LinkedList<>();
		lst.add("Tesla");
		lst.add("Apache");
		lst.addFirst("Apple");

		v.addAll(lst);
		System.out.println("---- Iterating over updated vectoe for each");
		for (String elen : v) {
			System.out.println(elen);
		}
		//vector to set
		HashSet<String> set=new HashSet<>(v);
		System.out.println("foreach hash");
		for(String elem:set)
			System.out.println(elem);
		System.out.println();
		
		//set to treeset
		TreeSet<String> tree=new TreeSet<>(set);
		System.out.println("for each tree");
		//tree.descendingSet();
		for(String elem:tree.descendingSet())
			System.out.println(elem);
		
		System.out.println("iterating over treeset using java 8 foreach");
		//new way to iterate in java8
		tree.forEach(System.out::println);
		
		//converting array to collection
		System.out.println();

		String[] week= {"sun","mon","tue","wed","thu","fri","sat"};
		List<String> days=Arrays.asList(week);
		days.forEach(System.out::println);
	}

}
