package Multithreading;
class BookTrainSeat{
	int totalseat=20;
	public synchronized void bookSeat(int seat) {
		  //synchronized (this) {
			  if(seat<=totalseat) {
				  System.out.println(seat +"seats booked successfuly!!");
				  totalseat=totalseat-seat;
				  System.out.println("reamining seats are "+totalseat);
			  }
			  else {
				  System.out.println("seat not booked");
				  System.out.println("remaining seats are "+totalseat);
			  }
			
		//}
	}
}
public class synchronizaon_thread extends Thread {
	static BookTrainSeat b;
	int seat;
	@Override
	public void run() {
		b.bookSeat(seat);
	}

	public static void main(String[] args) {
		b=new BookTrainSeat();
		synchronizaon_thread p1=new synchronizaon_thread();
		p1.seat=15;
		p1.start();
		synchronizaon_thread p2=new synchronizaon_thread();
		p2.seat=10;
		p2.start();

	}

}
