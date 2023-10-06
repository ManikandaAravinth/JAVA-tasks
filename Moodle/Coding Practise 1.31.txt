import java.util.Scanner;

class Marks{
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int rollno = sc.nextInt();
	
	int m1 = sc.nextInt();
	int m2 = sc.nextInt();
	int m3 = sc.nextInt();
	void sum(){
	int c = m1+m2+m3;
	float d = (c*100)/300;
	System.out.println("Total="+c);
	System.out.println("Percentage="+d);
	if ((d>40)&&(d<50)){
	System.out.println("Grade=C");
	}else if((d>50)&&(d<60)){
		System.out.println("Grade=B");
	}
	else if((d>60)&&(d<70)){
		System.out.println("Grade=A");
	}
	else if((d>70)&&(d<80)){
		System.out.println("Grade=S");
	}
	else if((d>80)&&(d<100)){
		System.out.println("Grade=O");
	}
	}

	
	void display(){
	System.out.println("Student ID:"+rollno);
	System.out.println("Student Name:"+name);
	System.out.println("m1="+m1);
	System.out.println("m2="+m2);
	System.out.println("m3="+m3);
	
	}
public static void main(String args[]){
	Marks a = new Marks();
	a.display();
	a.sum();
	
}
	
}