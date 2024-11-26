package Oops;

class Student{
	int rno;
	String name;
	String address;
	int age;
	static String college_name="rj college";
	public Student(int rno,String name,String address,int age)
	{
		this.rno=rno;
		this.name=name;
		this.address=address;
		this.age=age;
	}
	void getValue()
	{
		System.out.println("rno:-"+rno);
		System.out.println("name:-"+name);
		System.out.println("address:-"+address);
		System.out.println("age:-"+age);
		System.out.println("College name:-"+college_name);
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}
class Aa{
	static void sum() { 
		System.out.println("sum method A class");
	}
	static void sum(int a) { 
		System.out.println("sum method A class");
	}
	void subtract()
	{
		System.out.println("subtract method A class");
	}
}
class Bb extends Aa{
	static void sum() { 
		System.out.println("sum method B class");
	}
	void subtract()
	{
		super.subtract();
		System.out.println("subtract method B class");
	}
	
}
public class static_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Vaishanvi","Khar",21);
		Student s2=new Student(2,"Rahee","Jogeshwari",21);
		Student s3=new Student(3,"Siddhi","Nallasopara",20);
		s1.getValue();
		s2.getValue();
		s3.getValue();
		Aa.sum();
		Bb.sum(1);
		Aa a=new Aa();
		a.subtract();
		Bb b=new Bb();
		b.subtract();
	}

}
