package projects;

public class MyThread extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread is running..");
}
 	public static void main( String args[] )
 	{
  		MyThread mt = new  MyThread();
  		mt.start();
 	}
}
