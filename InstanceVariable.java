//package three;
//
//class Student {
//	int m_nkor;
//	int m_nEng;
//	int m_nMat;
//}
//
//public class InstanceVariable {
//	public static void main(String[] args) {
//		Student obj = new Student();
//		
//		obj.m_nEng = 40;
//		obj.m_nMat = 50;
//		
//		System.out.println("obj�� �������� = " + obj.m_nkor);
//		System.out.println("obj�� �������� = " + obj.m_nMat);
//		System.out.println("obj�� �������� = " + obj.m_nEng);
//	}
//
//}

//package three;
//
//class Student {
//	
//	int m_nKor;
//	int m_nEng;
//	int m_nMat;
//
//	static String g_strTeacher = "�豸";
//}
//
//public class InstanceVariable {
//	public static void main(String[] args) {
//		Student obj = new Student();
//		
//		obj.m_nEng = 40;
//		obj.m_nMat = 50;
//		
//		System.out.println("obj�� �������� : " + obj.m_nKor);
//		System.out.println("obj�� �������� : " + obj.m_nMat);
//		System.out.println("obj�� �������� : " + obj.m_nEng);
//		
//		System.out.println("Student�� ������ : " + Student.g_strTeacher);
//		
//		System.out.println("obj�� ������ : " + obj.g_strTeacher);
//		
//		Student.g_strTeacher = "���߱�";
//		System.out.println("obj�� ������ : " + obj.g_strTeacher);
//	}
//}
//
//package three;
//
//class Student {
//	
//	// �ʵ��� �������
//	int m_nKor;
//	int m_nEng;
//	int m_nMat;
//	
//	// ��� ������ ���� �����ִ� set �޼ҵ�
//	public void set(int a, int b, int c) {
//		
//		m_nKor = a;
//		m_nEng = b;
//		m_nMat = c;
//	}
//	
//	// ���������ڰ� public �̰�
//	// ��ȯ���� double ����
//	// ��, ��, ���� ����� ���ϴ� �Լ�
//	public double calc() {
//		
//		double avg;
//		avg = (m_nKor + m_nEng + m_nMat) / 3.0;
//		return avg;
//	}
//	
//	// ���������ڰ� public �̰�
//	// ��ȯ���� ����
//	// ����� ���
//	public void disp() {
//		System.out.println("����� " + calc() + " �Դϴ�.");
//	}
//}
//
//public class InstanceVariable {
//	public static void main(String [] args) {
//		
//		// ��ü ����
//		Student obj = new Student();
//		
//		// ��, ��, �� ���� ���ϱ�
//		obj.set(80, 65, 85);
//		
//		// ��� ���
//		obj.disp();
//	}
//}

//package three;
//
//class Student {
//	
//	int m_nKor;
//	int m_nEng;
//	int m_nMat;
//	
//	public void set(int a, int b, int c) {
//		
//		m_nKor = a;
//		m_nEng = b;
//		m_nMat = c;
//	}
//	
//	// �����ε� : �Լ��� �̸��� ������ �Ű������� ������ �ٸ���.
//	public void set(int a, int b) {
//		
//		m_nKor = a;
//		m_nEng = b;
//		m_nMat = 0;
//	}
//	
//	public double calc() {
//		
//		double avg;
//		avg = (m_nKor + m_nEng + m_nMat) / 3.0;
//		return avg;
//	}
//	
//	public void disp() {
//		
//		System.out.println("����� " + calc() + "�Դϴ�.");
//	}
//}
//
//public class InstanceVariable {
//	public static void main(String[] args) {
//		Student obj1 = new Student();
//		Student obj2 = new Student();
//		
//		obj1.set(80, 65, 85);
//		obj2.set(90, 87);
//		
//		obj1.disp();
//		obj2.disp();
//	}
//}