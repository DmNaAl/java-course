class Summation
{
    public int sum(int a, int b)
	{
        return a + b;
    }
	
	//Перегрузка метода int sum(int a, int b)
    public int sum(int a, int b, int c)
	{
        return a + b + c;
    }
}

class Der extends Summation
{
	//Переопределение метода int sum(int a, int b)
	public int sum(int a, int b)
	{
		System.out.println(a + b);
        return a + b;
    }
	
	//@Override здесь вызывает ошибку компиляции, так как double sum(double a, double b, double c) не переопределяет никаких методов суперкласса
	//@Override
	public double sum(double a, double b, double c)
	{
        return a + b + c;
    }
}

public class Program23
{
	public static void main(String[] args)
	{
		Summation obj1 = new Summation();
		Der obj2 = new Der();

        obj1.sum(1, 2);
		obj1.sum(1, 2, 3);
		obj2.sum(1, 2);
	}
}