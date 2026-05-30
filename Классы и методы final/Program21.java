class Parent
{
    public void normalMethod()
	{
        System.out.println("Родительский класс");
    }

    public final void finalMethod()
	{
        System.out.println("Непереопределяемый метод");
    }
}

final class Child extends Parent
{
    @Override
    public void normalMethod()
	{
        System.out.println("Подкласс");
    }

    //Ошибка компиляции
    @Override
    public void finalMethod()
	{
        System.out.println("Попытка изменить неизменяемое");
    }
}

//Ошибка компиляции
class Uncompilable extends Child
{}