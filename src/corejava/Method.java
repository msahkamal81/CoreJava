package corejava;

public class Method {
	
	
	// non static Method - Void
	
	public void getAddress() {
		System.out.println("My address");
		
	}
	// static Method - void
	public static void getTime() {
		System.out.println("current time");
		
	}
	
	
    //non static Method - return type
	
	public int calculator1(int a, int b) {
		int total = a+b;
		return total;
		
	}
	
	//static Method - retun type
	
	public static int calculator2(int a, int b) {
		int total = a / b;
	return total;
	}
	

}
