//package four;
//
//class Person {
//	String name;
//	String id;
//	
//	// �����ڿ��� name ���� �ʱ�ȭ
//	public Person(String name) {
//		this.name = name;
//		System.out.println("�θ��� ������ ȣ�� : " + name);
//	}
//}
//
//// Person Ŭ������ ��ӹ޴� Student Ŭ����
//class Student extends Person {
//	String grade;
//	String department;
//	
//	// ������ ȣ��� super Ű���带 �̿��Ͽ� �θ� Ŭ������ ���� �޼ҵ� ȣ��
//	public Student (String name) {
//		super(name);
//		System.out.println("Consol > name : " + name);
//	}
//}
//
//public class Person_Main {
//	public static void main(String[] args) {
//		
//		// �θ� Ŭ������ ��ü ����
//		Person person;
//		
//		// �ڽ� Ŭ���� ��ü�� �����ϰ� ���ڸ� �־���
//		Student student = new Student("�̴�");
//		
//		// �ڽ� Ŭ���� ��ü �ν��Ͻ��� �θ� Ŭ���� ��ü �ν��Ͻ��� ���� ��ȯ��(��ĳ����)
//		person = student;
//		
//		// Person Ŭ���� �����ڿ��� �θ� Ŭ������ �޼ҵ带 ȣ��������
//		// �ڽ� > �θ� �ƴ� �ڽ� = �θ� �Ǿ��� ������ ��� ��
//		// �ڽ� Ŭ������ ���� ���� ��µȴ�. (�ܼ� â���� ��� ����)
//		System.out.println(person.name);
//	}
//
//}
