package String;

public class substring_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Allsubstring("ababa");
		//System.out.println(isPalindrome("ababa"));
		
		
	}
	public static void Allsubstring(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String ans=s.substring(i,j+1);
				if(isPalindrome(ans))
				{
						System.out.println(ans);
					
				}
			}
		}
		
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
