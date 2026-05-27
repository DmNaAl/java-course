class B extends A
{}

public class Program13
{
	public static void main (String args[])
    {
        A.printVars();
		A obj = new A();
		obj.printVars();//Не рекомендуется, приведение obj.printVars() к A.printVars()
		A.Print();
		obj.nonstaticPrint();
		B.printVars();
    }
}