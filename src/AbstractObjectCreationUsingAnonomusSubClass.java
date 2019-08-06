
abstract class Aj{
	
	public void print() {
		System.out.println("abstract Aj");
	}
}



public class AbstractObjectCreationUsingAnonomusSubClass {

	public static void main(String[] args) {
		Aj a=new Aj() {};
		a.print();
		
	}

}
