class FirstTask
{
	byte verysmallnum;
	short smallnum;
	int num;
	long longnum;
	
	float fpi;
	double dpi;
	
	char symbol;
	boolean end;
	
	public FirstTask()
	{
	}
	
	public FirstTask(int i)
    {
		verysmallnum = 127;
		smallnum = 32767;
		num = 2147483647;
		longnum = 9223372036854775807L;
		
		fpi = (float)3.1415926535897932384626433832795028841971693993751058209749445923078164;
		dpi = 3.1415926535897932384626433832795028841971693993751058209749445923078164;
		
		symbol = 'А';
		end = true;
    }
	
	public void Execute0()
	{
		System.out.println(verysmallnum);
		System.out.println(smallnum);
		System.out.println(num);
		System.out.println(longnum);
		System.out.println(fpi);
		System.out.println(dpi);
		System.out.println(symbol);
		System.out.println(end);
	}
	
	public void Execute()
	{
		System.out.println(verysmallnum + 1);//128, так как преобразование к типу int, потому что из byte (verysmallnum) и int (1) int - более широкий
		System.out.println((byte)(verysmallnum + 1));//сужение типа: int -> byte, переполнение -> -128
		System.out.println((short)(smallnum + 1));
		System.out.println(num + 1);
		System.out.println(longnum + 1);
		System.out.println(fpi);
		System.out.println(dpi);
		System.out.println(symbol);
		System.out.println(end);
	}
}

class NamePrinter
{
    public NamePrinter()
    {
    }
    
    public void PrintName()
	{
		System.out.printf("\u0414\u043c\u0438\u0442\u0440\u0438\u0439\n");
	}
}

class Str
{
	String s;
	int num;
	
	Str(String ns, int nnum)
	{
		this.s = ns;
		this.num = nnum;
	}
	
	@Override
	public String toString()
	{
		return "string: \"" + s + "\" and number: {" + num + "}";
	}
	
	public void Print()
	{
		System.out.println("Just string: " + this.s);
	}
}

class EighthTask
{
	char c;
	
	EighthTask(char c)
	{
		this.c = c;
	}
	
	public void Print()
	{
		System.out.println("Character \'" + c + "\'(" + (int)c + ")");
	}
}

public class Program3
{
    public static void main (String args[])
    {
		FirstTask first1 = new FirstTask();
		FirstTask first2 = new FirstTask(1);
        NamePrinter name = new NamePrinter();
		
		first1.Execute0();//Значения по умолчанию
		first2.Execute();

		name.PrintName();
		
		
		{
			int a = 1;
			{
				int b = 2;
			}
			//int c = a + b; b уже перестала существовать
		}

		String year = "Year: " + 2026;
		System.out.println(year);
		
		Str fourth = new Str("something", 12);
		
		fourth.Print();
		System.out.println("Object: " + fourth);
		
		
		int a = 120;
		//byte b = a + 10;//Ошибка компиляции, несовместимые типы: возможно преобразование из int в byte с потерями данных.
		byte c = (byte)(a + 10);
		//byte d = a + 1;//Ошибка компиляции, несовместимые типы: возможно преобразование из int в byte с потерями данных.
		
		var eighth = new EighthTask('A');//Компилятор определил, что это класс EighthTask по конструктору
		eighth.Print();
    }
}