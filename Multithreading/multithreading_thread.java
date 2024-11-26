package Multithreading;


//Performing single task from single thread
//Performing single task from multiple thread
//Performing multiple task from single thread:-we cannot achieve
public class multithreading_thread extends Thread {
	@Override
	public void run() {
		System.out.println("I am run method of thread class");
	}
	public static void main(String[] args) {
		System.out.println("Hello world");
		multithreading_thread mt=new multithreading_thread();
		mt.start();
		multithreading_thread mt1=new multithreading_thread();
		mt1.start();//Performing single task from multiple thread

	}

}
