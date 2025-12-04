class Sample5_4
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
			System.out.println("發生了" + e + "這種例外");
		}

		finally
		{
			System.out.println("會在一會執行這處理");
		}

		System.out.println("順利被執行完畢了");
	}
}
