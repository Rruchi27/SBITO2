import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		 
		Employee e1 = new Employee(320,"Priya",52000);
		Employee e2 = new Employee(525,"Dheeraj",70000);
		Employee e3 = new Employee(722,"Shikha",62000);
		Employee e4 = new Employee(426,"dinesh",82000);
		Employee e5 = new Employee(626,"Jibin",45600);
		Employee e6 = new Employee(808,"ruchi",52000);
		Employee e7 = new Employee(415,"vachas",50000);
		Employee e8 = new Employee(752,"dhirendra",62000);
		Employee e9 = new Employee(792,"disha",35000);
		Employee e10 = new Employee(859,"ramana",45000);	
		
		TreeSet<Employee> staff = new TreeSet <Employee> ();
		System.out.println("tree set has started ");
		
		System.out.println("trying to add 1st employee details ");
		staff.add(e1);
		
		System.out.println("trying to add 2nd employee details ");
		staff.add(e2);
		
		System.out.println("trying to add 3rd employee details ");
		staff.add(e3);
		
		System.out.println("trying to add 4th employee details ");
		staff.add(e4);
		
		System.out.println("trying to add 5th employee details ");
		staff.add(e5);
		
		System.out.println("trying to add 6th employee details ");
		staff.add(e6);
		
		System.out.println("trying to add 7th employee details ");
		staff.add(e7);
		
		System.out.println("trying to add 8th employee details ");
		staff.add(e8);
		
		System.out.println("trying to add 9th employee details ");
		staff.add(e9);
		
		System.out.println("trying to add 10th employee details ");
		staff.add(e10);
		
		System.out.println("added the details of 10th employee ");
		
		Iterator<Employee> iterator = staff.iterator();
		
		while(iterator.hasNext())
		{
			Employee theemp = iterator.next();
			System.out.println("employee : " +theemp );
		}
		
		
	}

}

