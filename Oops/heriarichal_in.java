package Oops;
class A1{
	int x=5;
}
class B1 extends A1{
	int y=10;
}
class C extends A1{
	int z=15;
}
public class heriarichal_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a=new A1();
		System.out.println(a.x);
		B1 b=new B1();
		System.out.println(b.x);
		System.out.println(b.y);
		C c=new C();
		System.out.println(c.x);
		System.out.println(c.z);


	}

}
