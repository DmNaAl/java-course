class Shape
{
    protected int x;
    protected int y;

    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void move(int newx, int newy)
    {
        this.x = newx;
        this.y = newy;
    }
}

class Point extends Shape
{
    public Point(int x, int y)
    {
        super(x, y);
    }
}

class Program5
{
	public static void main (String args[])
	{
		int a = 10;
		a += 5;
		a -= 2;
		a *= 2;
		a /= 4;
		a %= 4;
		
		String s = "Hello ";
		s += "World";
		
		int x = 10, y = 20;
		int max = (x > y) ? x : y;
		String stat = (x < 0) ? "Отрицательное" : "Неотрицательное";
		
		boolean b1 = true;
		boolean b2 = false;
		boolean res1;
		boolean res2;
		res1 = b1 || b2;//true
		res2 = b1 && b2;//false
		
		int n1 = 0b1010;// 10
		int n2 = 0b1100;// 12
		
		int or  = n1 | n2;// 14
		int xor = n1 ^ n2;// 6
		int and = n1 & n2;// 8
		
		boolean b = true | false;
		
		int i = 5, j = 10;
		System.out.println(i == j);// false
		System.out.println(i != j);// true
		System.out.println(i < j); // true
		System.out.println(i >= 5);// true
		
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2);// true, но не из-за того, что строки одинаковые, а из-за того, что s1 и s2 - одинаковые ссылки на пул строк
		System.out.println(s1 != s2);// false
		
		int val = 8;
		int left = val << 2;// 32
		int right = val >> 2;// 2
		int uRight = -8 >>> 2;// 1073741822
		
		int sum = 10 + 5;
		int diff = 10 - 5;
		
		String text = "Число: " + 10;
		
		int mult = 4 * 3;
		int div = 13 / 5;// 2(целочисленное деление)
		int mod = 13 % 5;// 3
		
		int count = 5;
		System.out.println(count++);// 5
		System.out.println(count);// 6
		count = 5;
		System.out.println(++count);// 6
		
		count = 5;
		System.out.println(count--);// 5
		System.out.println(count);// 4
		
		count = 5;
		System.out.println(--count);// 4
		
		boolean flag = !true;// false
		int bitwiseNot = ~5;// -6
		
		int result = (2 + 2) * 2;
		int[] nums = {10, 20, 30};
		int first = nums[0];
		String[] words = {"A", "B"};
		//char firstc = words[0][0]; String - объект, а не массив символов
		String firstw = words[0];
		
		Shape nullshape = null;
		Point point = new Point(0, 0);
		
		System.out.println(point instanceof Point);// true
		System.out.println(point instanceof Shape);// true (Класс Point - наследник Shape)
		System.out.println(nullshape instanceof Shape);// false(для null всегда возвращается false)
	}
}
