package Exception;

import java.util.Scanner;

//check exception or compile exception extends Exception class
//unchecked exception or runtime exception extends RunTimeException class
//whenever we need to create a custom exception that time we mostly prefer to create runtime or unchecked exception
//throw keyword use for creating object of exception manually for custom exception
class VoteException extends RuntimeException{
	public VoteException(String msg)
	{
		super(msg);
	}
}
class divided {
	public void divided() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("hello");
	}

	
	
}
public class userdefined_exception {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		divided d=new divided();
		d.divided();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age<18) {
			try {
				throw new VoteException("Your are not eligible");//after throw keyword we can not write anything 
			} catch (VoteException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		else
		{
			System.out.println("You can vote");
		}
		System.out.println("hello world");
	}

}
