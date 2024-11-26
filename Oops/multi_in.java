package Oops;
class Rectangle{
	int lenght;
	int breadth;
	//constructor overloading
	Rectangle()
	{
		System.out.println("Rectangle class constructor");
	}
	void areaOfrectangle()
	{
		System.out.println(lenght*breadth);
	}
}
class triangle extends Rectangle{
	int height;
	triangle()
	{
		System.out.println("Triangle class constructor");
	}
	void areaOftriangle()
	{
		System.out.println(lenght*breadth*height);
	}
	
}
class circle extends triangle{
	int rdius;
	circle()
	{
		System.out.println("circle class constructor");
	}
	void areaOfcircle()
	{
		System.out.println(3.14*rdius*rdius);
	}
}
public class multi_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle t=new triangle();
		t.lenght=6;
		t.breadth=7;
		t.height=8;
		t.areaOftriangle();
		circle c=new circle();
		c.rdius=5;
		

	}

}
