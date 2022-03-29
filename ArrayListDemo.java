import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Log l1 = new Log("Missed","01.01.2022","Trisha");
		Log l2 = new Log("Dialed","22.11.2022","Farhan");
		Log l3 = new Log("Called","25.05.2022","Raju");
		
					
		ArrayList<Log> data1 = new ArrayList <Log> ();
		System.out.println("ArrayList  has started ");
		
		System.out.println("Display details of 1st log " +l1);
		data1.add(l1);
		
		System.out.println("Display details of 2nd log " +l2);
		data1.add(l2);
		
		System.out.println("Display details of 3rd log " +l3);
		data1.add(l3);
		
		Iterator<Log> iterator = data1.iterator();
		
		while(iterator.hasNext())
		{
			Log logg = iterator.next();
			System.out.println("Log details : " +logg );
		}
		
	}

}
class Log
{
	String logType;
	String logDate;
	//LocalDate logDate = LocalDate.now();
	String Name;
	public Log(String logType, String logDate, String name) {
		super();
		this.logType = logType;
		this.logDate = logDate;
		Name = name;
	}
	@Override
	public String toString() {
		return "Log [logType=" + logType + ", logDate=" + logDate + ", Name=" + Name + "]";
	}
	
	
}