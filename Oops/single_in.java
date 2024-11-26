package Oops;

import Oops.A;
import Oops.B;

class A{
	int x=5;
	void printx()
	{
		System.out.println(x);
	}
}
class B extends A{
	int y=10;
	void printy()
	{
		System.out.println(y);
	}
}
public class single_in {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//note:-
		//by creating the child class object we can access the properties of a parent class
		//but by creating the parents class object we can not access the properties of a child class 
		A a=new A();
		System.out.println(a.x);
		a.printx();
	

		//System.out.println(a.y);error
		B b=new B();
		System.out.println(b.y);
		b.printy();
		System.out.println(b.x);
		b.printx();
	}

}