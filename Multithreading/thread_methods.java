package Multithreading;

public class thread_methods extends Thread {
	 @Override
	public void run() {
		 System.out.println(Thread.currentThread());
		 for(int i=0;i<=5;i++) {
			 System.out.println(i);
			 //thread and main method run simultaneously because of that we use start method 
			 //if we use run method then it can only run code line by line
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_methods t=new thread_methods();
		t.start();
		thread_methods t1=new thread_methods();
		t1.start();
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		System.out.println(t.isAlive());
		System.out.println(t.getName());
		System.out.println(t1.getName());
		//System.out.println(t.currentThread());
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("mymainthread");
		System.out.println(Thread.currentThread().getName());
		t.setName("task1");
		System.out.println(t.getName());
	}

}
