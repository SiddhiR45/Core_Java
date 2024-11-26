package String;

import java.util.Arrays;

public class string_codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		//reverse the string
		System.out.println("-------------------------------------------");
		System.out.println("1.Reverse:");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		//find the vowels
		System.out.println("-------------------------------------------");
		System.out.println("2.vowel:");
		String s1="java is a programing language";
		for(int i=0;i<s1.length();i++)
		{
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
		{
			System.out.print(s1.charAt(i)+" ");
			
		}
		
		}
		System.out.println();
		//find the consonant
		System.out.println("-------------------------------------------");
		String s2="java is a programing language";
		System.out.println("3.constant:");
		for(int i=0;i<s2.length();i++)
		{
		if(s2.charAt(i)!='a'&&s2.charAt(i)!='e'&&s2.charAt(i)!='i'&&s2.charAt(i)!='o'&&s2.charAt(i)!='u')
		{
			System.out.print(s1.charAt(i)+"");
			
		}
		}
		System.out.println();
		//remove white spaces in string
		System.out.println("-------------------------------------------");
		System.out.println("4.white space:");
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)!=' ')
			{
				System.out.print(s2.charAt(i));
			}		
		}
		System.out.println();
		//remove special character except alphabet
		System.out.println("-------------------------------------------");
		String s3="Ja$v@a is a p^rog~ammi#ng l-ang*uage";
		System.out.println("5.remove special charater:");
		for(int i=0;i<s3.length();i++)
		{
			if(s3.charAt(i)>=65 && s3.charAt(i)<=90 || 
					s3.charAt(i)>=97 && s3.charAt(i)<=122 || s3.charAt(i)==' ')
			{
				System.out.print(s3.charAt(i));
			}		
		}
		System.out.println();
		//convert the given string into uppercase without  using any built in function
		System.out.println("-------------------------------------------");
		String s4="java is a programing language";
		String ans="";
		System.out.println("uppercase:");
		//buit-in
		System.out.println(s4.toUpperCase());
		for(int i=0;i<s4.length();i++)
		{
			if(s4.charAt(i)!=' ')
			{
				ans+=(char)(s4.charAt(i)-32);
			}
			else
			{
				ans+=' ';
			}
		}
		System.out.println(ans);
		//convert the given string into lowercase without  using any built in function
		System.out.println("-------------------------------------------");
		String s5="JAVA IS A PROGRAMING LANGUAGE";
		String ans1="";
		System.out.println("Lowercase:");
		//built in
		System.out.println(s5.toLowerCase());
		for(int i=0;i<s5.length();i++)
		{
			if(s5.charAt(i)!=' ')
			{
				ans1+=(char)(s5.charAt(i)+32);
			}
			else
			{
				ans1+=' ';
			}
		}
		System.out.println(ans1);
		
		//convert the given string into uppercase and vice versa
		System.out.println("-------------------------------------------");
		String s6="JaVa Is A pRoGrAmInG LaNgUaGe";
		String ans2="";
		System.out.println("6.lower and upper:");
		for(int i=0;i<s6.length();i++)
		{
			if(s6.charAt(i)>=65 && s6.charAt(i)<=90)
			{
				ans2+=(char)(s6.charAt(i)+32);
			}
			else if(s6.charAt(i)>=97 && s6.charAt(i)<=122)
			{
				ans2+=(char)(s6.charAt(i)-32);
			}
			else
			{
				ans2+=' ';
			}
		}
		System.out.println(ans2);
		
		//count the no of words in a string
		System.out.println("-------------------------------------------");
		//no of space+1
		int count=0;
		String s7="java is a programing language";
		System.out.println("7.No of words:");
		String arr[]=s7.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<s7.length();i++)
		{
			if(s7.charAt(i)==' ')
			{
				count++;
			}		
		}
		System.out.println("Total numbers of word are:"+(count+1));
		
		
		
	}

}
