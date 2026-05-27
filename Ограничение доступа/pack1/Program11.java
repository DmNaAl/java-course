package pack1;

import pack2.B;

public class Program11
{
    public static void main(String[] args)
	{

        A obj = new A();

        System.out.println("In same package pack1: ");

        System.out.println(obj.pub);//public доступен
        System.out.println(obj.prot);//protected доступен (тот же пакет)
        System.out.println(obj.def);//default доступен (тот же пакет)

        //System.out.println(obj.priv); private не доступен

        obj.showInsideA();//Но можно вызвать метод
		
		B obj2 = new B();
        obj2.showAccess();
    }
}