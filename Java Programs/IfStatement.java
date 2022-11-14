class IfStatement {
	public static void main(String args[]) {
	/*int a=100;
	int b=500;
	if(a>b) {
		System.out.println("a is largest");
	}else {
		System.out.println("b is largest");
	}*/
	int a=300;
	int b=100;
	int c=200;
	if(a>b) {
			if(a>c) {
				System.out.println("a is largest");
			}else {
				System.out.println("c is largest");
			}
	}else {
			if(b>c) {
				System.out.println("b is largest");
			}else {
				System.out.println("c is largest");
			}
	}

	}
}