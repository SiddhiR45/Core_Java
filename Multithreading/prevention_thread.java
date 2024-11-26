package Multithreading;

public class prevention_thread extends Thread{
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
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prevention_thread pth=new prevention_thread();
		pth.start();

	}

}
