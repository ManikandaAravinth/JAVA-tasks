import java.util.Scanner;
class ElseIflader{

	public static void main(String args[]){
		Scanner Lader = new Scanner(System.in);
	System.out.println("Enter your Mark");
		int Mark = Lader.nextInt();
	
		if((Mark>=0) && (Mark<=39)){
	System.out.println("Your grade is D");
}
		else if ((Mark >=40) && (Mark<=59)){
	System.out.println("Your grade is C");
}
		else if ((Mark >=60) && (Mark<=79)){
	System.out.println("Your grade is B");
}
		else if ((Mark >=80) && (Mark<=89)){
	System.out.println("Your grade is A");
}
		else if ((Mark >=90) && (Mark<=100)){
	System.out.println("Your grade is O");
}
		else {
	System.out.println("Enter a valid morks only");
}
}
}