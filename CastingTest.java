//package four;
//
//class Person {
//	String name;
//	
//	public Person(String name) {
//		this.name = name;
//	}
//}
//
//class Student extends Person {
//	String dept;
//	
//	public Student(String name) {
//		super(name);
//	}
//}
//
//public class CastingTest {
//	public static void main(String [] args) {
//		
//		// ���۷��� student�� �̿��ϸ� name, dept�� ���� ����
//		Student student = new Student("MadPlay");
//		
//		// ���۷��� person�� �̿��ϸ� Student ��ü�� ��� ��
//		// ���� Person Ŭ������ ����� ������ ����
//		Person person = student;
//		person.name = "kimtaeng";
//		
//		// �Ʒ� ������ ������ Ÿ�� ����
////		person.dept = "Computer Eng";
//	}
//}

//package four;
//
//class Person {
//	String name;
//	public Person(String name) {
//		this.name = name;
//	}
//}
//class Student extends Person {
//	String dept;
//	public Student(String name) {
//		super(name);
//	}
//}
//public class CastingTest {
//	public static void main(String [] args) {
//		Student student = new Student("MadPlay");
//		Person person = student;
//		person.name = "kimtaeng";
//	}
//}