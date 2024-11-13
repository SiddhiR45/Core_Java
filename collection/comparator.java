package collection;

import java.util.ArrayList;
import java.util.Collections;

public class comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> al1=new ArrayList<Employee>();
		Employee e1=new Employee(3,"john",45000);
		Employee e2=new Employee(2,"ram",40000);
		Employee e3=new Employee(1,"jack",30000);
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		Collections.sort(al1, new IdComparator());
		System.out.println(al1);
		

		ArrayList<Employee> al2=new ArrayList<Employee>();
		al2.add(e1);
		al2.add(e2);
		al2.add(e3);
		Collections.sort(al2, new nameComparator());
		System.out.println(al2);
		
		ArrayList<Employee> al3=new ArrayList<Employee>();
		al3.add(e1);
		al3.add(e2);
		al3.add(e3);
		Collections.sort(al3, new salaryComparator());
		System.out.println(al3);

	}

}
