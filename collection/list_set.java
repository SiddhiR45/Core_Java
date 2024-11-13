package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class list_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//difference between list and set
		//list contain value in same order which given by user
		//it is index base 
		List<Integer> l=new ArrayList();//list add method of collection also and own also
		l.add(2);
		l.add(1, 3);
		l.addFirst(1);
		l.addLast(4);
		l.add(4);
//		l.add(null);
//		l.add(null);
		System.out.println(l);
		
		
		System.out.println("------------------------------------");
		//by using for each
		for(Integer i:l) {
			System.out.println(i);
		}
		
		l.add(2);
		l.add(1, 3);
		l.addFirst(1);
		l.addLast(4);
		l.add(4);
		System.out.println("------------------------------------");
		//for loop
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		
		System.out.println("------------------------------------");
		//while loop
		int i=0;
		while(i<l.size()) {
			System.out.println(l.get(i));
			i++;
		}
		
		System.out.println("------------------------------------");
		Iterator i1=l.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("------------------------------------");
		System.out.println("forword:");
		ListIterator l1=l.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("backword:");
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
		
		System.out.println("------------------------------------");
		System.out.println("even:");
		ListIterator l2=l.listIterator();
		while(l2.hasNext())
		{
			if((Integer)(l2.next())%2==1) {
				l2.remove();
				System.out.println(l2.next());
				
			}
			
			
		}
		
	                                                     
		//it is not index base  
		//set contain its own order 
		Set<Integer> s=new HashSet();//set have add method of collection only
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(30);	
		s.add(null);
		s.add(null);
		System.out.println(s);
		
		System.out.println("------------------------------------");
		Iterator i2=s.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		//for each
		System.out.println("------------------------------------");
		for(Integer i3:s) {
			System.out.println(i3);
		}
		
		
		Vector<Integer> v=new Vector();
		v.add(2);
		v.add(1, 3);
		v.addFirst(1);
		v.addLast(4);
		v.add(4);
		v.add(5);
		
		System.out.println("Enumeration:");
		Enumeration a=v.elements();
		while(a.hasMoreElements()) {
			System.out.println(a.nextElement());
		}
		
		System.out.println("Iterator:");
		Iterator b=v.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		
		System.out.println("ListIterator forward:");
		ListIterator c=v.listIterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}
		System.out.println("ListIterator backward:");
		while(c.hasPrevious()) {
			System.out.println(c.previous());
		}
	}

}
