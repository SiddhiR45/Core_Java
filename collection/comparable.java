package collection;

import java.util.ArrayList;
import java.util.Collections;

public class comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(5);
			al.add(3);
			al.add(2);
			al.add(4);
			al.add(1);
			Collections.sort(al);
			System.out.println(al);
			
			ArrayList<Employee> al1=new ArrayList<Employee>();
			Employee e1=new Employee(3,"john",35000);
			Employee e2=new Employee(2,"ram",40000);
			Employee e3=new Employee(1,"jack",30000);
			al1.add(e1);
			al1.add(e2);
			al1.add(e3);
			Collections.sort(al1);
			System.out.println(al1);
	}

}
