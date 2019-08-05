

abstract class Abs{
 
	abstract void m1() ;
	
	static void m2() {
		System.out.println("concrete method");
	}
	
	Abs(){
		
	}
}
class C extends Abs {

	@Override
	void m1() {
		System.out.println("implemebted method");
		
	}
	static class K{
		//for static we can use for inner classes 
		
		void r() {
			System.out.println("Inner class");
		}
	}
	
}

public class Abstract {
	public static void main(String [] args) {
		C b = new C();
		b.m1();
		Abs.m2();
		C.K c1=new C.K();
		c1.r();
		
		
	}
	
	}

