class Sample6_1
{
	public static void main(String[] args)
	{
		Car car1 = new Car("1號車");
		car1.start();

		for(int i = 0; i < 5; i++)
		{
			System.out.println("正在進行main的處理工作");
		}
	}
}
