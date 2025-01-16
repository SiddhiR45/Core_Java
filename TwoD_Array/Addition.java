package TwoD_Array;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{1,2},{3,4}};
		addition(a, b);
	}
	static void addition(int a[][],int b[][]) {
		int r1=a.length;
		int r2=b.length;
		int c1=a[0].length;
		int c2=b[0].length;
		if(r1!=r2 || c1!=c2) {
			System.out.println("addition is not possible");
			return;
		}
		int ans[][]=new int[r1][c1];
		for(int i=0;i<a.length;i++) {
			  for(int j=0;j<a[i].length;j++) {
				ans[i][j]=a[i][j]+b[i][j];
			  }
			}
		//print
		for(int i=0;i<a.length;i++) {
			  for(int j=0;j<a[i].length;j++) {
				System.out.print(ans[i][j]+" ");;
			  }
			  System.out.println();
			}
		
	}

}
