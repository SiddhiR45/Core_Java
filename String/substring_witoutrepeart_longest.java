package String;

public class substring_witoutrepeart_longest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Allsubstring("abcdc");
	}
	public static void Allsubstring(String s)
	{
		String str=" ";
		int maxilength=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String ans=s.substring(i,j+1);
				if(duplichar1(ans))
				{
					maxilength=Math.max(maxilength, ans.length());
//					if(ans.length()>maxilength)
//					{
//						str=ans;
//						maxilength=ans.length();
//					}
				}
			}
			
		}
		System.out.println("substring withoutrepeatation of character and longest substring:"+maxilength);
	}
	public static boolean duplichar1(String s)
	{
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
				return false;
			}
		}
		return true;
		
	}
	

}
