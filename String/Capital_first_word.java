package String;

public class Capital_first_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CapitalizeFirstWord("java is programing lanuage"));
	}
		public static String Capital(String s)
		{
			String ans="";
			for(int i=0;i<s.length();i++)
			{
				if(i==0 || i==s.length()-1) {
				ans+=(char)(s.charAt(i)-32);
				}
				else
				{
					ans+=s.charAt(i);
				}
			}
			return ans;
		}
		public static String CapitalizeFirstWord(String s) {
			String a[]=s.split(" ");
			String ans="";
			for(int i=0;i<=a.length-1;i++)
			{
				String Str=Capital(a[i]);
				ans+=Str+" ";
				
			}
			return ans;
		}
	
}
