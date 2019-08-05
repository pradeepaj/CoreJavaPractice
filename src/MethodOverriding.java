abstract class A {
	// abstract class we can add both abstract and concrete methods
	public Number m1(float  a , int b) {
		System.out.println("Concrete Method of class A");
		return 0;
	}
	// will happen between base class to sub class same method name and same parameters
	
	public Number m4(int a , float b) {
		System.out.println("Concrete Method of class A method m4");
		return 0;
	}

	static void m2() {
		System.out.println("Static Method of class A");
	}

	final void m3() {
		System.out.println("Final Method");
	}
	abstract void m5();
		void n() {
			System.out.println("concrete method");
		}
	
}

class B extends A {
	
	//  for different return types using wrapper class overriding is possible
	//wrapper class mainly used in collections
	public Integer m1(int b , float a) {
		System.out.println("Overrided Concrete Method of class B" +(a+b));
		return 0;
	}
	public Float m4(float a , int b) {
		System.out.println("Concrete Method of class B m4");
		return 0f;
	}
	static void m2() {
		System.out.println("sttaic Method of class B");
	}
	@Override
	void m5() {
		System.out.println(" abstract body");
		
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		B b = new B();
		b.n();
		b.m1(10f, 10);
		b.m4(10f,10);
		b.m4(10, 10f);
	}

}
