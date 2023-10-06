class Sample{

//static's memeory is constant but value is changed
static int count = 0;
	int c =100;

	Sample()
	{
	 count ++;
	System.out.println(count);
}
	void sum()
{
	int a = 5,b = 10;
	System.out.println("sum value:" +(a+b));
}
	static void display()
{
	System.out.println("Hi Hello" + count);
}
	static void display()
	public static void main(String magil[])

{

	Sample obj = new Sample();
obj.sum();
	display();
	Sample obj1 = new Sample();
	Sample obj2 = new Sample();

	System.out.println(magil[0] + magil[1] + magil[2]);
}

}