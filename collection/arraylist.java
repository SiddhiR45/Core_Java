package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		ArrayList al=new ArrayList(l);
		al.add(4);
		al.add("java");
		al.add(true);
		al.add(0, 0);
		al.add(null);
		System.out.println(al);
		
		ArrayList ans=new ArrayList();
		for(int i=0;i<=100;i++) {
			if(i%2==1) {
				ans.add(i);
			}
		}
		System.out.println("Even:"+ans);
		
		
	}

}
