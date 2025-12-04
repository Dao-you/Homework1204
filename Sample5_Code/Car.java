class Car
{
	private int num;
	private double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("已經產生了汽車");
	}

	public void setCarInt(int n, double g)
	{
		num = n;
		gas = g;

		System.out.println("汽車編號為" + num + "汽油量設為" + gas);
	}

	public void show()
	{
		System.out.println("車輛號" + num);
		System.out.println("汽油量" + num);
	}
}
