package Oops;
class car{
	private int wheel=4;
	private  int doors=4;
	private int engine=1;
	private int max_speed=80;
	private String mileage="15km/h";
	private String price="20lakh";
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		if(doors==4) {
		this.doors = doors;
		}
	};
	public int getEngine() {
		return engine;
	}
	public void setEngine(int engine) {
		this.engine = engine;
	}
	public int getMax_speed() {
		return max_speed;
	}
	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	void getdetails() {
		System.out.println("Wheel: "+wheel);
		System.out.println("Doors: "+doors);
		System.out.println("Engine: "+engine);
		System.out.println("Max Speed: "+max_speed);
		System.out.println("Mileage: "+mileage);
		System.out.println("Price: "+price);
	}
	
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c=new car();
		//c.getdetails();
		System.out.println("No.of doors:"+(c.getDoors()));
		c.setDoors(5);
		c.setPrice("25lakh");
		c.getdetails();
		
	}

}
