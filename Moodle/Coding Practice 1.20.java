import java.util.Scanner;
public class kgm{

	public static void main(String[] args){

	System.out.println("Enter a integer : ");
	Scanner sc = new Scanner(System.in);
	int fint = sc.nextInt();

	if(fint > 0){
		System.out.println("Number is positive");
	}
	else if(fint < 0){
		System.out.println("Number is negative");
	}
	else{
		System.out.println("Number is zero");
	}

}
}