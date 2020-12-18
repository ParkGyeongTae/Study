//package four;
//
//import java.util.Scanner;
//
//public class BreakExample {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("exit를 입력하면 종료합니다.");
//		String text = scanner.nextLine();
//		while (text.equals("exit")) {
//			System.out.print(" >> ");
//			text = scanner.nextLine();
//		}
//		System.out.println("종료합니다.");
//		scanner.close();
//	}
//}

//package four;
//
//import java.util.Scanner;
//
//public class BreakExample {
//	public static void main (String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("exit를 입력하면 종료합니다.");
//		
//		while (true) {
//			System.out.print(" >> ");
//			String text = scanner.nextLine();
//			if (text.equals("exit")) {
//				break;
//			}
//		}
//		System.out.println("종료합니다.");
//		scanner.close();
//	}
//}