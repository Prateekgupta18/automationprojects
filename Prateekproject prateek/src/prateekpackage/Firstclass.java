package prateekpackage;

public class Firstclass extends Firstclass2 {

	public void demo()
	{
		System.out.println("child class");
	}
	
	
	public static void main(String[] args) {
		//System.out.println("hello new java");
		Firstclass hello = new Firstclass();
		hello.demo();
		Firstclass2 hello1 = new Firstclass2();
		hello1.demo();
		//run time polymorphism
		Firstclass2 hello3 = new Firstclass();
		hello3.demo();
		
	}

}