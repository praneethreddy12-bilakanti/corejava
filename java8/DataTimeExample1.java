import java.time.*;
public class DataTimeExample1
{
	public static void main(String[] args) 
	{
		LocalTime time=LocalTime.now();

	System.out.println(time);
	int min=time.getMinute();
	int sec=time.getSecond();
	System.out.println(min);
	System.out.println(sec);
	}
}
