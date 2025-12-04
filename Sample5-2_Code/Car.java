class Car
{
	private int num;
	private double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
	}

	public void setCar(int n, double g) throws CarException
	{
		if (n < 0 || g < 0.0)
		{
			throw new CarException("不能用負的數值");
		}

		num = n;
		gas = g;
	}

	public void show()
	{
		System.out.println("車輛號" + num);
		System.out.println("汽油量" + gas);
	}
}
