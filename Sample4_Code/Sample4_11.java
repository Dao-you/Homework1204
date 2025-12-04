public class Sample4_11
{
	public static void main(String[] args)
	{
		Vehicle[] vc;
		vc = new Vehicle[2];

		vc[0] = new Car(1234, 20.5);
		vc[1] = new Plane(232);

		for (int i = 0; i < vc.length; i++)
		{
			if (vc[i] instanceof Car)
				System.out.println("第" + (i + 1) + "個固位是Car類別");
			else
				System.out.println("第" + (i + 1) + "個固位不是Car類別");
		}
	}
}

abstract class Vehicle
{
	abstract void show();
}

class Car extends Vehicle
{
	private int num;
	private double gas;

	public Car(int n, double g)
	{
		num = n;
		gas = g;
	}

	void show()
	{
	}
}

class Plane extends Vehicle
{
	private int flight;

	public Plane(int f)
	{
		flight = f;
	}

	void show()
	{
	}
}
