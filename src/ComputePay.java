/*
  	ISYS 320
  	Name(s):Clayton Bruce
  	Date: 3/18/2018
*/

public class ComputePay {
	public static void main(String[] args) {
		
		int hrsworked = 21;
		double salary = 8.75;
		double payday = (hrsworked*salary);
		
		System.out.println("My total hours worked:");
		System.out.println(hrsworked);
		
		System.out.println("My hourly salary is:");
		System.out.println(salary);
		
		System.out.println("My total pay in dollars is:");
		System.out.println(payday);
	}
}
