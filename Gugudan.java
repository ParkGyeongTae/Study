//package three;
//
//import java.util.Scanner;
//
//public class Gugudan {
//	public static void main(String[] args) {
//
//		// 범위가 벗어났을 경우 계속 입력하기 위한 무한 반복문 사용
//		for ( ; ; ) {
//			System.out.print("1 ~ 9 임의의 숫자를 입력하세요. : ");
//			Scanner sDan = new Scanner(System.in);
//			int dan = sDan.nextInt();
//			
//			// 1 ~ 9 까지의 범위일 때 실행
//			if (dan < 10) {
//				
//				// 단이 정해지면 계산 및 출력을 하기위한 반복문
//				for (int su = 1; su < 10; su++) {
//					System.out.println(dan+"*"+su+"="+dan*su);
//				
//				// 계산이 완료되면 STOP !
//				} break;
//			} else {
//				System.out.println("1 ~ 9까지의 숫자를 다시 입력해주세요. : ");
//				
//				// 1 ~ 9 까지 범위 안에 없을시 다시 for문으로 돌아가기 위해
//				continue;
//			}
//		}
//	}
//}