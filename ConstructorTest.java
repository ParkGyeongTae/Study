//package three;
//
//class StudentBean {
//	
//	// ��� �ʵ� ����
//	private int kor;
//	private int eng;
//	private int mat;
//	
//	// �Ű������� ���� ������
//	public StudentBean() {
//		System.out.println("�⺻ ������");
//	}
//	
//	// �Ű������� �����ϴ� ������ (�� ������ �żҵ� �����ε�)
//	public StudentBean(int a, int b, int c) {
//		
//		this(); // �� ������ �żҵ� �����ε�
//		kor = a;
//		eng = b;
//		mat = c;
//	}
//	
//	// ����� ��� �޼ҵ�
//	public void disp() {
//		System.out.println("���� ������ �� : " + kor);
//		System.out.println("���� ������ �� : " + eng);
//		System.out.println("���� ������ �� : " + mat);
//	}
//}
//
//public class ConstructorTest {
//	
//	public static void main(String[] args) {
//		
//		// �����ε� �� ������ ȣ��
//		StudentBean Obj1 = new StudentBean(70, 60, 80);
//		
//		// �Ű������� ���� ������ ȣ��
//		StudentBean Obj2 = new StudentBean();
//		
//		// ��� �� ����ϴ� �޼ҵ� ȣ��
//		Obj1.disp();
//		Obj2.disp();
//	}
//}