class TypeCasting {
	public static void main(String args[]) {
	/*byte a =100;
	short b = a;		// type casting 	implicit 
	System.out.println(a);
	System.out.println(b);		
	short c = 100;
	byte d = (byte)c;		// type casting	explicit 
	System.out.println(c);
	System.out.println(d);	*/
	int a=100;
	float b=a;
	System.out.println(a);
	System.out.println(b);
	//float c = 100;
	//float c = (float)100.10;
	float c= 100.10f;
	int d = (int)c;
	System.out.println(c);
	System.out.println(d);	
	}
}