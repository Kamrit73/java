class bike
{
	void run()
	{
		System.out.println("running");
	}
}
class poly extends bike
{
		void run()
		{
			System.out.println("runs with 60kmph");
		}
		public static void main(String args[])
		{
			bike b=new poly();
			b.run();
		}
}