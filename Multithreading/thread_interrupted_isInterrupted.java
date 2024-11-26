package Multithreading;

public class thread_interrupted_isInterrupted extends Thread {
	@Override
	public void run() {
//		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.interrupted());
//		System.out.println(Thread.currentThread().isInterrupted());
//		System.out.println(Thread.currentThread().isInterrupted());
//		System.out.println(Thread.interrupted());
//		System.out.println(Thread.currentThread().isInterrupted());
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_interrupted_isInterrupted thi=new thread_interrupted_isInterrupted();
		thi.start();
		thi.interrupt();

	}

}
