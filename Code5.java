//Threading in java ---------

package Week3;
class worker extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Thread 1 Running....."+ new java.util.Date());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class Code5 {
	public static void main(String[] args) {
		
		worker w1 = new worker();
		w1.start();  //start method is used to start Thread which indirectly calls run() method .
		
	}
}
