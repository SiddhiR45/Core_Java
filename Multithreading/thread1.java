package Multithreading;

//Performing multiple task from multiple thread

class Task1 extends Thread{
	@Override
	public void run() {
		System.out.println("I am task 1");
	}
}
class Task2 extends Thread{
	@Override
	public void run() {
		System.out.println("I am task 2");
	}
}
class Task3 extends Thread{
	@Override
	public void run() {
		System.out.println("I am task 3");
	}
}

public class thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		Task1 t1=new Task1();
		t1.start();
		Task2 t2=new Task2();
		t2.start();
		Task3 t3=new Task3();
		t3.start();

	}

}
