package Oops;

class A2{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void subtract(int a,int b)
	{
		System.out.println(a-b);
	}
}
class B2 extends A2{
	@Override
	void sum(int a,int b)
	{
		super.sum(3, 5);
		super.subtract(8, 4);
		System.out.println("Sum of numbers:"+(a+b));
	}
	@Override
	void subtract(int a,int b)
	{
		System.out.println("Subtraction of numbers:"+(a-b));
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b=new B2();
		b.sum(2, 3);
		b.subtract(5, 4);

	}

}
