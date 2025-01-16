package TwoD_Array;

import java.util.Arrays;

public class Rotate90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		rotateby90(test);
		
	}
	static void TransposeInPlace(int test[][]) {
		for(int i=0;i<test.length;i++) {
			  for(int j=0;j<test[i].length;j++) {
				  if(j>=i) {
				  int temp=test[i][j];
				  test[i][j]=test[j][i];
				  test[j][i]=temp;
				  }
				 
			  }
			}
	}
	static void reverse(int arr[]) {
		int s=0;
		int e=arr.length-1;
		while(s<e){
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
	}
static void rotateby90(int arr[][]) {
	TransposeInPlace(arr);
	for(int i=0;i<arr.length;i++) {
		reverse(arr[i]);
	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(Arrays.toString(arr[i]));
	}
}
}
