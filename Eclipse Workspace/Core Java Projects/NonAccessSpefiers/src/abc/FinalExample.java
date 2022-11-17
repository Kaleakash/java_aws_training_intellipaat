package abc;

public class FinalExample {

	public static void main(String[] args) {
		final int A=100;
		//A=200;
		System.out.println(A);
		Honda hh = new Honda();
		//hh.speed();
		Bike bb = new Bike();
		bb.speed();
		bb.mailage();
	}

}
