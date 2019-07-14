
public class examplesStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Sherlock";
		String lastName = "Holmes";
		System.out.println(firstName + " " + lastName);
		
		String solveTwice = stringMultiplied("Solve this mystery!" + " ", 2);
		System.out.println(solveTwice);
		System.out.println(firstName.concat(lastName));
		System.out.println("Example of string immutable:");
		firstName.concat(lastName);
		System.out.println(firstName);
		System.out.println("Will not concat unless variable reassigned:");
		firstName = firstName.concat(lastName);
		System.out.println(firstName);
		System.out.println("StringBuilder should be used for often-repeated variables:");
		StringBuilder fullName = new StringBuilder("Lock");
		fullName.append(" Holmes");
		System.out.println(fullName.toString());
//using.chatAt
//		System.out.println(fullName.charAt(6));
//		System.out.println(fullName.deleteCharAt(5));
//		System.out.println(fullName.delete(4, 7));
//		System.out.println(fullName.indexOf("me"));
		System.out.println(fullName.replace(5, 11, "Yurts"));
		System.out.println(fullName.reverse());
	}
//	public static String stringMultiplied(String str, int num) {
//		String result = " ";
//		for (int i = 0; i < num; i++) {
//			result += str;
//		}
//		return result;
	//StringBuilder approach:
	public static String stringMultiplied(String str, int num) {
	StringBuilder result = new StringBuilder();
	for (int i = 0; i < num; i++) {
		result.append(str);
	}
	return result.toString();
	
	}
}
