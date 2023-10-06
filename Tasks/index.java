/* single dimention array,two dimention aray, multi dimentional array

   systax
   ^^^^^^
	datatype variablename[] = new datatype[size];

   example
   ^^^^^^^ 
	int a[] = new int[5];

   example direct initialization 
   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	int a[] = {12, 13, 23, 5, 9, 143};
	S.o.pln(a.length); */

import java.util.Scanner;
class Index
{
	public static void main(String args[])
{ 
	Scanner sr = new Scanner(System.in);
	int arr[] = new int[5];

int a[] = {14, 15, 25};

	for (int i = 0; i<=a.length; i++)
	{
	System.out.println(a[i]);
	}
	System.out.println("array values are:");
	for (int i = 0; i<=a.length; i++)
{
	arr[i] = sr.nextInt();
}
	int max = 0;
	for(int i = 0;i<arr.length;i++)
{
	if(max<arr[i])
{
	max = arr[i];
}}
	System.out.println("max value:" + max);
}
}