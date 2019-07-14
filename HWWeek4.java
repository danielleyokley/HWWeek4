import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HWWeek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Create an instance of an ArrayList of String called employeeNames
//4. Add at least five entries to the employeeNames and ids 
		 List<String> employeeNames = new ArrayList<String>();
		 employeeNames.add("Hannah");
		 employeeNames.add("Garrett");
		 employeeNames.add("Malcom");
		 employeeNames.add("Morgan");
		 employeeNames.add("Brooke");
//2. Create an instance of a HashSet of Integer called ids
		 Set<Integer> ids = new HashSet<Integer>();
		 ids.add(327780);
		 ids.add(327781);
		 ids.add(327782);
		 ids.add(327783);
		 ids.add(327784);
//3. Create an instance of a HashMap of Integer, String called employeeMap
		 Map<Integer, String> employeeMap = new HashMap<Integer, String>();
//5. Enhanced for loop 
		 int i = 0; 
			for (Integer id : ids) {
				employeeMap.put(id, employeeNames.get(i));
				i++;
			}	
//6. Once the employeeMap is fully populated, use another enhanced for loop to iterate over the employeeMap.keySet()
			System.out.println(employeeMap);
			for (Integer employee : employeeMap.keySet()) {
				System.out.println(employee + " " + employeeMap.get(employee));
			}
//7. Create a StringBuilder called idsBuilder.
// and 8. Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
// and 9. Print the result of idsBuilder.toString() to the console.
			
			StringBuilder idsBuilder = new StringBuilder();
			for (Integer id : ids) {
				idsBuilder.append(id + "--");
			}
			System.out.println(idsBuilder.toString());	
//10. Create another StringBuilder called namesBuilder.
//11. Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
//12. Print the result of namesBuilder.toString() to the console.

			StringBuilder namesBuilder = new StringBuilder();
			for (String name : employeeNames) {
				namesBuilder.append(name + " ");
			}
			System.out.println(namesBuilder.toString());
}

	}