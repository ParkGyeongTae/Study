//package three;
//
//import java.util.Scanner;
//
//public class Factorial {
//	
//	public static void main(String[] args) {
//		
//		System.out.print("팩토리얼 계산을 위한 정수값 입력 : ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		int fac = 0;
//		for (int i = 1; i <= num; i++) {
//			fac += i;
//		}
//		System.out.println(num + " 까지의 합은 : " +fac);
//	}
//}

//package three;
//
//import java.util.Scanner;
//
//public class Factorial {
//	
//	public static void main(String[] args) {
//		
//		System.out.println("팩토리얼 계산을 위한 정수값 입력 : ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		int fac = 1;
//		
//		for (int i = num; i > 0; i--) {
//			fac = fac * i;
//		}
//		
//		System.out.println(num + " 까지의 곱 : " + fac);
//	}
//}

//package three;
//
//import java.util.Scanner;
//
//public class Factorial {
//	
//	public static void main(String[] args) {
//		
//		System.out.print("팩토리얼 계산을 위한 정수값 입력 : ");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		int result = 1;
//		
//		for (int i = 1; i <= num; i++) {
//			result *= i;
//		}
//		
//		System.out.println(num + " 까지의 곱(팩토리얼) : " + result);
//	}
//}