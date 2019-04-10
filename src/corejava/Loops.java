package corejava;

import java.util.ArrayList;

public class Loops {
	public static void main(String[] args) {
		
		
	for (int s = 0; s<5;s-- ){
			System.out.println("I don't love java : And value of s is = "+s);
 		}
				
		
	//While loop
			int a = 0;
			while (a<5) {
				System.out.println("I don't love java : And value of s is = "+a);
				a++;
			}
		
			
			
			//enhanced for loop
			//create an array and insert 3 names
			
			String array[] = {"gm","em","dm","bm"};
			
		
			int array2[]= {5,6,7,8};
			
			System.out.println("lenth of array is "+array.length);
			
			
			for(String s: array) {
				System.out.println("my name is "+s);
			}
		
			
			//do while
			int z = 10;
			do {
				System.out.println("my number is "+z);
				z++;
			}
			while (z<20);
			
			ArrayList <String> arrayList = new ArrayList<>();
			System.out.println(arrayList.size());
			
			
			for(int b =0; b<5;b++) {
				System.out.println(b);
				arrayList.add("akm");
			}
			System.out.println(arrayList.size());
			System.out.println(arrayList.get(3));
			
			
	}
	
	
	

}
