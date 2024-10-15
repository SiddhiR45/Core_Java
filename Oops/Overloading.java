package Oops;
class Sum{
	void sum(int a,int b) {
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
class Vehicle{
	String movement;
	void movement(int a) {
		if(movement.equals("road")) {
			System.out.println("Running");
		}
	}
	void movement(int a,int b) {
		if(movement.equals("water")) {
			System.out.println("Sailing");
		}
	}
	void movement(int a,int b, int c) {
		if(movement.equals("sky")) {
			System.out.println("Flying");
		}
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s=new Sum();
		s.sum(5, 6);
		s.sum(5, 6, 7);
		Vehicle v=new Vehicle();
		v.movement="water";
		v.movement(5, 6);
	}

}
