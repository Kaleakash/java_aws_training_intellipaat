import java.util.Scanner;
class ArrayString {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("how many record do you want to store?");
	int numberOfRec = sc.nextInt();
	int id[]=new int[numberOfRec];
	String names[]=new String[numberOfRec];
	float salary[]=new float[numberOfRec];
	System.out.println("enter the details one by one");
	for(int i=0;i<numberOfRec;i++) {
		System.out.println("enter the id");
		id[i]=sc.nextInt();
		System.out.println("enter the name");
		//names[i]=sc.next();	// it doesn't allow space it allow only one word 
		sc.nextLine();		// it is use to hold enter key
		names[i]=sc.nextLine();		// enter key is terminal for nextLine method 
		System.out.println("enter the salary");
		salary[i]=sc.nextFloat();
	}
	System.out.println("All details are");
	for(int i=0;i<numberOfRec;i++) {
		System.out.println("id is "+id[i]+" Name is "+names[i]+" salary is "+salary[i]);	
	}
	}
}