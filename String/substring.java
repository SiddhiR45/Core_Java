package String;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		Allsubstring("abc");
		System.out.println("----------------------------");
		Allsubstring1("abc");

	}
	public static void Allsubstring(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				System.out.println(s.substring(i,j+1));
			}
			System.out.println();
		}
	}
	
	public static void Allsubstring1(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
			
		}
	}

}
