//package three;
//import java.util.Scanner;
//
//public class WhileSample {
//	
//	public static void main (String[] avgs) {
//		
//		// count 는 입력된 정수의 개수
//		int count = 0;
//		// sum 은 합
//		int sum = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
//		
//		// 정수 입력
//		int n = scanner.nextInt();
//		
//		// -1이 입력되면 while문을 벗어남
//		while (n != -1) {
//			sum += n;
//			count++;
//			// 정수 입력
//			n = scanner.nextInt();
//		}
//		
//		if (count == 0) {
//			System.out.println("입력된 수가 없습니다.");
//		} else {
//			System.out.print("정수의 개수는 " + count + "개 이며");
//			System.out.println("평균은 " + (double)sum/count + "입니다.");
//		}
//		
//	}
//}
