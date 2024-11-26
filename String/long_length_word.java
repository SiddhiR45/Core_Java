package String;

public class long_length_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(longlength("Java is a programming lanuage"));
	duplichar("programming java lanuage");
	duplichar1("java is programming lanuage");
	}
	//max length word
	public static String longlength(String s)
	{
		String a[]=s.split(" ");
		String ans=" ";
		int maxilength=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()>maxilength)
			{
				maxilength=a[i].length();
				ans=a[i];
			}
		}
		return ans;
		
	}
	//duplicate char
	public static void duplichar(String s)
	{
		System.out.println("duplicate char");
		int a[]=new int[256];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ') {
			a[s.charAt(i)]++;
			}
			
		}
	
		for(int i=0;i<a.length;i++)
		{	
			if(a[i]>1)
			{
				System.out.print((char)i+",");
			}
		}
		System.out.println();
		
	}
	//Unique char
	public static void duplichar1(String s)
	{
		System.out.println("uninque char");
		int a[]=new int[256];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ') {
			a[s.charAt(i)]++;
			}
			
		}
	
		for(int i=0;i<a.length;i++)
		{	
			if(a[i]==1)
			{
				System.out.print((char)i+",");
			}
		}
		
	}


}
