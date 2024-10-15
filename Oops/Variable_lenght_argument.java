package Oops;
class Sum1{
	void sum(int... a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
	void printSentence(String... word)
	{
		String sentence="";
		for(int i=0;i<word.length;i++)
		{
			sentence+=word[i]+" ";
		}
		System.out.println(sentence);
	}
}
public class Variable_lenght_argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum1 s=new Sum1();
		s.sum(5,6,7);
		s.printSentence("Java","is","a","secured","Language");

	}

}
