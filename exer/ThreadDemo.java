class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		t=new Thread(this,"Demo thread");
		System.out.println("child thread" +t);
		t.start();
	}
	public void run()
	{
		try{
			for(int i=5;i>0;i--)
			{
				System.out.println("child thread"+i);
				Thread.sleep(3000);
			}
		}catch(InterruptedException e)
			{
				System.out.println("child Thread interrupted");
			}
			System.out.println("child thread exiting");
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		new NewThread();
		try{
			for(int i=5;i>0;i--)
			{
				System.out.println("main thread"+i);
				Thread.sleep(300);
			}
		}catch(InterruptedException e)
		{
			System.out.println("main Thread interrupted");
			}
			System.out.println("main thread exiting");
	}
}

			
		