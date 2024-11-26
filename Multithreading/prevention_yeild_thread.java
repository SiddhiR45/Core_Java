package Multithreading;

public class prevention_yeild_thread extends Thread{
	@Override
	public void run() {
		Thread.yield();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+ i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prevention_yeild_thread pyt=new prevention_yeild_thread();
		pyt.start();
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+ i);
		}
	}

}
