package Multithreading;

public class thread_interrrupt extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_interrrupt ti=new thread_interrrupt();
		ti.start();
		ti.interrupt();
	}

}
