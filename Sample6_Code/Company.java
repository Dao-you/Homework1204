class Company
{
	private int sum = 0;

	public void add(int a)
	{
		int tmp = sum;
		System.out.println("目前的合計金額是" + tmp + "元");
		System.out.println("獲到" + a + "元了");

		tmp = tmp + a;
		System.out.println("合計金額是" + tmp + "元");
		sum = tmp;
	}
}
