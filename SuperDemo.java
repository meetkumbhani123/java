import java.util.Scanner;

class Vehicle{

	Vehicle(){
		System.out.println("i am first coming");
	}
	protected void start(){
		System.out.println("Add Key and kick start");
	}
}
class Car extends Vehicle{
	public void start(){
		super.start();
		System.out.println("Keep key with you and press button");
	}
	Car(){
		System.out.println("i am coming");
	}
}
class Bike extends Vehicle{
	public void start(){
		System.out.println("Add Key and use self start");
	}
}
class EBike extends Bike{
	public void start(){
		System.out.println("Enter Password and go");
	}
}
public class SuperDemo{
	public static void main(String[] args) {
		// Vehicle myVehicle = null;
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter \n1 for car\n2 for bike\n3 for ebike\n enter any thing other for vechile");
		// int temp = sc.nextInt();
		// if(temp==1){
		// 	myVehicle = new Car();
		// }else if(temp==2){
		// 	myVehicle = new Bike();
		// }else if(temp==3){
		// 	myVehicle = new EBike();
		// }
		// else{
		// 	myVehicle = new Vehicle();
		// }

		// myVehicle.start();
		Car c= new Car();
		c.start();
		
	}
}
