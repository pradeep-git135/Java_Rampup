package core_concepts;

public class ConstructorTest {
	
	ConstructorTest(){
		System.out.println("this is from constructer");
	}
	public void method1() {
		System.out.println("this is from method1");
	}

	public static void main(String[] args) {
		ConstructorTest obj = new ConstructorTest();
		obj.method1();
	}

}
