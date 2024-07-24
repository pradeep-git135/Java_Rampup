package core_concepts;

import java.util.Iterator;

public class FlowControlStatementsDemo {
	/**
	 * in this class we are going to demonstrate different flow control statements 
	 * 1) descision making sytatements
	 * 2)looping statements 
	 * 3)jumping statements 
	 * @param args
	 */

	public static void main(String[] args) {
		// 1) descision making sytatements
		//		simple if
//				if-else
//				if-else lader
//				nested if 
//			syntax: 
//					if( condidtion exression  ){
//						statements 
//					}
		
//		int a = 100;
//		int b = 10;
//		
//		if(a == b) {
//			System.out.println(" value of a and b are equal");
//		}
//		
//		if(a >= b) {
//			System.out.println(" value of a greater than  b ");
//		}
//		
//		if(5 == 5) {
//			System.out.println(" values are equal");
//		}
		
//		if-else
		
//		syntax : if(){
//		}
		
//		int a = 100;
//		int b = 10;
//		
//		if(a == b) {
//			System.out.println(" value of a and b are equal");
//		}
//		else {
//			System.out.println(" value of a and b are not equal");
//		}
		
//		int a = 100;
//		int b = 1000;
//		
//		if(a == b) {
//			System.out.println(" value of a and b are equal");
//		}
//		else if (a>b) {
//			System.out.println(" value of a is greater than b");
//		}
//		else {
//			System.out.println(" value of b is greater than a");
//
//		}
		
//		int n = -10;
//		if (n!=0) {
//			if(n>0) {
//				System.out.println("n is a positive intiger");
//			}
//			else {
//				System.out.println("n is a negetive intiger");
//			}
//		}else {
//			System.out.println("n is a zero intiger");
//		}
		
//		switch (0) {
//		case 1:
//			System.out.println("sunday");
//			break;
//		case 2:
//			System.out.println("monday");
//			break;
//		case 3:
//			System.out.println("tuesday");
//			break;
//		case 4:
//			System.out.println("wednesday");
//			break;
//		case 5:
//			System.out.println("thursday");
//			break;
//		case 6:
//			System.out.println("friday");
//			break;
//		case 7:
//			System.out.println("saturday");
//			break;
//		default:
//			System.out.println("please enter the valid key");
//			break;
//	}
		
		
//		System.out.println("welcome to java");
//		System.out.println("welcome to java");
//		System.out.println("welcome to java");
//		System.out.println("welcome to java");
		
//		for(int i = 1;i<=5; i++) {
//			System.out.println("welcome to java");
//		}
		
//		int i;
////		System.out.println("outside of for loop value of i before initialization "+i);
//		
//		for(i=1;i<=5; i++) {
//			System.out.println(i);
//		}
//		System.out.println("outside of for loop value of i after initialization "+i);
		
//		for (int j = 2; j <=10; j++) {
//			System.out.println(j);
//		}
//		
//		System.out.println("===================================================");
//		
//		for (int j = 0; j <=10; j++) {
//			if(j%2 != 0) {
//				System.out.println(j);
//			}
//			
//		}
			
//		System.out.println("comparing 2 strings");
//		String name1 = "pradeep";
//		String name2 = "PRADEEP";
//		if(name1.equalsIgnoreCase(name2)) {
//			System.out.println("both are equal");
//		}
//		else {
//			System.out.println("not equal");
//		}
		
		
//		int i = 1;
//		System.out.println("before while loopp value of i is "+i);
//		while (i<6) {
//			System.out.println(i);
//			i++;
//		}
//		System.out.println("after while loopp value of i is "+i);
		
//		int i = 0;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i<4);
//		System.out.println("after while loopp value of i is "+i);
//		
//		int i;
//		for(i=1;i<=5; i++) {
//			if (i == 3) {
////				continue;
//				break;
//			}
//			System.out.println(i);
//		}
		
//		String Location = "INDIA";
//		
////		System.out.println(Location.length());
//		
//		for(int k = 0; k<Location.length(); k++) {
//			System.out.println(Location.charAt(k));
//		}
		
		String[] names = {"apple", "ball", "cat", "deer"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
//		for (String name : names) {
//			System.out.println(name);
//		}
//		
		
		
	}

}
