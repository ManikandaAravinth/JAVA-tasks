class StringMethods{

	public static void main(String args[]){

	String str1 = "Batch-17 is toxic";

	// to check whether string obeject contains the given value or not.
	System.out.println("contains():" + str1.contains("toxic"));

	// to check whether string object equals the given value or not.
	System.out.println("equals():" + str1.equals("Batch-17 is toxic"));

	// to check whether string obeject .
	System.out.println("equalsIgnoreCase():" + str1.equalsIgnoreCase("Batch-17 is Toxic"));

	// to check whether string obeject equals the given value or not.
	System.out.println("concat():" + str1.concat(", but sometimes \"Sweet!\""));

	// to check whether string obeject equals the given value or not.
	System.out.println("toUpperCase():" + str1.toUpperCase());

	// to check whether string obeject equals the given value or not.
	System.out.println("toLowerCase():" + str1.toLowerCase());

	// to check whether string obeject equals the given value or not.
	System.out.println("charAt():" + str1.charAt(5));

	//To check whether the string object equals given value or not. 
	System.out.println("compareTo(): " + str1.compareTo("Batch-17 is toxic")); 
	
	//To check whether the string object equals given value or not. 
	System.out.println("compareToIgnoreCase(): " + str1.compareToIgnoreCase("Batch-17 is toxic ")); 

	//To check whether the string object equals given value or not. 
	System.out.println("indexOf(): " + str1.indexOf('B')); 

	//To check whether the string object equals given value or not. 
	System.out.println("isEmpty(): " + str1.isEmpty()); 

	//To check whether the string object equals given value or not. 
	System.out.println("replace(): " + str1.replace("toxic", "Sweet")); 

	//To check whether the string object equals given value or not. 
	System.out.println("substring(): " + str1.substring(2, 8)); 

	//To check whether the string object equals given value or not. 
	System.out.println("trim(): " + str1.trim()); 

	//To check whether the string object equals given value or not. 
	System.out.println("hashCode(): " + str1.hashCode()); 

	//To check whether the string object equals given value or not. 
	System.out.println("format(): " + String.format("%d",5)); 

	//To check whether the string object equals given value or not. 
	System.out.println("join(): " + str1.join("*","Mithun","Sailesh","Bharathi")); 

	//To check whether the string object equals given value or not. 
	System.out.println("replaceAll(): " + str1.replaceAll("i", "A")); 

	//To check whether the string object equals given value or not. 
	//System.out.println("split(): " + str1.split());





}
}