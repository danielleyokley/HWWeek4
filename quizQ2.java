import java.util.HashMap;
import java.util.Map;

public class quizQ2 {
//Write a method that takes a Map<String, String>. Return a List<String> 
//containing every value of the Map where the key starts with 'A'.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Map<String, String> buyFood = new HashMap<String, String>();
	    buyFood.put("Apples", "Buy 3");
	    buyFood.put("Bananas", "Buy 6");
	    buyFood.put("Eggs", "Buy 12");
	    buyFood.put("Avocado", "Buy 2"); 
	   
	for(String key : buyFood.keySet()) {
		   if(! key.startsWith("A")) {
		       return;
		   }
}}
}
