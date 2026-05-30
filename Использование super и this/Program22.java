class Parent
{
	protected int field;
	
    public void method()
	{
        System.out.println("Метод суперкласса");
    }
	
	Parent()
	{
		field = 2;
	}
}

class Child extends Parent
{
	protected int field;
	
    public void method()
	{
        System.out.println("Метод подкласса");
    }
	
	public void method2()
	{
        System.out.println("Поле Child: " + this.field);//3
		System.out.println("Поле Parent: " + super.field);//Вызывается Parent.field
    }
	
	public void method3()
	{
        super.method();//Вызывается Parent.method()
    }
	
	Child()
	{
		super();//Вызывается конструктор Parent
		field = 3;
	}
}



//Практика 2
//Код отработает корректно, super.method() в классе C вызовет method() класса A
//int a = super.a запишет значение a из класса A в локальную переменную метода method() класса C
//class A {
//  int a;
//  void method() {}
//}
//
//class B extends A {
//}
//
//class C extends B {
//  void method() {
//    int a = super.a;
//    super.method();
//  }
//}



//Практика 3
class A
{
	int a;
	int b;
	int c;
	int z;

	public A()
	{
    	this(0);
	}

	public A(int a)
	{
		this(a, 0);
	}

	public A(int a, int b)
	{
		this(a, b, 0);
	}

	public A(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.z = 1;
	}
}

public class Program22
{
	public static void main(String[] args)
	{
		Child obj = new Child();

        obj.method();
		obj.method2();
		obj.method3();
	}
}