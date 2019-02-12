import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		Customer c1=new Customer(100, "Atul");
		Customer c2=new Customer(100, "Atul");
		Customer c3=new Customer(200, "Amol");
		Customer c4=new Customer(300, "Asmis");
		
		TreeSet<Customer> ts1=new TreeSet<Customer>();
		ts1.add(c1);
		ts1.add(c2);
		ts1.add(c3);
		ts1.add(c4);
		
		for (Customer customer : ts1) {
			System.out.println(customer);
		}
		
	}
}

class Customer implements Comparable {

	private int id;
	private String name;;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		 Customer other=(Customer)o;
		 
		 if(this.getId()>other.getId())
		 return +1;
		 else if(this.getId()<other.getId())
			 return -1;
		 else
		return 0;
	}

}
