//package four;
//
//import java.util.Scanner;
//
//public class WhileSample {
//	public static void main(String[] args) {
//		int count = 0;
//		int sum = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ���. : ");
//		int num = scanner.nextInt();
//		
//		while (num != -1) {
//			sum += num;
//			count += 1;
//			System.out.print("������ �Է��ϼ���. : ");
//			num = scanner.nextInt();
//		}
//		System.out.println(count + " ���� ������ " + sum + " �Դϴ�.");
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
//		System.out.println("������ �Է��ϼ���. (-1 �Է½� ����)");
//		int num = scanner.nextInt();
//		
//		while (num != -1) {
//			count += 1;
//			sum += num;
//			num = scanner.nextInt();
//		}
//		
//		if (count == 0) {
//			System.out.println("�Էµ� ���� �����ϴ�.");
//		} else {
//			System.out.println("������ ������ " + count + " �� �̸�");
//			System.out.println("����� " + (double)sum/count + " �Դϴ�.");
//		}
//		scanner.close();
//	}
//}