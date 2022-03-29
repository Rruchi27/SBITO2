
public class ObjectArrayTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"jack",45600);
		Employee e2 = new Employee(102,"jill",36000);
		Employee e3 = new Employee(103,"bunny",60000);
		
		Employee staff[] = new Employee[5];
		
		staff[0] = new Employee(101,"Palak",88000);
		staff[1] = new Employee(102,"Sukhvinder",67000);
		staff[2] = new Employee(103,"Ankit",100000);
		staff[3] = new Employee(104,"kirti",70000);
		staff[4] = new Employee(105,"barkha",50000);
		
		for (int i=0; i< staff.length; i++)
		{
			System.out.println("staff details are as follow" +staff[i]);
		}
		
		
		
		
	}

}

class Employee implements Comparable<Employee>
{
	int employeeNumber;
	String employeeName;
	float salary;
	public Employee(int employeeNumber, String employeeName, float salary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", salary=" + salary
				+ "]";
	}
	@Override
	public int compareTo(Employee o) {
		System.out.println("Comparing  "+employeeNumber+" with "+ o.employeeNumber);
		return Integer.compare(employeeNumber, o.employeeNumber);
		
	}
	
	
}