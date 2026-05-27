public class Program7
{
	private static void Normal(int a)
	{
		int i = 0;
		if (a == 1) {
			i = 1;
		} else if (a == 2) {
			i = 2;
		} else {
			i = 3;
		}
		
		System.out.printf("Normal for %d: %d\n", a, i);
	}
	
	private static void Ternary(int a)
	{
		int i = 0;
		i = (a == 1) ? 1 : (a == 2) ? 2 : 3;
		
		System.out.printf("Ternary for %d: %d\n", a, i);
	}
	
    public static void main (String args[])
    {
        int a;
		
		a = 1;
		Normal(a);
		Ternary(a);
		
		a = 2;
		Normal(a);
		Ternary(a);
		
		a = 3;
		Normal(a);
		Ternary(a);
    }
}