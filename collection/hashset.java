package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		h.add(1);
		h.add("java");
		h.add(true);
		h.add(1);
		h.add(null);
		h.add(null);
		h.add(2);
		h.add(5);
		h.add(3);
		System.out.println(h.clone());
		System.out.println(h.getClass());
		System.out.println(h.spliterator());
		System.out.println(h.parallelStream());
		System.out.println(h);
		
		System.out.println("----------------duplicate value in array remove-----------------");
		HashSet h1=new HashSet();
		int arr1[]= {1,2,3,4,5,6,1};
		for(int i=0;i<arr1.length;i++) {
			h1.add(arr1[i]);
			
		}
		System.out.println(h1);
		System.out.println("-------duplicate letter in string remove---------");
		LinkedHashSet h2=new LinkedHashSet();
	    String s="java";
	    String ans="";
	    for(int i=0;i<s.length();i++) {
	    	h2.add(s.charAt(i));
	    }
	    System.out.println(h2);
	    System.out.println("-------------------sort out insertion order-----------------------------");
	    Iterator i=h2.iterator();
	    while(i.hasNext()) {
	    	ans+=i.next();
	    }
	    System.out.println(ans);

	}

}
