package String;

public class substring_palindrome_longest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Allsubstring("ababa");

	}
	public static void Allsubstring(String s)
	{
		String ans=" ";
		int maxilength=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String str=s.substring(i,j+1);
				if(isPalindrome(str))
				{
					//maxilength=Math.max(maxilength, str.length());
						if(str.length()>maxilength)
						{
							ans=str;
							maxilength=str.length();
						}
				}
			}
		}
		System.out.println("substring palindrome and longest:"+ans);
		
	}
	public static boolean isPalindrome(String s)
    {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) 
        {
            rev = rev + s.charAt(i);
        }
        
        if (s.equals(rev))
        {
            return true;
        }
        else
        {
        return false;
        }
    }
   

}
