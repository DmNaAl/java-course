import java.util.ArrayList;
import java.util.List;

class A
{
	void f()
	{
		System.out.println("Метод A");
	}
}

class B extends A
{
	void g()
	{
		System.out.println("Метод B");
	}
}

class MyContainer<T>
{
	private T content;
	
	public MyContainer(T content)
	{
        this.content = content;
    }
	
	public void isNumber()
	{
		//Проверка именно наполнения
        if (content instanceof Number)
		{
            System.out.println("Это контейнер числа");
        }
    }
}

public class Program17
{
	//List<B> не является наследником List<A>, хотя B является наследником A
	public static void fForAll(List<? extends A> allA)
	{
        for (A a : allA)
		{
            a.f();//Работает, так как <? extends A> сообщает компилятору, что все элементы allA либо сами являются объектами класса A, либо его наследниками
        }
		//В allA нельзя ничего записывать, так как компилятор не знает, относятся ли объекты к классу A, классу B или какому-то C.
	}
	
	public static void addDogs(List<? super B> allB)
	{
        allB.add(new B());//Можно добавлять B и его наследников
        allB.add(new B());

        // Object obj = allB.get(0); // Читать можно ТОЛЬКО в Object
        // B b = allB.get(0); //Нельзя, так как может быть список A или Object
    }
	
	
	
    public static void main(String[] args)
	{
        Object obj = new MyContainer<Number>(14.0);
		
		//if (obj instanceof MyContainer<Number>)
		//{
		//}
		//Это невозможно
		((MyContainer)obj).isNumber();
		
		//Wildcard
        if (obj instanceof MyContainer<?>)
		{
            System.out.println("Это мой контейнер");
		}
		
		
		
		List<B> allB = List.of(new B(), new B());
    }
}