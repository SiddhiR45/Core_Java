package Multithreading;
class TotalIncome extends Thread{
	int totalearning=0;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				totalearning+=100;
			}
			this.notify();
		}
	}
}

public class wait_notify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TotalIncome t=new TotalIncome();
		t.start();
		synchronized (t) {
			t.wait();
			System.out.println("Income"+t.totalearning);
			
		}

	}

}
