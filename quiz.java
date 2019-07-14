import java.util.ArrayList;
import java.util.List;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	List<String> animals = new ArrayList<String>();
	animals.add("goat");
	animals.add("kangaroo");
	animals.add("otter");
	animals.add("lion");

	for (int i = 0; i < animals.size(); i+=2) {
		System.out.println(animals.get(i));
}
	}
	}