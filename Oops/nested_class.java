package Oops;
//import  Oops.P.Q;
//import  Oops.P.Q.D;
class P{
	class Q{
		class D{
			void sum() {
				System.out.println("sum method");
			}
		}
		void display() {
			System.out.println("I am display method! ");
		}
	}
}
class X{
	static class Y{
		static class Z{
			void sum() {
			System.out.println("sum method of z");
			}
		}
		void display()
		{
			System.out.println("Display method of Y");
		}
	}
}
public class nested_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		P p=new P();
//		Q q=p.new Q(); 
//		q.display();
//		D d=q.new D();
//		d.sum();
		
		P p=new P();
		P.Q q=p.new Q();
		q.display();
		P.Q.D d=q.new D();
		d.sum();
		X.Y x1=new X.Y();
		x1.display();
		X.Y.Z x2=new X.Y.Z();
		x2.sum();
	}

}
