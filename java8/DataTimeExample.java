import java.time.*;
public class DataTimeExample 
{
	public static void main(String[] args) 
	{
		LocalDate date=LocalDate.now();

	System.out.println(date);
	int month=date.getDayOfMonth();
	int year=date.getDayOfYear();
	System.out.println(month);
	System.out.println(year);
	}
}
