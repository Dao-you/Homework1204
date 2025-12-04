public class Sample4_12
{
	public static void main(String[] args)
	{
		iVehicle[] ivc;
		ivc = new iVehicle[2];

		ivc[0] = new Car(1234, 20.5);
		ivc[1] = new Plane(232);

		for(int i = 0; i < ivc.length; i++)
		{
			ivc[i].show();
		}
	}
}

interface iVehicle
{
	int weight = 1000;
	void show();
}

class Car implements iVehicle
{
	private int num;
	private double gas;

	public Car(int n, double g)
	{
		num = n;
		gas = g;
	}

	public void show()
	{
		System.out.println("車輛號" + num);
		System.out.println("汽油量" + gas);
	}
}

class Plane implements iVehicle
{
	private int flight;

	public Plane(int f)
	{
		flight = f;
	}

	public void show()
	{
		System.out.println("飛行距離" + flight);
	}
}
