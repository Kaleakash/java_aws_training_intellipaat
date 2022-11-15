class Car {
	int wheel;
	String color;
	float price;
	void start() {
		System.out.println("Car Start");
	}	
	void appliedGear() {
		System.out.println("Gear Applied");
	}
	void moving() {
		System.out.println("Car is moving");
	}
	void stop() {
		System.out.println("Car stop");
	}
	void displayCarDetails() {
		int temp=0;
		System.out.println("Wheel "+wheel);
		System.out.println("Color "+color);
		System.out.println("Price "+price);
		System.out.println("Temp "+temp);
	}
}
class AppTest {
	public static void main(String args[]) {
	//start();
	Car innova = new Car();		// heap memory 
	Car ertiga = new Car();		// heap memory 
	//innova.start();
	//innova.stop();
	innova.wheel = 4;
	innova.color = "Gray";
	innova.price = 2000000;
	ertiga.wheel = 4;
	ertiga.color = "Silver";
	ertiga.price = 1300000;
	innova.displayCarDetails();
	ertiga.displayCarDetails();
	System.out.println(ertiga.price);
	}
}




