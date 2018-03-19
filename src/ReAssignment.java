/*
  	ISYS 320
  	Name(s): Clayton Bruce
  	Date:  3/18/2018
*/

/*
 	Your predicted values for variables a, b, and c
	a => 6
	b =>9
	c => 16
 
 	After testing the statements in the main method, indicate above if your predictions were correct.
 	-Predictions were correct!!
*/

public class ReAssignment {

	public static void main(String[] args) {
		
		int a = 5; 
		int b = 10; 
		int c = b;
		a = a + 1; 
		b = b - 1; 
		c = c + a;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
