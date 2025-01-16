package TwoD_Array;

import java.util.Arrays;
import java.util.Scanner;

public class basic_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[4][4];
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter element:");
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<=arr[i].length-1;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int arr1[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		//row wise addition
		for(int i=0;i<arr1.length;i++) {
		  int sum=0;
		  for(int j=0;j<arr1[i].length;j++) {
			  sum+=arr1[i][j];
		  }
		  System.out.println(sum);
		}
		//column wise addition
		for(int i=0;i<arr1.length;i++) {
			  int sum=0;
			  for(int j=0;j<arr1[i].length;j++) {
				  sum+=arr1[j][i];
			  }
			  System.out.println(sum);
			}
		//transpose
		int trans[][]=new int[4][4];
		for(int i=0;i<arr1.length;i++) {
			  for(int j=0;j<arr1[i].length;j++) {
				 trans[j][i]=arr1[i][j];
			  }
			}
		for(int i=0;i<arr1.length;i++) {
			System.out.println(Arrays.toString(trans[i]));
		}
		//transpose at same array
		int test[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		for(int i=0;i<test.length;i++) {
			  for(int j=0;j<test[i].length;j++) {
				  if(j>=i) {
				  int temp=test[i][j];
				  test[i][j]=test[j][i];
				  test[j][i]=temp;
				  }
				 
			  }
			}
		for(int i=0;i<test.length;i++) {
			System.out.println(Arrays.toString(test[i]));
		}

	}

}
