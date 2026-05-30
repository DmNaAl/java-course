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
		System.out.println("Вновь поле Child: " + field);//3
		System.out.println("Поле Parent: " + super.field);//2
    }
	
	public void method3()
	{
        super.method();//Вызывается Parent.method()
    }
	
	Child()
	{
		this(0);//Вызывается другой конструктор Child
	}
	
	Child(int i)
	{
		super();//Вызывается конструктор Parent
		field = 3;
	}
}



class A {
  int a1;
  public int a2;
  protected int a3;
  private int a4;

  void method1() {}

  public void method2() {}

  protected void method3() {}
  
  private void method4() {}

}

class B extends A {
	//default поля A - полностью доступны, но, если бы класс-наследник находился в другом пакете, то присутствовали бы, но НЕ были бы доступны
	//public поля A - полностью доступны
	//protected поля A - полностью доступны
	//private поля A - присутствуют, но НЕ доступны
}

class C extends B {
	//default поля A - полностью доступны, но, если бы класс-наследник находился в другом пакете, то присутствовали бы, но НЕ были бы доступны
	//public поля A - полностью доступны
	//protected поля A - полностью доступны
	//private поля A - присутствуют, но НЕ доступны
}



public class Program20
{
	public static void main(String[] args)
	{
		Child obj = new Child();

        obj.method();
		obj.method2();
		obj.method3();
	}
}