
public class ThreadsExample extends Thread{
	public void run() {
		System.out.println("Thread Clas run method......");
	}
	
	/*
	 * public void start() { System.out.println("Thread class start method.......");
	 * }
	 */
	public static void main(String[] args) {
		ThreadsExample t = new ThreadsExample();
		t.start();
		t.start();
	}

}
