package String;

public class Sum_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumOfNumberInString("J2a5v4a7"));
		System.out.println(SumOfNumberInString1("J20a5v40a"));

	}
	public static int SumOfNumberInString(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i))) {
				int num=Character.getNumericValue(s.charAt(i));
				sum+=num;
			}
		}
		return sum;
	}
	//if numbers together consider them single value
	public static int SumOfNumberInString1(String s)
	{
		String temp="0";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i))) {
				temp+=s.charAt(i);
			}
			else
			{
				sum+=Integer.parseInt(temp);
				temp="0";
			}
		}
		return sum;
	}


}
