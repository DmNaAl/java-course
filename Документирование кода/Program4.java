import java.util.Scanner;

/**
* Класс, печатающий введённое из консоли имя
* @author Найденович Дмитрий
* @version 1.0
*/
class NameHolder
{
    protected String name;

    public NameHolder()
    {
        this.name = "";
    }
    
	/**
	* Ждёт, пока пользователь введёт непустую строку. В строке должен быть хотя бы один непробельный символ. Работа велась в консоли Windows [cmd.exe].
	*/
    public void EnterName()
    {
		Scanner scan = new Scanner(System.in, "CP866");
		System.out.println("Введи своё имя: ");
		this.name = scan.next();
    }
	
	/**
	* Печатает приветствие, используя в качестве имени поле name.
	*/
	public void PrintHello()
	{
		System.out.printf("Привет, %s\n", this.name);
	}
}

public class Program4
{
    public static void main (String args[])
    {
        NameHolder first = new NameHolder();

        first.EnterName();
		first.PrintHello();
    }
}