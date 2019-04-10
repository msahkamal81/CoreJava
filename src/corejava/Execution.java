package corejava;

public class Execution {
	public static void main(String [] args) {
		//object Creation of A Class
		Computer refVar1 = new Computer();
		
		//Class name + reference variable = new constructor
		refVar1.model = "Asus";
		System.out.println(refVar1.model);
		//when we run int we did not need like String?
		
		Computer refVar2 = new Computer(2019);
		Computer refVar3 = new Computer ("MAc");
		//Its also object?
		
		System.out.println(refVar1.display);
		System.out.println(Computer.keys);
		
		//Method =Its object creation?+ new constructor?
				Method method = new Method();
				method.getAddress();
		         Method.getTime();
		 
		
		
	}
	
     
	
}
