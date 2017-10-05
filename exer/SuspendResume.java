class NewThread implements Runnable
{
	String name;
	Thread t;
	NewThread(String Threadname)
	{
		name=Threadname;
		t=new Thread(this,name);
		System.out.println("new thread:"+t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=5;i>=0;i--)	
			{
						System.out.println(name +":"+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
			{
				System.out.println(name+"interrupted");
			}
			System.out.println(name+"thread exititing");
	}
}
class SuspendResume
{
	public static void main(String args[])
	{
		NewThread ob1=new NewThread("one");
		NewThread ob2=new NewThread("two");
		try
		{
			Thread.sleep(1000);
			System.out.println("suspending thread one");
			ob1.t.suspend();
			Thread.sleep(1000);	
			ob1.t.resume();
			System.out.println("resuming thread one");
			System.out.println("suspending thread two");
			ob2.t.suspend();
			Thread.sleep(1000);
			ob2.t.resume();
			System.out.println("resuming thread two");
		}catch(InterruptedException e)
		{
			System.out.println("main thread interuupted");
		}
		try
		{
				System.out.println("waiting for threads to finish");
				ob1.t.join();
				ob2.t.join();
		}catch(InterruptedException e)
		{
			System.out.println("main thread interupted");
		}
		System.out.println("Main thread exiting");
	}
}