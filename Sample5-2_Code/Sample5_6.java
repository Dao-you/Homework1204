import java.io.BufferedReader;

class Sample5_6
{
	public static void main(String[] args)
	{
		System.out.println("請輸入字串");

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();

			System.out.println("已讀取的字串是" + str);
		}

		catch(IOException e)
		{
			System.out.println("輸入出錯誤");
		}
	}
}
