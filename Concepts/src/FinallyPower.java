
public class FinallyPower {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println(returnSomething());
	}
	
	public static int returnSomething() throws InterruptedException {
		try {
			//return 50;
			throw new RuntimeException("Foo!!");
			
		}catch (Exception e) {
			e.printStackTrace();;
			Thread.sleep(5*1000);
		}
		
		finally {
			Thread.sleep(5*1000);
			return 0;
		}
	}
}


