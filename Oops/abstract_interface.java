package Oops;
abstract class Admin{
	int x=5;
	abstract void addProduct();
	void getProduct() {
		System.out.println("i am concrete method");
	}
}
class AdminImpl extends Admin{
	void addProduct() {
		System.out.println("Product is added");
	}
}
//Multiple Inheritance
//Achieve because there only body no implementation so there is no confusion it only call its method
interface User{
	int x=5;
	void addProfile();
	void deleteProfile();
}
interface User1{
	//it is always public abstract
	int x=8;
	void addProfile();
}
class UserImpl implements User,User1{
	public void addProfile() {
		System.out.println("Add Profile");
	}

	@Override
	public void deleteProfile() {
		System.out.println("Delete Profile");
		
	}
	
}
public class abstract_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminImpl a=new AdminImpl();
		a.getProduct();
		a.addProduct();
		//User only give reference object of UserImpl going to create 
		User u=new UserImpl();
		u.addProfile();
		u.deleteProfile();
		System.out.println(User1.x);//because variable is static and final
		System.out.println(User.x);//it gives the reference of User because its output is variable of x is 5
		

	}

}
