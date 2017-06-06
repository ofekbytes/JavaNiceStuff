
package threadExample;

public class ThreadOne extends Thread {

//	private static int intCount = 0;
	
	
	public void run(){
//		intCount++; 
//		System.out.println("intCount = " + intCount);
		System.out.println("run a Thread");
	}
	
	public static void main(String [] args)
	{
		ThreadOne td1 = new ThreadOne();
		td1.start();
	}
	
}
