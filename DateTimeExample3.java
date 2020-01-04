package javadatetime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateTimeExample3 
{
	public static void main(String args[])
	{
		//ISO Date
		LocalDate localdate =LocalDate.now();
		DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(localdate.format(dateFormatter));
		
		// yyyy/mm/dd pattern
		DateTimeFormatter dateFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(localdate.format(dateFormatter1));
		
		//MMMM dd, yyyy pattern
		DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		System.out.println(localdate.format(dateFormatter2));
		
		//dd-MMM-yyyy pattern
		DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(localdate.format(dateFormatter3));
		
		//dd-LL-yyyy pattern
		DateTimeFormatter dateFormatter4 = DateTimeFormatter.ofPattern("dd-LL-yyyy");
		System.out.println(localdate.format(dateFormatter4));
	}

}
