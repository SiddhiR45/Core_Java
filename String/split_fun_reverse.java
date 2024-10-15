package String;

public class split_fun_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseEachWord("Hello word"));
		System.out.println(reverseEachWord(" java is a programing lanuage"));
		System.out.println("-----------------------------");
		System.out.println(reverseEachWordInPlace("Hellow world"));
		System.out.println(reverseEachWordInPlace("java.is.a.programing.lanuage."));
		String s1="java";
		String s2="java";
		System.out.println(s1==s2);
		String s3=new String("java");
		String s4=new String("python ");
		System.out.println(s3.equals(s4));
	}
	public static String reverseEachWord(String s) {
		String a[]=s.split(" ");
		String ans="";
		for(int i=a.length-1;i>=0;i--)
		{
			ans+=a[i]+" ";
		}
		return ans;
	}
	//level 3
	public static String reverse(String s)
	{
		String ans="";
		for(int i=s.length()-1;i>=0;i--)
		{
			ans+=s.charAt(i);
		}
		return ans;
	}
	public static String reverseEachWordInPlace(String s) {
		String a[]=s.split("\\.");
		String ans="";
		for(int i=0;i<=a.length-1;i++)
		{
			String rev=reverse(a[i]);
			if(i!=a.length-1)
			{
				ans+=rev+".";
			}
			else
			{
				ans+=rev;
			}
		}
		return ans;
	}
	
	
	

}
