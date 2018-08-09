package training;

public class Person implements Cloneable{

	private String name;
	private int age;
	static Person p;

	public Person() {
//		this.name = "anaonyous";
//		this.age = -1;
		this("anonymous",-1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name" + name+ "age"+ age;
	}

	public void print() {
		System.out.println("name\t" + name + "\tage" + age);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person)
		{
			Person p=(Person)obj;
			if(this.name.equals(p.name)&&age== p.age)
			 return true;
		}
	
			return false;
	}

	@Override
	public void finalize() throws Throwable {
		System.out.println("person is no more");
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person("polo", 21);
    	Person p2 =  (Person)p.clone();
    	System.out.println(p.toString());
//		p.print();
		//Person p1 = new Person();
		//System.out.println(p1.toString());
//		System.out.println(p.hashCode());
//		System.out.println(p2.hashCode());
//		System.out.println(p.equals(p2));
		//Person p = null;
//		System.out.println(p);
//		for(int c=1;c<=5;c++)
//			p=new Person();
//		System.gc();
		
		//p1.print();
	}

}
