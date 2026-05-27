import java.util.Scanner;

class NameHolder
{
    protected String name;

    public NameHolder()
    {
        this.name = "";
    }
    
    public void EnterName()
    {
		Scanner scan = new Scanner(System.in, "CP866");
		System.out.println("Введи своё имя: ");
		this.name = scan.next();
    }
	
	public void PrintHello()
	{
		System.out.printf("Привет, %s\n", this.name);
	}
}

public class Program2
{
    public static void main (String args[])
    {
        NameHolder first = new NameHolder();

        first.EnterName();
		first.PrintHello();
    }
}