import java.util.HashMap;

public class Employee {

	private int id;
	private String name;
	private double salary;
	static int count;
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	{
		count++;
		System.out.println("The employee count is :"+count);
	}

	public Employee(double salary) {
		super();
		this.salary = salary;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------");
		
		HashMap hm=new HashMap();
		
		System.out.println(hm.put("Atul", "M1"));;
		System.out.println(hm.put("Amol", "M2"));;
		System.out.println(hm.put("Mohan", "M3"));;
		System.out.println(hm.put("Sohan", "M4"));;
		System.out.println(hm.put("Atul", "M1111"));;
		
		System.out.println("-------------------------------------------");
		
		Employee e1=new Employee();
		Employee e2=new Employee(10);
		Employee e3=new Employee("Atul");
		Employee e4=new Employee("Sameer");
		Employee e5=new Employee(54321.23);
		Employee e6=new Employee(55,"Amshegokar",54321.23);
		
		
	}
	
	
}
