//package three;
//import java.util.Scanner;
//
//public class WhileSample {
//	
//	public static void main (String[] avgs) {
//		
//		// count �� �Էµ� ������ ����
//		int count = 0;
//		// sum �� ��
//		int sum = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
//		
//		// ���� �Է�
//		int n = scanner.nextInt();
//		
//		// -1�� �ԷµǸ� while���� ���
//		while (n != -1) {
//			sum += n;
//			count++;
//			// ���� �Է�
//			n = scanner.nextInt();
//		}
//		
//		if (count == 0) {
//			System.out.println("�Էµ� ���� �����ϴ�.");
//		} else {
//			System.out.print("������ ������ " + count + "�� �̸�");
//			System.out.println("����� " + (double)sum/count + "�Դϴ�.");
//		}
//		
//	}
//}
