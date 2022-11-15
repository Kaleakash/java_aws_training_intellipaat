import java.util.Scanner;
class ArrayExample {
	public static void main(String args[]) {
	/*int abc[];
	int xyz[]={100,200,300,400,500,11,24,56,34,56,78,99,66};
	System.out.println(xyz);
	System.out.println(xyz[0]);
	System.out.println(xyz[1]);
	//System.out.println(xyz[5]);
	System.out.println("for loop");
	for(int i=0;i<xyz.length;i++) {
		System.out.println(xyz[i]);
	}
	System.out.println("retrieve element using for each loop");
	//int n;
	for(int n : xyz) {
		System.out.println(n);
	}*/
	
	Scanner sc = new Scanner(System.in);
	System.out.println("How many number do you want to store");
	int n = sc.nextInt();
	int abc[]=new int[n];
	System.out.println("Enter the number one by one");
	for(int i=0;i<n;i++) {
		abc[i]=sc.nextInt();
	}
	System.out.println("All numbers are ");
	for(int i=0;i<n;i++) {
		System.out.println(abc[i]);
	}
	}
}












