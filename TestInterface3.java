package Interfaces;


interface Print{  
void print();  
}  
interface Show extends Print{  
void show();  
}  
class TestInterface4 implements Show{  
public void print(){
	System.out.println("Hello");
	}  
public void show(){
	System.out.println("Welcome");
	}
}
public class TestInterface3 {
	public static void main(String args[]){  
		TestInterface4 obj = new TestInterface4();  
		obj.print();  
		obj.show();  
		 }  
}
