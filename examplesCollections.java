import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class examplesCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List - interface / type of collection
//common implementations: ArrayList, LinkedList, Vector
//allows duplicates, keeps elements ordered by index, allows null values
//use when you have duplicates and want to keep vales in a certain order
	List<String> jobTitles = new ArrayList<String>();
	jobTitles.add("teacher");
	jobTitles.add("pilot");
	jobTitles.add("teacher");
	jobTitles.add("null");
	
	for (String job : jobTitles) {
		System.out.println(job);
	}
	System.out.println(jobTitles.get(0));
	System.out.println(jobTitles.get(2));
	
//Set - does not allow duplicates, does not order elements, allows null
//also an interface, cannot instantiate
//common implementations: HashSet, LinkedHashSet, TreeSet
//use when you have no duplicates and order does not matter
	Set<String> seaStuff = new HashSet<String>();
	seaStuff.add("Shell");
	seaStuff.add("Water");
	seaStuff.add("Shell");
	seaStuff.add("null");
	System.out.println(seaStuff.size());
	System.out.println(seaStuff.contains("Shell"));
	if (seaStuff.contains("Shell")) {
		seaStuff.remove("Shell");
	}
	for (String stuff : seaStuff) {
		System.out.println(stuff);
		
//Maps - Key value pairs (key, value)
//uses put rather than add
//values can have duplicates, keys cannot
//common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
//use when you need to associate key value pairs
	}
	Map<Integer, String> beverageChoices = new HashMap<Integer, String>();
	beverageChoices.put(1, "Orange Juice");
	beverageChoices.put(2, "Water");
	beverageChoices.put(3, "Coffee");
	beverageChoices.put(4, "Null");
	
	beverageChoices.remove(1);

	System.out.println(beverageChoices.get(1));
	Set<Integer> beverageKeys = beverageChoices.keySet();
	for (Integer key : beverageKeys) {
		System.out.println(key + " : " + beverageChoices.get(key));
		beverageChoices.size();
	Collection<String> beverages = beverageChoices.values();
		for (String beverage : beverages) {
			System.out.println(beverage);
		}
	
	}
}
}	

	
	
	