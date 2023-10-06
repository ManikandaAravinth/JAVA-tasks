class St18 implements Cloneable{
int rollno;
String name;

	St18(int rollno, String name){
	this.rollno = rollno;
	this.name = name;
}

	public Object clone()throws CloneNotSupportedException{
	return super.clone();
}
	public static void main(String args[]){
	try{
	St18 s1 = new St18(101,"amit");

	St18 s2 = (St18)s1.clone();

	System.out.println(s1.rollno+" "+s1.name);

	System.out.println(s2.rollno+" "+s2.name);

	}catch(CloneNotSupportedException c){}
}

}