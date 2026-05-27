class Base
{
	protected int i;
	Base()
	{
		this.i = 10;
	}
	
	Base(int k)
	{
		this.i = k - 1;
	}
	
	Base(double k)
	{
		this.i = (int)(k * 10);
	}
	
	public void Print()
	{
		System.out.println(i);
	}
}

class Der extends Base
{
	Der()
	{
		super();
	}
	
	Der(int k)
	{
		super(k);
	}
	
	Der(double k)
	{
		super(k);
	}
	
	@Override
    public void Print()
	{
		System.out.println("This is i: " + i);
	}
}

public class Program12
{
	public static void main (String args[])
    {
        Base obj1 = new Base();
		Base obj2 = new Base(5);
		Base obj3 = new Base(5.0);
		
		Der obj4 = new Der(5);
		
		obj1.Print();// 10
		obj2.Print();// 4
		obj3.Print();// 50
		obj4.Print();// This is i: 4
    }
}