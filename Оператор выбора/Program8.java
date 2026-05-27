enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

public class Program8
{
	private static void IncorrectSwitch()
	{
		Day day;
		
		day	= Day.MONDAY;
		
		switch (day)
		{
			case MONDAY:
				System.out.println("It's Monday!");
				day = Day.TUESDAY;
				break;
			case TUESDAY:
			    System.out.println("It's Tuesday!");
				day = Day.WEDNESDAY;
				break;
			case WEDNESDAY:
			    System.out.println("It's Wednesday!");
				day = Day.THURSDAY;
				break;
			case THURSDAY:
				System.out.println("It's Thursday!");
				day = Day.FRIDAY;
				break;
			case FRIDAY:
			    System.out.println("It's Friday!");
				day = Day.SATURDAY;
				break;
			case SATURDAY:
			    System.out.println("It's Saturday!");
				day = Day.SUNDAY;
				break;
			case SUNDAY:
			    System.out.println("It's Sunday!");
				day = Day.MONDAY;
				break;
		}
		//Будет выведено:
		//It's Monday!
		
		day = Day.MONDAY;
		
		switch (day)
		{		
			case MONDAY:
				System.out.println("It's Monday!");
				day = Day.TUESDAY;
			case TUESDAY:
			    System.out.println("It's Tuesday!");
				day = Day.WEDNESDAY;
			case WEDNESDAY:
			    System.out.println("It's Wednesday!");
				day = Day.THURSDAY;
			case THURSDAY:
				System.out.println("It's Thursday!");
				day = Day.FRIDAY;
			case FRIDAY:
			    System.out.println("It's Friday!");
				day = Day.SATURDAY;
				break;
			case SATURDAY:
			    System.out.println("It's Saturday!");
				day = Day.SUNDAY;
				break;
			case SUNDAY:
			    System.out.println("It's Sunday!");
				day = Day.MONDAY;
				break;
		}
		//Будет выведено:
		//It's Monday!
		//It's Tuesday!
		//It's Wednesday!
		//It's Thursday!
		//It's Friday!
	}
	
	public static void main (String args[])
    {
        byte a1 = 2;
		short a2 = 2;
		char a3 = '2';
		int a4 = 2;
		
		Byte a12 = 2;
		Short a22 = 2;
		Character a32 = '2';
		Integer a42 = 2;
		
		String a5 = "50";
		
		// Нельзя использовать:
		// long
		// float
		// double
		// boolean
		
		switch (a1)
		{
			case 1:
				System.out.println("Wrong!");
				break;
			case 2:
			    System.out.println("Correct!");
				break;
			default:
			    System.out.println("Unknown value");
				break;
		}
		
		switch (a2)
		{
			case 1:
				System.out.println("Wrong!");
				break;
			case 2:
			    System.out.println("Correct!");
				break;
		}
		
		switch (a3)
		{
			case '1':
				System.out.println("Wrong!");
				break;
			case '2':
			    System.out.println("Correct!");
				break;
		}
		
		switch (a4)
		{
			case 1:
				System.out.println("Wrong!");
				break;
			case 2:
			    System.out.println("Correct!");
				break;
		}
		
		switch (a12)
		{
			case 1:
				System.out.println("Wrong!");
				break;
			case 2:
			    System.out.println("Correct!");
				break;
		}
		
		switch (a22)
		{
			case 1:
				System.out.println("Wrong!");
				break;
			case 2:
			    System.out.println("Correct!");
				break;
		}
		
		switch (a32)
		{
			case '1':
				System.out.println("Wrong!");
				break;
			case '2':
			    System.out.println("Correct!");
				break;
		}
		
		switch (a42)
		{
			case 1:
				System.out.println("Wrong!");
				break;
			case 2:
			    System.out.println("Correct!");
				break;
		}
		
		switch (a5)
		{
			case "10":
				System.out.println("Wrong!");
				break;
			case "50":
			    System.out.println("Correct!");
				break;
		}
		
		IncorrectSwitch();
    }
}