import java.util.ArrayList;
import java.util.List;

public class examplesLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] games = new String[3];
		games[0] = "Clue";
		games[1] = "Jenga";
		games[2] = "Monopoly";
//Lists allows us to store data with less limitations than an array
//List is an interface; objects can't be created from a list
//Objects are created from a class that implements lists
//Dynamic- does not have to define amount of variables	
	List<String> animals = new ArrayList<String>();
	animals.add("goat");
	animals.add("kangaroo");
	animals.add("otter");
	animals.remove(1);
	
	for (int i = 0; i < animals.size(); i++) {
		System.out.println(animals.get(i));
//you can iterate over each element with enhanced for loop
	}
	for (String animal : animals) {
		System.out.println(animal);
	}
//Cannot use a primitive data type/ use objects - corresponding class (Auto Boxing)
	List<Integer> numbers = new ArrayList<Integer>();
	}
}
