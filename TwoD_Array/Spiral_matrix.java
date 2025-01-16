package TwoD_Array;

import java.util.Arrays;

public class Spiral_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		Sprial(a);
		System.out.println("==============================");
		genrateSpiral(3);

	}
	static void Sprial(int a[][]) {
		int frow=0;
		int fcol=0;
		int lrow=a.length-1;
		int lcol=a[0].length-1;
		int count=0;
		while(count<a.length*a[0].length) {
			//first row
			for(int i=fcol;i<=lcol ;i++) {
				System.out.println(a[frow][i]);
				count++;
			}
			frow++;
			//last col
			for(int j=frow;j<=lrow;j++) {
				System.out.println(a[j][lcol]);
				count++;
			}
			lcol--;
			//last row
			for(int k=lcol;k>=fcol ;k--) {
				System.out.println(a[lrow][k]);
				count++;
			}
			lrow--;
			//first col
			for(int l=lrow;l>=frow ;l--) {
				System.out.println(a[l][fcol]);
				count++;
			}
			fcol++;
		}
	}
	static void genrateSpiral(int n) {
		int a[][]=new int[n][n];
		int frow=0;
		int fcol=0;
		int lrow=a.length-1;
		int lcol=a[0].length-1;
		int count=1;
		while(count<=a.length*a[0].length) {
			//first row
			for(int i=fcol;i<=lcol ;i++) {
				a[frow][i]=count;
				count++;
			}
			frow++;
			//last col
			for(int j=frow;j<=lrow;j++) {
				a[j][lcol]=count;
				count++;
			}
			lcol--;
			//last row
			for(int k=lcol;k>=fcol ;k--) {
				a[lrow][k]=count;
				count++;
			}
			lrow--;
			//first col
			for(int l=lrow;l>=frow ;l--) {
				a[l][fcol]=count;
				count++;
			}
			fcol++;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
