package abc;
class Task implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		//System.out.println(t);
		String name = t.getName();
		//System.out.println(name);
		for(int i=0;i<10;i++) {
			System.out.println(name+" "+i);
		}
	}
}
public class CreatingMoreThanOneThreadWithOneResource {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		Task tt = new Task();
		Thread t1 = new Thread(tt);
		Thread t2 = new Thread(tt);
		Thread t3 = new Thread(tt);
		
		t1.setName("Ravi");
		t2.setName("Raju");
		t3.setName("Ramesh");
		t1.start();
		t2.start();
		t3.start();
	}

}
