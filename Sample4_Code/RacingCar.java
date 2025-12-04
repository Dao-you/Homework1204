public class RacingCar extends Car
{
	private int course;

	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}

	public RacingCar(int n, double g, int c)
	{
		num = n;
		gas = g;
		course = c;
	}

	public void setCourse(int c)
	{
		course = c;
		System.out.println("嘗試邊給給設為" + course);
	}

	public void show()
	{
		System.out.println("車輛號" + num);
		System.out.println("汽油量" + gas);
		System.out.println("嘗試邊給給設為" + course);
	}

	public void newShow()
	{
	}
}
