package String;

public class checkAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkAnagram("geeksforgeeks","forgeeksgeeks"));
		System.out.println(checkAnagram("allergy","allergic"));

	}
	public static boolean checkAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		int a[]=new int[256];
		for(int i=0;i<s1.length();i++)
		{
			a[s1.charAt(i)]++;
			a[s2.charAt(i)]--;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				return false;
			}
		}
		return true;
	}

}
