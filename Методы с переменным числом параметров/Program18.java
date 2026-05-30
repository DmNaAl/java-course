class Summation
{
	public void Sum(int... numbers)
	{
		int res = 0;
		for (int a : numbers)
		{
			res += a;
		}
		System.out.println(res);
	}
	
	public void Sum(int a)
	{
		System.out.println(a);
	}
	
	public void Sum(int a, int b)
	{
		System.out.println(a + b);
	}
	
	//Невозможно скомпилировать вместе с остальными из-за неоднозначности
	//public void Sum(int a, int... numbers)
	//{
	//}
}

public class Program18
{
	public static void main(String[] args)
	{
		Summation obj = new Summation();
		
		obj.Sum();//Подходит только Sum(int... numbers)
		obj.Sum(1);//Подходит Sum(int... numbers) и Sum(int a), Sum(int a) приоритетнее
		obj.Sum(1, 2);//Подходит Sum(int... numbers) и Sum(int a, int b), Sum(int a, int b) приоритетнее
		obj.Sum(1, 2, 3);//Подходит только Sum(int... numbers)
	}
}