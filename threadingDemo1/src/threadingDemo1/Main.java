package threadingDemo1;

public class Main {
	public static void main(String[] args) {

		KronometerThread thread1 = new KronometerThread("thread1");
		KronometerThread thread2 = new KronometerThread("thread2");
		KronometerThread thread3 = new KronometerThread("thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
