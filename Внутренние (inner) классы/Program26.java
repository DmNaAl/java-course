class Outer
{
	public int I;
	private int J;
    //public внутренние классы доступны абсолютно везде
	public PublicInner pubObj = new PublicInner();
    public class PublicInner
	{
		public int i;
		private int j;
		
		public void method1()
		{
			System.out.println("Публичный метод публичного внутреннего класса");
		}
		
		private void method()
		{
			I = -1;
			J = -1;
			System.out.println("Приватный метод публичного внутреннего класса");
		}
	}

    //protected внутренние классы доступны в этом пакете и в наследниках Outer в чужих пакетах
	protected ProtectedInner prtObj = new ProtectedInner();
    protected class ProtectedInner {}

    //default внутренние классы доступны только внутри package1
	DefaultInner dflObj = new DefaultInner();
    class DefaultInner {}

    //private внутренние классы доступны только внутри Outer
	PrivateInner prvObj = new PrivateInner();
    private class PrivateInner
	{
		public int i;
		private int j;
		
		public void method1()
		{
			System.out.println("Публичный метод приватного внутреннего класса");
		}
		
		private void method()
		{
			I = 1;
			J = 1;
			Method1();
			Method2();
			System.out.println("Приватный метод приватного внутреннего класса");
		}
	}
	
	public void Method2()
	{
		System.out.println("Публичный метод внешнего класса");
	}
	
	private void Method1()
	{
		System.out.println("Приватный метод внешнего класса");
	}
	
	void Method()
	{
		pubObj.i = -1;
		pubObj.j = -1;
		prvObj.i = 1;
		prvObj.j = 1;
		
		pubObj.method();
		pubObj.method1();
		prvObj.method();
		prvObj.method1();
	}
}

//Если внутренний класс не объявлен как static (то есть, если внутренний класс не является вложенным классом), он может свободно обращаться к полям и методам внешнего класса.
//Внешний класс может свободно обращаться к любым полям и методам внутреннего класса

public class Program26
{
	public static void main(String[] args)
	{
		Outer obj = new Outer();
		
		obj.Method();
	}
}