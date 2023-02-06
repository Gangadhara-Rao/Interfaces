package Interfaces;
interface A{
	
}
class B implements A{
	void display() {
		System.out.println("Hello World");
	}
}
public class InterfaceExample  {
	public static void main(String args[]) {
		B b=new B();
		b.display();
	}

}
