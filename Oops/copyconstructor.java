package Oops;
class A3{
	int x;
	int y;
	A3(){
		this.x=5;
		this.y=10;
		System.out.println(" i am default constructor");
	}
	A3(int a,int b){
		this.x=a;
		this.y=b;
		System.out.println(" i am parametrized constructor");
	}
	A3(A3 a)
	{
		x=a.x;
		y=a.y;
		System.out.println(" i am copy constructor");
	}
	void display() {
		System.out.println(" value of x:"+x);
		System.out.println(" value of y:"+y);
	}
	@Override
	public String toString() {
		return "A3 [x=" + x + ", y=" + y + "]";
	}
	
	
}
public class copyconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 a=new A3();
		a.display();
		System.out.println(a);
		A3 b=new A3(10,30);
		System.out.println(b.x);
		System.out.println(b.y);
		A3 c=new A3(a);
		System.out.println(c.x);
		System.out.println(c.y);

	}

}
