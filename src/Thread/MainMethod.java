package Thread;

public class MainMethod {

	public static void main(String[] args) throws InterruptedException {

		Thread123 t1 = new Thread123();
		Thread245 t2 = new Thread245();
		Thread t3 = new Thread(() ->{ for (int i=300;i<=500;i++) {
			System.out.println(i);}
		});
		t3.start();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t1.getPriority();
		System.out.println(t1.getName());
		
		
	}

}
