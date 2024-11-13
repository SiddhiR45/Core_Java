package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();//list add method of collection also and own also
		l.add(2);
		l.add(1, 3);
		l.addFirst(1);
		l.add(4);
		l.addLast(8);
		l.add(null);
		l.add(null);
		System.out.println(l);
		
		ArrayList l1=new ArrayList();
		l1.add(1);
		addfirst(l1, 0);
		System.out.println(l1);
		addlast(l1, 2);
		System.out.println(l1);
		l1.addFirst(-1);
		l1.addLast(3);
		System.out.println(l1);
		
	}
	static void addfirst(ArrayList<Integer> a,int element) {
		a.add(0, element);
	}
	static void addlast(ArrayList<Integer> a,int element) {
		a.add(a.size(), element);
	}

	
	
		
	
}
