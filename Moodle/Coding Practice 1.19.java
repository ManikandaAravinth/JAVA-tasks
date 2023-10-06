import java.util.Scanner;
class kgm{
	public static void main(String[] args){

	System.out.println("Enter the First Integer : ");
	Scanner sc = new Scanner(System.in);

	int fint = sc.nextInt();

	System.out.println("Enter the Second Integer : ");
	int sint = sc.nextInt();

	System.out.println(fint + sint);
	System.out.println(fint - sint);
	System.out.println(fint * sint);
	System.out.println((fint + sint)/2);
	System.out.println(fint - sint);
	System.out.println(Math.max(fint , sint));
	System.out.println(Math.min(fint , sint));




}

}