import java.util.ArrayList;
import java.util.List;

public class GenericMethodCall {

	
	public static void main(String[] args) {
		
		
		
		//List<String> l1=new ArrayList<String>();
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Atul");
		l1.add("Amol");
		l1.add("Bhavana");
		m1(l1);
		
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(10);
		l2.add(60);
		l2.add(40);
		
	/*	ArrayList<?> l3=new ArrayList<>();
		l3.add(50);
		*/
		
		//m2(l1);
		m2(l2);
		
	}
	
	
	public static void m1(ArrayList<String> l) {
		l.add("Mukesh");
		l.add(null);
		l.add(null);
		//l.add(10);//CE
		System.out.println(l);
	}
	
	public static void m2(ArrayList< ? extends Number> l) {
		//l.add("Mukesh");
		//l.add(null);
		l.add(null);
		//l.add(10);//CE
		System.out.println(l);
	}
}
