class Sample1{

	private static String str = "Have a greatday";
	
	static class Sample_inner
{
	public void display()
	{
	System.out.println(str);
	}
}
	public static void main(String args[])
	{
	Sample1.Sample_inner obj = new Sample1.Sample_inner();
	obj.display();
	}
}