
public class Car {
  private String model;
  private String[] features;
public Car(String model, String... features) {
	this.model = model;
	this.features = features;
}
  
 public void specs()
 {
	 System.out.println("features of "+model);
	 for(String features:features)
		 System.out.println(features);
 }
 
 public static void main(String[] args) {
	Car alto=new Car("alto","power steering","power window","keyless entry");
	alto.specs();
	
	Car jazz=new Car("jazz","keyless start","abs","panoff","keyless entry");
	jazz.specs();
	
	
}
}
