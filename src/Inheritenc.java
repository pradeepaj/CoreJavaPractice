class X{
	public void q1() {
		System.out.println("class X");
	}
	
}

class Y extends X{
	public void w1() {
		System.out.println("class Y");
	}
	
}
class Z extends Y{
	public void e() {
		System.out.println("class Z");
	}
}


public class Inheritenc {

	public static void main(String [] args) {
		Z x=new Z();
		x.q1();
		
		x.w1();
		x.e();
	}
}
