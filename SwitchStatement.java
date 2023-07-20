import java.util.Scanner;
class SwitchStatement{

	public static void main(String args[]){
		Scanner Switch = new Scanner(System.in);
	System.out.println("enter your Day");
	int Day = Switch.nextInt();

	switch(Day){
	case 1:
	System.out.println("Sunday");
break;
	case 2:
	System.out.println("Monday");
break;
	case 3:
	System.out.println("Tuesday");
break;
	case 4:
	System.out.println("Wendnesday");
break;
	case 5:
	System.out.println("Thursday");
break;
	case 6:
	System.out.println("Friday");
break;
	case 7:
	System.out.println("Satday");
break;
default:
	System.out.println("Days not enough");
}
}
}
	
