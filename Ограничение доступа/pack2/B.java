package pack2;

import pack1.A;

public class B extends A
{

    public void showAccess()
	{

        System.out.println("In subclass in another package:");

        System.out.println(pub);//public — доступен
        System.out.println(prot);//protected — доступен через наследование

        //System.out.println(def); default — не доступен
        //System.out.println(priv); private — не доступен
    }
}