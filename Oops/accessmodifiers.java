package Oops;
class G{
	public int y=70;
	int z=90;
	protected int x=50;
	//private int d=20;
}

public class accessmodifiers {
	static protected int p=10;
	int q=20;
	//private int r=30;
	public int s=40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(accessmodifiers.p);
		G g=new G();
		System.out.println(g.x);
		System.out.println(g.y);
		System.out.println(g.z);
	//	System.out.println(g.d);private can not access within package

	}

}
