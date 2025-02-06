/******************************************************************************

2. Interfaces to be implemented by first non-abstract class
Make an interface ‘Testable’ that contains a method declaration for display ( ). 
a) Create a class ‘Test’ that implements Testable. Compile this class, and write your
observations.
b) Create another abstract class ‘AbsTest’ implements Testable. Compile this class, 
and write your observations.
 Note: Did you notice that methods in an interface are ‘public’ by default?

*******************************************************************************/


// class Test implements Testable{
//     public void display(){
//         System.out.println("This is the test Class");
//     }
// }

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Test t = new Test();
		t.show();
		t.display();
		
	}
}

