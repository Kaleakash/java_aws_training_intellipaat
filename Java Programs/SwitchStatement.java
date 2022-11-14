import java.util.Scanner;
class SwitchStatement {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter our choice");
	int choice =sc.nextInt();	//nextFloat, nextByte, nextBoolean, next, nextLine etc 
	switch(choice) {
		case 1:System.out.println("block1");
			   break;	
		case 2:System.out.println("block2");
			   break;
		case 3:System.out.println("block3");
			   break;
		default :System.out.println("Wrong choice");
			break;
	}
		System.out.println("Finish");
	}
}