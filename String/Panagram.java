package String;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPanagram("abcdefghijklmnopqrstuvwxyz"));
	}
	public static boolean checkPanagram(String s)
	{
		s=s.toLowerCase();
		int a[]=new int[256];
		//int a[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				a[s.charAt(i)]=1;
				//a[s.charAt(i)-97]=1;
			}
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
				//if(a[i]==0)
			{
				count++;
				//return false;
			}
		}
		System.out.println(count);
		//return true;
		if(count==26) {
			return true;
		}
		else
		{
			return false;
		}
	}

}
