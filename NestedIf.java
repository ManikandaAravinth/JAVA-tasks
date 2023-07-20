import java.util.Scanner;
class NestedIf{
	public static void main(String args[]){
		Scanner Nested = new Scanner(System.in);
	System.out.println("Enter your age");
		int Age = Nested.nextInt();
		if(Age<=17){
	System.out.println("You are elligible to join Our Clg");

	System.out.println("Enter your 12th Percentage");
		int Percent = Nested.nextInt();
		if(Percent<=60){
	System.out.println("You are elligible to join Our Clg");

	}else {System.out.println("Konjam Nalla Padichirukalam");}



	}else {System.out.println("your age not elligible to join this clg");}


}
}