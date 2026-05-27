package pack1;

public class A
{

    public int pub = 1;
    protected int prot = 2;
    int def = 3;//default (package-private)
    private int priv = 4;

    public void showInsideA()
	{
        System.out.println("Inside A:");
        System.out.println(pub);
        System.out.println(prot);
        System.out.println(def);
        System.out.println(priv);
    }

    public int getPriv()
	{
        return priv;//доступ к private через метод
    }
}