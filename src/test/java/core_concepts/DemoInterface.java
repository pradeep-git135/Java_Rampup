package core_concepts;

interface Sample1{
	int x = 10;
	public void method1();
	
}

interface Sample2{
	int x = 20;
	public void method1();
}

interface Sample3 extends Sample2{
	public void method2();
}

public class DemoInterface implements Sample3, Sample1 {
	
	public void method1() {
		System.out.println("implementing the method-1");
	}
	public void method2() {
		System.out.println("implementing the method-2");
	}

	public static void main(String[] args) {
		DemoInterface obj = new DemoInterface();
		obj.method1();
		System.out.println(Sample1.x);
		System.out.println(Sample2.x);
//		System.out.println(x);
	}

}
