package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {1,2,3,4,5,6,0};
		int pos=2;
		for(int i=0;i<arr.length;i++) {
			
		}
		System.out.println(Arrays.toString(arr));
		for(int i=arr.length-2;i>=pos;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos]=7;
		System.out.println(Arrays.toString(arr));
		
		System.out.println("---------------------------------------");
		int a[]=new int[] {0,1,2,3,4,5,6};
		int pos1=2;
		for(int i=0;i<a.length;i++) {
			
		}
		System.out.println(Arrays.toString(a));
		for(int i=1;i<=pos1;i++)
		{
			a[i-1]=a[i];
		}
		a[pos1]=7;
		System.out.println(Arrays.toString(a));
		
		System.out.println("-----------------------------");
		add(0, 0, arr);
		System.out.println(Arrays.toString(arr));
		maximum();
		
		

	}
	
	
	int arr[]=new int[] {1,2,3,4,5,6,0};
	static void add(int index,int element, int arr[]) {
		for(int i=arr.length-2;i>=index;i--) {
			arr[i+1]=arr[i];
		}
		arr[index]=element;
	}
	static void maximum()
	{
		//find max in array
		int arr[]= {8,4,23,12,45,7,21,45};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max: "+max);
		//find second max with for
		int max1=arr[0],ans=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				ans=max1;
				max1=arr[i];
			}
		}
		System.out.println("Second lagest with for: "+ans);
				
		//find second max in array with Arrays
		//this method does not work in duplicacy
		Arrays.sort(arr);
		System.out.println("second largest with Arrays: "+arr[arr.length-2]);
		
		//find second max in array with TreeSet
		TreeSet<Integer> t=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			t.add(arr[i]);
		}
		ArrayList<Integer> al=new ArrayList<Integer>(t);
		System.out.println("Second largest with Treeset: "+al.get(al.size()-2));
		
		
		//find the kth largest element in an an Array
		//with priority queue
		Queue q=new PriorityQueue();
		int k=3;
		for(int i=0;i<k;i++)
		{
			q.add(arr[i]);// add first 3 elements in queue //tree structure
		}
		for(int i=k;i<arr.length;i++)
		{
			if(arr[i]>(int)q.peek())
			{
				q.poll();
				q.add(arr[i]);//remove peek element and add greater element
			}
		}
		System.out.println("kth largest with priority queue: "+q.peek());
		
		//find the kth smallest element in an an Array
		//with priority queue
		Queue q1=new PriorityQueue(Collections.reverseOrder());
		int k1=1;
		for(int i=0;i<k1;i++)
		{
			q1.add(arr[i]);// add first 3 elements in queue //tree structure
		}
		for(int i=k1;i<arr.length;i++)
		{
			if(arr[i]<(int)q1.peek())
			{
				q1.poll();
				q1.add(arr[i]);//remove peek element and add greater element
			}
		}
		System.out.println("kth smallest with priority queue: "+q1.peek());
		
		
	}


}
