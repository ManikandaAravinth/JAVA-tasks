import java.lang.Math;

class MathExample{

	public static void main(String args[]){

//gives the absolute value of the data.
	System.out.println("abs():" + Math.abs(-12.2));

//gives the cuberoot value of the data.
	System.out.println("cbrt():" + Math.cbrt(8));

//gives the squreroot value of the data.
	System.out.println("sqrt():" + Math.sqrt(4));

//gives the sign of the number.(signum = sign + Num)
	System.out.println("signum():" + Math.signum(-12.2));

//gives the round of intiger.
	System.out.println("rint():" + Math.rint(-12.6));

//gives the nearest value. (ceiling number)
	System.out.println("ceil():" + Math.ceil(-1.87));

	System.out.println("ceil():" + Math.ceil(0.87));

//gives the groud value.
	System.out.println("floor():" + Math.floor(-12.6));

//gives the random value.
	System.out.println("random():" + Math.random());

//gives to the power of second value.
	System.out.println("pow():" + Math.pow(5,2));

//gives the max & Min value.
	System.out.println("max():" + Math.max(-2,2));

	System.out.println("min():" + Math.min(-2,2));

//gives the sign only from second parameter.
	System.out.println("copySign():" + Math.copySign(-5,2));


//gives the exponensiation .
	System.out.println("exp():" + Math.exp(2));

//gives the exponensiation minus 1.
	System.out.println("expm1();" + Math.expm1(2));

//gives the exponensiation .
	System.out.println("getExponent():" + Math.getExponent(2));

//Pythagorean theorem .
	System.out.println("hypot():" + Math.hypot(3,2));

//IEEE 754 formula (a/b= value & a-(b*value).
	System.out.println("IEEEremainder():" + Math.IEEEremainder(6,2));


//get the values next and after.
	System.out.println("nextAfter():" + Math.nextAfter(3,2));

//get the values next and after.
	System.out.println("nextUp():" + Math.nextUp(8.5));


//get the values next and after.
	System.out.println("round():" + Math.round(8.5));

	System.out.println("acos():" + Math.acos(-1));

	System.out.println("asin():" + Math.asin(-1));

	System.out.println("atan():" + Math.atan(-1));

	System.out.println("atan2():" + Math.atan2(1, 2.5));

	System.out.println("cos():" + Math.cos(1));

	System.out.println("cosh():" + Math.cosh(1));

	System.out.println("log():" + Math.log(10));

	System.out.println("log10():" + Math.log10(10));

	System.out.println("sin():" + Math.sin(0.2));

	System.out.println("sinh():" + Math.sinh(2.5));

	System.out.println("tan():" + Math.tan(2.5));

	System.out.println("tanh():" + Math.tanh(2.5));

	System.out.println("toDegrees():" + Math.toDegrees(Math.PI/4));

	System.out.println("toRadians():" + Math.toRadians(45));

	System.out.println("ulp():" + Math.ulp(1234.567));





}
}