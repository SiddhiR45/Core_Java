package String;

public class distance_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		distance("abegc");

	}
	public static void distance(String s)
	{
		System.out.println("count distances between charater:");
		String ans="";
		ans+=s.charAt(0);
		for(int i=1;i<s.length();i++)
		{
			int distance=s.charAt(i)-s.charAt(i-1);
			ans+=distance;
			ans+=s.charAt(i);
		}
		System.out.println(ans);
	}
	

}
