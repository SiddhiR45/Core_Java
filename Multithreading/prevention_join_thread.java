package Multithreading;

public class prevention_join_thread extends Thread{
	static Thread m;
	@Override
	public void run() {
//		try {
//			m.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"  "+ i);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m=Thread.currentThread();
		prevention_join_thread pjt=new prevention_join_thread();
		pjt.start();
		try {
			pjt.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"  "+ i);
		}

	}

}
