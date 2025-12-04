import java.io.BufferedReader;

class Sample5_8
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));

			String str1 = br.readLine();
			String str2 = br.readLine();

			System.out.println("已輸入置於的第一行是" + str1);
			System.out.println("已輸入置於的第二行是" + str2);

			br.close();
		}

		catch(IOException e)
		{
			System.out.println("輸出入錯誤");
		}
	}
}
