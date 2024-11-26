package Multithreading;

public class multithreading_runnable implements Runnable {

	public static void main(String[] args) {
		System.out.println("Hello world");
		multithreading_runnable mr=new multithreading_runnable();
		Thread th=new Thread(mr);
		th.start();
		th.start();
		System.out.println("one");

	}

	@Override
	public void run() {
		System.out.println("I am run method of runnable interface");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("multi threadig");
		
	}

}
