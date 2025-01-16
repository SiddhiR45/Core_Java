package TwoD_Array;

public class UpperDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		upperDiagonals(a);
		System.out.println("==============================");
		lowerDiagonals(a);

	}
	static void upperDiagonals(int a[][]) {
		int ans[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(j>=i) {
				 ans[i][j]=a[i][j];
				}
				else {
					ans[i][j]=0;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void lowerDiagonals(int a[][]) {
		int ans[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(j<=i) {
				 ans[i][j]=a[i][j];
				}
				else {
					ans[i][j]=0;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
	
		
	

}
