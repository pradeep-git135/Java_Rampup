package core_concepts;

abstract class Demo{
	
	final int x = 20;
	int y = 50;
	abstract  void withfrawMoney(int amount);
	public static void demo2() {
		System.out.println("I am from demo-2");
	}
	public  void demo3() {
		System.out.println("I am from demo-3 from parent/super class");
	}
	public final void demo4() {
		System.out.println("I am from demo-4");
	}
}

public final class DemoAbstraction extends Demo {
	
	public void withfrawMoney(int amount) {
		int currentBalence = 2000;
		if (amount<=currentBalence) {
			int updatedBalence = currentBalence-amount;
			System.out.println("amount "+amount+" is withdrawned from the account and the balence in your account is "+updatedBalence);
		}
		else {
			System.out.println("sorry you have an insufficient balence");
		}
	}
	public void demo3() {
		System.out.println("I am from demo-3 from sub/child-Class");
	}
	
//	public final void demo4() {
//		System.out.println("I am from demo-4 from child class");
//	}
	
	public static void main(String[] args) {
		DemoAbstraction obj_abstraction = new DemoAbstraction();
		obj_abstraction.withfrawMoney(2500);
		System.out.println(obj_abstraction.y);
		System.out.println("modidying the value of y");
		obj_abstraction.y = 1000;
		System.out.println(obj_abstraction.y);
		
		System.out.println(obj_abstraction.x);
		System.out.println("modidying the value of x");
//		obj_abstraction.x = 2000;  compile time error 
		obj_abstraction.demo3();
		demo2();

	}

}

