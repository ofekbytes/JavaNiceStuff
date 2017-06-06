
package threadExample;

public class ThreadTwo extends Thread {


	public String PuStName;
	
	
	public ThreadTwo(String StName) {		
		PuStName = StName;
	}


	
	public void run(){		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(PuStName + " ==> " + i);
		}	
	}
	
	public static void main(String [] args)
	{
		ThreadTwo td1 = new ThreadTwo("Thread_1");
		ThreadTwo td2 = new ThreadTwo("Thread_2");
		
		
		td1.start();
		td2.start();		

	}
}
