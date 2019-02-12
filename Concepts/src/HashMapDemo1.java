import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	
	public static void main(String[] args) {
		
		//Hashtable h=new Hashtable();
		HashMap h=new HashMap();
		h.put(new Temp(5), "A");
		h.put(new Temp(16), "B");
		h.put(new Temp(23), "C");
		h.put(new Temp(2), "D");
		h.put(new Temp(1), "E");
		h.put(new Temp(6), "F");
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		Set<Map.Entry> keys=h.entrySet();
		
		for(Map.Entry m1:keys) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(h);
		System.out.println();
		Set s=h.entrySet();
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			if(m1.getKey().equals(new Temp(23)))
				m1.setValue("CCCCCCCCCCCC");
			
			System.out.println(m1);
		}
		System.out.println();
		System.out.println(h);
	}
}


class Temp{
	int i;
	
	public Temp(int i) {
		this.i=i;
	}
	
	public String toString() {
		return i+"";
	}
	
	public int hashCode() {
		return i;
	}
}