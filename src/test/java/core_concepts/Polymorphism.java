package core_concepts;

class Sample{
	
	public void introduction() {
		System.out.println("I am from Sample class intro method");
	}
}


public class Polymorphism extends Sample  {
	
	public void introduction() {
		System.out.println("my name is Pradeep and I am  from Karnataka");
	}
	
	public void introduction(String Name) {
		System.out.println("my name is "+Name  +"and I am  from Karnataka");
	}
	
	public void introduction(String Name, int age) {
		System.out.println("myself  "+Name +" and I am "+age+" years old");
	}
	
	public void introduction(int age, String Name) {
		System.out.println("my name is "+Name  +"and I am "+age+"years old");
	}
	
	public static void main(String[] args) {
		Polymorphism inst = new Polymorphism();
		
		inst.introduction();
		
		Sample inst2 = new Polymorphism();
		
		inst2.introduction();
		
		
		
		
//		inst.introduction("Pradeep", 28);
//		inst.introduction("xyz", 100);
//		inst.introduction(27, "Tejaswini");
//		inst.introduction();
	}

}
