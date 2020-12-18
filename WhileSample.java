//package four;
//
//import java.util.Scanner;
//
//public class WhileSample {
//	public static void main(String[] args) {
//		int count = 0;
//		int sum = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("정수를 입력하세요. : ");
//		int num = scanner.nextInt();
//		
//		while (num != -1) {
//			sum += num;
//			count += 1;
//			System.out.print("정수를 입력하세요. : ");
//			num = scanner.nextInt();
//		}
//		System.out.println(count + " 개의 총합은 " + sum + " 입니다.");
//		scanner.close();
//	}
//}

//package four;
//
//import java.util.Scanner;
//
//public class WhileSample {
//	public static void main (String[] args) {
//		int count = 0;
//		int sum = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수를 입력하세요. (-1 입력시 종료)");
//		int num = scanner.nextInt();
//		
//		while (num != -1) {
//			count += 1;
//			sum += num;
//			num = scanner.nextInt();
//		}
//		
//		if (count == 0) {
//			System.out.println("입력된 수가 없습니다.");
//		} else {
//			System.out.println("정수의 개수는 " + count + " 개 이며");
//			System.out.println("평균은 " + (double)sum/count + " 입니다.");
//		}
//		scanner.close();
//	}
//}