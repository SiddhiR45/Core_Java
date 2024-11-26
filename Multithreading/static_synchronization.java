package Multithreading;
class BookTrainSeat1{
	static int totalseat=20;
	static synchronized void bookSeat(int seat) {
		  
			  if(seat<=totalseat) {
				  System.out.println(seat +"seats booked successfuly!!");
				  totalseat=totalseat-seat;
				  System.out.println("reamining seats are "+totalseat);
			  }
			  else {
				  System.out.println("seat not booked");
				  System.out.println("remaining seats are "+totalseat);
			  }
			
		
	}
}
class MyThread1 extends Thread{
	BookTrainSeat1 b;
	 int n;
	MyThread1(BookTrainSeat1 b,int n){
		this.b=b;
		this.n=n;
	}
	@Override
	public void run() {
		b.bookSeat(n);
	}
}
class MyThread2 extends Thread{
	BookTrainSeat1 b;
	 int n;
	MyThread2(BookTrainSeat1 b,int n){
		this.b=b;
		this.n=n;
	}
	@Override
	public void run() {
		b.bookSeat(n);
	}
}
public class static_synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookTrainSeat1 b=new BookTrainSeat1();
		BookTrainSeat1 b1=new BookTrainSeat1();
		MyThread1 m=new MyThread1(b, 10);
		MyThread1 m1=new MyThread1(b, 5);
		MyThread2 m2=new MyThread2(b1, 5);
		MyThread2 m3=new MyThread2(b1, 7);
		m.start();
		m1.start();
		m2.start();
		m3.start();

	}

}
