enum Day
{
	MONDAY(false), 
	TUESDAY(false), 
	WEDNESDAY(false), 
	THURSDAY(false), 
	FRIDAY(false), 
	SATURDAY(true), 
	SUNDAY(true);
	
	private final boolean dayoff;
	
	Day(boolean isOff)
	{
		this.dayoff = isOff;
	}
	
	public boolean isDayOff()
	{
        return dayoff;
    }
}

public class Program19
{
	public static void main(String[] args)
	{
		Day today = Day.SATURDAY;

        if (today.isDayOff())
		{
            System.out.println(today + " - выходной день!");
        }
		else
		{
            System.out.println(today + " - обычный день.");
        }
	}
}