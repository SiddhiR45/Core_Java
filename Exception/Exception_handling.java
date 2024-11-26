package Exception;

public class Exception_handling {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		try {
			System.out.println(12/0);
		}
		catch (Exception e){
			System.out.println("cannot divide by zero");
		}
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		//ArrayIndeoutofbound
		int a[]= {1,2,3,5,6};
		for(int i=0;i<=a.length;i++)
		{
			//System.out.println(a[i]);
		}
		
		//nullpointerexception
		String s=null;
		try{
			System.out.println(s.length());
		}
		catch (Exception e){
			System.out.println("exception occured");
		}
		System.out.println("hello");
		System.out.println("-----------------------------------");
		//use condition to ignore exception and execute try block code
		String s1=null;
		try{
			if(s1!=null) {
			System.out.println(s1.length());
			}
			else
			{
				System.out.println("hello");
			}
		}
		catch (Exception e){
			System.out.println("exception occured");
		}
		
		System.out.println("-----------------------------------------");
		//exception can handle when we call the method in main method
		try {
			divide();
		}
		catch (Exception e)
		{
			System.out.println("cannot divided by vzero");
		}
		multiply();
		
		//try-catch-finally
		try {
			System.out.println(4/0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("Always executed \n measurely use for closing the connection and file");
		}
		
		
		//system.exit when we do not want to execute finally block
		try {
			System.out.println(4/0);
			//System.exit(0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//System.exit(0);
		}
		finally {
			System.out.println("finally block");
		}
		
		//can we write multiple catch with single try? Yes
		//but we can not give parent class at any block only siblings can give.
		try {
			String s2=null;
			System.out.println(4/0);
			System.out.println(s2.length());
			
		}
		catch(NullPointerException e)
		{
			System.out.println("null pointer exception");
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			// TODO: handle exception
			System.out.println("can not divided by zero");
			e.printStackTrace();
		}
		System.out.println("hello world");
	}
	static void divide()
	{
//		try {
		System.out.println(4/0);
//		}
//		catch (Exception e){
//			System.out.println(e.toString());//exception name, description.
//			e.printStackTrace();//exception name, description, line no.
//			System.out.println(e.getMessage());//description
//		}
	}
	static void multiply()
	{
		System.out.println(3*7);
	}	
}
