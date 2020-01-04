package javadatetime;
import java.time.LocalDate;
import java.time.Month;
public class DateTimeExample 
{
	public static void main(String args[])
	{
		//current date
		LocalDate localdate = LocalDate.now();
		System.out.println("Today's Date is : "+localdate);
		
		//Specific Date
		LocalDate localdate2 = LocalDate.of(2020, Month.JANUARY, 02);
		System.out.println(localdate2);
		LocalDate localdate3 = LocalDate.of(2019, Month.AUGUST, 15);
		System.out.println(localdate3);
		
		System.out.println("Year : "+localdate.getYear());
		System.out.println("Month : "+localdate.getMonth().getValue());
		System.out.println("Day of Month : "+localdate.getDayOfMonth());
		System.out.println("Day of the Week : "+localdate.getDayOfWeek());
		System.out.println("Day of Year : "+localdate.getDayOfYear());
		
		//LocalDate's plus method
		System.out.println("Addition of days : "+localdate.plusDays(5));
		System.out.println("Addition of months : "+localdate.plusMonths(15));
		System.out.println("Addition of weeks : "+localdate.plusWeeks(45));
		System.out.println("Addition of years : "+localdate.plusYears(5));
		
		//LocalDate's minus method
		System.out.println("Substraction  of days : "+localdate.minusDays(5));
		System.out.println("Substraction of months : "+localdate.minusMonths(15));
		System.out.println("Substraction of weeks : "+localdate.minusWeeks(45));
		System.out.println("Substraction of years : "+localdate.minusYears(5));
		
		//isEqual() example
		if(localdate.isEqual(localdate2))
		{
			System.out.println("localDate1 and localDate2 are equal");
		}
		else
		{
			System.out.println("localDate1 and localDate2 are not equal");
		}
		
		// ifAfter() example
		if(localdate2.isAfter(localdate3))
		{
			System.out.println("localDate2 comes after localDate3");
		}
		
		// isBefore() example
		if(localdate3.isBefore(localdate))
		{
			System.out.println("localDate3 comes before localDate1");
		}
		
	}

}
