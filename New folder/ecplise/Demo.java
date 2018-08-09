
public class Demo<z> {
	private z data;

	public Demo(z  data) {
		this.data = data;
	}
	public  z getData() {
		return data;
	}
	public void setData(z data) {
		this.data = data;
	}
	public static void main(String[] args) {
		Demo d1=new Demo<String> ("hello");
		d1.setData(1000);
		System.out.println(d1.getData());
		
		Demo d2=new Demo(4000);
		d2.setData("bye");
		System.out.println(d2.getData());
	}
	

}
