import java.util.Scanner;
class IfStatement{

	public static void main(String args[]){
		Scanner If = new Scanner(System.in);
	System.out.println("Enter your age");
		int age = If.nextInt();
	
		if(age<18){
	System.out.println("Not eligible for voting");
}
		if (age>=18){
	System.out.println("You are eligible for voting");
}

}
}