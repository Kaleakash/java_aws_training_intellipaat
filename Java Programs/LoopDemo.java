class LoopDemo {
	public static void main(String args[]) {
	// while loop 
	/*int i=1,n=10;
	while(i<=n) {						// enty loop 
		//System.out.println("Hello");
		System.out.println("i "+i);
		i++;
	}	*/
	// do while 
	/*int i=1,n=10;
	do {							// exit loop 
		System.out.println(" i "+i);
		i++;
	}while(i<=n);*/
	// for loop 
	/*for(int i=1,n=10;i<=n;i++) {
		System.out.println(" i "+i);
	}*/
	
	//nested for loop 
	for(int i=1,n=10;i<=n;i++) {
		
		for(int j=1;j<=n;j++) {
			System.out.print(j+"*"+i+"="+(i*j)+" | ");
		}
		System.out.println();
	}
	System.out.println("finish");
	}
}