//package four;
//
//import java.util.*;
//
//public class ArrayListEx {
//	public static void main(String[] args) {
//		
//		// ���ڿ��� ���� ������ ArrayList �÷��� ����
//		ArrayList<String> a = new ArrayList<String>();
//		
//		// Ű����κ��� 4�� �̸� �Է¹޾� ArrayList �� ����
//		Scanner scanner = new Scanner(System.in);
//		for (int i = 0; i < 4; i++) {
//			System.out.print("�̸��� �Է��ϼ��� >> ");
//			// Ű����κ��� �̸� �Է�
//			String s = scanner.next();
//			// ArrayList �÷��ǿ� ����
//			a.add(s);
//		}
//		
//		// ArrayList�� ����ִ� ��� �̸� ���
//		for (int i = 0; i < a.size(); i++) {
//			String name = a.get(i);
//			System.out.println(name + " ");
//		}
//		
//		// ���� �� �̸� ���
//		int longestIndex = 0;
//		
//		for (int i = 1; i < a.size(); i++) {
//			if (a.get(longestIndex).length() < a.get(i).length()) {
//				longestIndex = i;
//			}
//		}
//		
//		System.out.println("\n���� �� �̸��� : " + a.get(longestIndex));
//	
//	scanner.close();
//	}
//}
