import java.util.Scanner;
class kgm{
	public static void main(String args[]){

	Scanner Kgm = new Scanner(System.in);

	System.out.println("Input first number:");
	int first_number = Kgm.nextInt();
	Kgm.nextLine();

	System.out.println("Input second number:");
	int second_number = Kgm.nextInt();
	Kgm.nextLine();

	System.out.println(first_number*second_number);

}
}