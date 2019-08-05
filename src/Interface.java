



interface Client {
	
		void pp();

		//from java 8 we can default and static method how much you can
		default void w() {// default method can override
			System.out.println( "default in interface");
		}
		static void e() {// static method we cant override
			System.out.println("static in interface");
		}
		
	}
class P implements Client {

	@Override
	public void pp() {
		System.out.println("concrete method");
	}
	@Override
	public void w()
	{
		System.out.println(" default from class p");
	}
	
}

public class Interface {

	public static void main(String [] args) {
		Client i =new P();
		i.pp();
		i.w();
		Client.e();
		
	
}}


