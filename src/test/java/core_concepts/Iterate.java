package core_concepts;

public class Iterate {

	public static void main(String[] args) {
		
		String name1 = "KANNADA";
//		String names1[] = {};
//		System.out.println(name1.length());
//		name1.charAt(0);
//		System.out.println(	name1.indexOf('A'));
//		System.out.println(name1.charAt(10));
//		System.out.print(name1.charAt(0));
//		System.out.print(name1.charAt(1));
//		System.out.print(name1.charAt(2));
//		System.out.print(name1.charAt(3));
//		System.out.print(name1.charAt(4));
//		System.out.print(name1.charAt(5));
//		System.out.print(name1.charAt(6));
//		for (int i = 0; i < name1.length() ; i++) {
//			System.out.println(name1.charAt(i));
//		}
		
//		int i = 0;
//		while(i < name1.length()) {
//			System.out.println(name1.charAt(i));
//			i++;
//		}
		
//		int i = 0;
//		do {
//			System.out.println(name1.charAt(i));
//			i++;
//		}while(i< name1.length());
		
		String[] names = {"apple 1", "apple 2", "ball", "cat", "deer", "elephant"};
		
		int[] arr = {1, 2, 3, 4, 5};
		
//		for (int i = 0; i < names.length ; i++) {
//			System.out.println(names[i]);
//			for (int j = 0; j < names[i].length(); j++) {
//				System.out.println(names[i].charAt(j));
//			}
//			System.out.println("------------------------------------");
//		}
		
		for(String name:names) {
			System.out.println(name);
			for(int i=0; i<name.length(); i++) {
				System.out.println(name.charAt(i));
			}
			System.out.println("------------------------------------");
		}
		
//		for (String name :names) {
//			System.out.println(name);
//		}
		
//		for(int ele:arr) {
//			System.out.println(ele);
//		}
		
	}

}
