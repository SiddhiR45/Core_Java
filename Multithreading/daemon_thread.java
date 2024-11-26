package Multithreading;

public class daemon_thread extends Thread {
	@Override
	public void run() {
	System.out.println("hello");	
	}

	public static void main(String[] args) {
		daemon_thread dt=new daemon_thread();
		dt.setDaemon(true);
		dt.start();
		//System.out.println(dt.isDaemon());
//		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);

	}

}
