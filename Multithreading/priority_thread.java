package Multithreading;

public class priority_thread  extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+ i);
		}
		System.out.println(Thread.currentThread().getName()+" Priority is "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println(Thread.currentThread().getName()+" Priority is "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Priority is "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MIN_PRIORITY);
		priority_thread pt=new priority_thread();
		pt.start();
		System.out.println(Thread.currentThread().getName()+" Priority is "+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+ i);
		}
		

	}

}
