package javadatetime;

import java.time.OffsetDateTime;

public class JavaOffsetDateTimeExample 
{
	public static void main(String args[])
	{
		OffsetDateTime offsetDT = OffsetDateTime.now();
		System.out.println(offsetDT.getDayOfMonth());
		System.out.println(offsetDT.getDayOfYear());
		System.out.println(offsetDT.getDayOfWeek());
		System.out.println(offsetDT.toLocalDate());
		OffsetDateTime value1 = offsetDT.minusDays(240);
		System.out.println(value1);
		OffsetDateTime value2 = offsetDT.plusDays(240);
		System.out.println(value2);
		
		
				
	}

}
