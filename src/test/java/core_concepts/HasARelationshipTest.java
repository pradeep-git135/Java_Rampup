package core_concepts;

 class Ship{
	 
	 int z = 1000;
	
	public void display() {
		System.out.println("I am from Ship");
	}
	
	public void display2() {
		System.out.println("I am from Ship class and display 2 method ");
	}
}

public class HasARelationshipTest {
	
	public void method1() {
		Ship sp = new Ship();
		 System.out.println(sp.z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HasARelationshipTest inst = new HasARelationshipTest();
		 inst.method1();
		 
//		 Ship sp = new Ship();
//		 System.out.println(sp.z);
//		 sp.display();

	}

}
