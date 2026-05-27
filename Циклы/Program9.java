public class Program9
{
	public static void main (String args[])
    {
        //while (true)
		//{
		//    System.out.println("Infinite while loop");
		//}
		
		//do
		//{
		//    System.out.println("Infinite do-while loop");
		//} while (true);
		//Эти циклы бесконечны
		
		
		for (int i = 0; i < 10; i++)
		{
			if (i == 7)
			{
				break; // выход из цикла
			}
			if (i % 2 == 1)
			{
				continue;
			}
			System.out.print(i + " ");
		}
		//Вывод: 0 2 4 6
    }
}