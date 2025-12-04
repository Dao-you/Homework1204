public class Sample4_10
{
	public static void main(String[] args)
	{
		Vehicle[] vc = new Vehicle[2];

		vc[0] = new Car(1234, 20.5);
		vc[0].setSpeed(60);

		vc[1] = new Plane(232);
		vc[1].setSpeed(500);

		for (int i = 0; i < vc.length; i++)
		{
			vc[i].show();
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

	void setSpeed(int s)
	{
	}

	void show()
	{
		System.out.println("車輛號" + num);
		System.out.println("汽油量" + gas);
	}
}

class Plane extends Vehicle
{
	private int flight;

	public Plane(int f)
	{
		flight = f;
	}

	void setSpeed(int s)
	{
	}

	void show()
	{
		System.out.println("飛行距離" + flight);
	}
}
