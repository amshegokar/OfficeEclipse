
public class StaticMethodCall {

	public static void m1() {
		System.out.println("Hello...");
		
	}
	public static void main(String[] args) {
		StaticMethodCall call2=new StaticMethodCall();
		call2.m2();
		
		StaticMethodCall call=null;
		call.equals(null);
		call.m1();
		
		Integer i1=new Integer(null);
		i1.intValue();
		System.out.println();
		//String s1=new String(null);
		
		
	
	}
	
	public   void m2() {
		this.equals(null);
		
		System.out.println(Integer.valueOf(1));
		System.out.println((Long.valueOf(1)));;
		System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));

		System.out.println("Atul".equals(null));
		System.out.println("The result is :"+(null instanceof String));
		System.out.println("Hello... from.... m2");
		
	}
}
