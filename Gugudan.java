//package three;
//
//import java.util.Scanner;
//
//public class Gugudan {
//	public static void main(String[] args) {
//
//		// ������ ����� ��� ��� �Է��ϱ� ���� ���� �ݺ��� ���
//		for ( ; ; ) {
//			System.out.print("1 ~ 9 ������ ���ڸ� �Է��ϼ���. : ");
//			Scanner sDan = new Scanner(System.in);
//			int dan = sDan.nextInt();
//			
//			// 1 ~ 9 ������ ������ �� ����
//			if (dan < 10) {
//				
//				// ���� �������� ��� �� ����� �ϱ����� �ݺ���
//				for (int su = 1; su < 10; su++) {
//					System.out.println(dan+"*"+su+"="+dan*su);
//				
//				// ����� �Ϸ�Ǹ� STOP !
//				} break;
//			} else {
//				System.out.println("1 ~ 9������ ���ڸ� �ٽ� �Է����ּ���. : ");
//				
//				// 1 ~ 9 ���� ���� �ȿ� ������ �ٽ� for������ ���ư��� ����
//				continue;
//			}
//		}
//	}
//}