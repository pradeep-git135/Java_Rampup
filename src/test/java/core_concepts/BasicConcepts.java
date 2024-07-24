package core_concepts;

//single line comments double forword slash

/*
 * in this class we are demonstratiung the basic concepts of java programming 
 * 
 * syntax to create calss
 * modifier class ClassName{
 * 
 * }
 * 
 * syntax to create method or function
 * 
 * modifier returnType methodName(parameters){
 * 
 * } 
 */

public class BasicConcepts { 
	
	String classmember = "class veriable ";
	
	public int method1() {
		return 10;
	}
	
	public void method2() {
		System.out.println("Hello from method2");
	}
	
	public int addition(int a, int b){
		int result = a+b;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Java from main method ");
		BasicConcepts child = new BasicConcepts();  //object creation
		System.out.println(child.classmember );
		child.method2();
		int value = child.method1();
		System.out.println(value);
		
//		int sum = child.addition(5, 7);
//		System.out.println("addition of given numbers is "+sum);
		
//		String name = "Pradeep";
//		String location = "Shivamoga";
//		int experiance = 4;
//		
//		System.out.println("Hello team myself " + name +" and I am from "+location +" and I am having "+ experiance + " years of experiance ");
//	
	}
		
}
