import java.util.Scanner;
public class Evennum
{


public static void findEvenOdd(int num){

if(num%2==0){
System.out.println(num+"is Even");
}else{
System.out.println(num+"is Odd");
}
}
public static void main(String args[]){


Scanner scan = new Scanner(System.in);
System.out.println("Enter the number:");


int num = scan.nextInt();


findEvenOdd(num);

}
}