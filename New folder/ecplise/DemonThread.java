
public class DemonThread extends Thread {
	
	private int limit;

	public DemonThread(String name,int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	public void run() {
		String name=currentThread().getName();
		for(int c=1;c<=limit;c++)
			  System.out.println(name+c);
	}
	public static void main(String[] args) {
		DemonThread t1=new DemonThread("Alpha",50);
		DemonThread t2=new DemonThread("Bravo",25);
		DemonThread t3=new DemonThread("Charlie",75);
		DemonThread t4=new DemonThread("Demon",500000);
		t4.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

	
	

}
