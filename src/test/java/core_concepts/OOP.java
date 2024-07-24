package core_concepts;

class Source {
	public void Source_method() {
		System.out.println("I am from method");
	}
}

class Ref extends Source{
	
	int x = 1;
	int y = 2;
	String z = "class_ref";
	
	public void method1() {
		System.out.println("I am from method 1");
	}
}

public class OOP extends Ref {
	int a = 10;
	static int b = 20;
	public void method2() {
		System.out.println("I am from method 2");

	}
	public static void main(String[] args) {
		
		OOP inst = new OOP();  // object creation 
		Ref inst2 = new OOP();
		
//		System.out.println(a);
		System.out.println(inst.a);
		System.out.println(b);
		System.out.println("accessing the parent data members");
		System.out.println(inst.x);
		System.out.println(inst.y);
		System.out.println(inst.z);
		System.out.println("accessing the methods ");
		inst.method1();
		inst.method2();
		inst.Source_method();
	}

}
