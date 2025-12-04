class Sample5_2
{
	public static void main(String[] args)
	{
		try
		{
			int[] test;
			test = new int[5];

			System.out.println("嘗試確定給test[10]");

			test[10] = 80;
			System.out.println("給80確定給test[10]");
		}

		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("超過陣列的範圍了");
		}

		System.out.println("順利被執行完畢了");
	}
}
