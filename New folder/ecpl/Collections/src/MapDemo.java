import java.util.HashMap;

public class MapDemo {
  public static void main(String[] args) {
	 HashMap<String,String> map=new HashMap<>();
	 map.put("jack","jill");
	 map.put("scot", "stainer");
	 map.put("tiger", "duke");
	 map.put("jack1", "rose");
	 
	 for(String key:map.keySet())
		  System.out.println(key+":"+map.get(key));
	 
}
}
