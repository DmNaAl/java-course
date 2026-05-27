class Test
{
	public Test()
	{}
	
	public void First()
	{
		int i1 = 128;
		Integer a1 = i1;
		Integer b1 = i1;
		System.out.println("a1==i1 " + (a1 == i1));// true (Unboxing)
		System.out.println("b1==i1 " + (b1 == i1));// true (Unboxing)
		System.out.println("a1==b1 " + (a1 == b1));// false (pointer comparison, 128 is out of IntegerCache)
		System.out.println("a1.equals(i1) -> " + a1.equals(i1));// true (128 = 128)
		System.out.println("b1.equals(i1) -> " + b1.equals(i1));// true (128 = 128)
		System.out.println("a1.equals(b1) -> " + a1.equals(b1));// true (128 = 128)
		
		int i2 = 127;
		Integer a2 = i2;
		Integer b2 = i2;
		System.out.println("a2==i2 " + (a2 == i2));// true (Unboxing)
		System.out.println("b2==i2 " + (b2 == i2));// true (Unboxing)
		System.out.println("a2==b2 " + (a2 == b2));// true (pointer comparison, 127 is in IntegerCache)
		System.out.println("a2.equals(i2) -> " + a2.equals(i2));// true (127 = 127)
		System.out.println("b2.equals(i2) -> " + b2.equals(i2));// true (127 = 127)
		System.out.println("a2.equals(b2) -> " + a2.equals(b2));// true (127 = 127)
	}
}

class Program6
{
	public static void main (String args[])
	{
		Integer dec = Integer.decode("123");// 123
		Integer hex = Integer.decode("0x7B");// 123
		Integer oct = Integer.decode("0173");// 123
		Integer x = 10;
		
		System.out.println(x.compareTo(hex));// -1, т. к. 10 меньше 123
		System.out.println(oct.equals(hex) && hex.equals(dec) && dec.equals(123));// true
		
		Boolean b1 = Boolean.valueOf(true);
		Boolean b2 = Boolean.valueOf(false);
		Boolean b3 = Boolean.valueOf("tRuE");// true
		Boolean b4 = Boolean.valueOf("apple");// false
		Boolean b5 = true;
		Boolean b6 = Boolean.parseBoolean("true");// true
		Boolean b7 = new Boolean(true);// deprecated, использовать не рекомендуется
		Boolean b8 = new Boolean("true");// deprecated, использовать не рекомендуется
		System.out.println(b1 && !b2 && b3 && !b4 && b5 && b6 && b7 && b8);// true
		
		Integer num = null;
		//int othernum = num; - NullPointerException
		
		Test test = new Test();
		
		test.First();
	}
}