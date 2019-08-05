
public class MethodOverloading {
	/*
	 * public void add(int a, float b) { System.out.println(a + b); }
	 *if you pass both integer values ambiguity pblm will occure 
	 * public void add(float a, int b) { System.out.println(a + b); }
	 */
// method overloading will happen in same class, same method name and  different parameter
	//
	
	
	public void add(int a, int b) {
		System.out.println("Int Values: "+(a + b));
		
	}
	// static method we can overload overridding is not possible
	static void qw(int a) {
		System.out.println(" static qw a");
	}
	 void qw(int a , int b) {
		System.out.println(" static qw b");
	}
	public void add(float a, float b) {
		System.out.println("Float Values: "+(a + b));
		
	}
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public float add(int a) {
		return a;
	}

	public static void main(String[] args) {
		MethodOverloading c = new MethodOverloading();
		c.add(10, 20);
		System.out.println(c.add(10, 20, 30));
		System.out.println(c.add(10));
	}

}
