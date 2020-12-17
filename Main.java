//package three;
//
//class Parent {
//	
//	int age = 45;
//	String name = "Parent";
//	
//	// �⺻ ������
//	public Parent () {
//		System.out.println("Parent Default Constructor");
//	}
//	
//	// �Ű������� �ִ� ������
//	public Parent (int _age, String _name) {
//		age = _age;
//		name = _name;
//		System.out.println("Parent Constructor");
//	}
//	
//	public void showInfo() {
//		System.out.println("Name : " + name + ", Age : " + age);
//	}
//}
//
//class Child extends Parent {
//	
//	// �Ű������� �ִ� ������
//	public Child (int _age, String _name) {
//		System.out.println("Child Constructor");
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		Child a = new Child(25, "REAKWON");
//		a.showInfo();
//	}
//
//}

package three;

class Parent {
	
	int age = 45;
	String name = "Parent";
	
	// �Ű������� ���� ������ ȣ��
	public Parent() {
		System.out.println("Parent Default Constructor");
	}
	
	// �Ű������� �ִ� ������ ȣ��
	public Parent(int _age, String _name) {
		age = _age;
		name = _name;
		System.out.println("Parent Constructor");
	}
	
	// showInfo �żҵ�
	public void showInfo() {
		System.out.println("Name : " + name + ", Age : " + age);
	}
}

class Child extends Parent {
	
	// �Ű������� ���� ������ ȣ��
	public Child() {
	}
	
	// �Ű������� �ִ� ������ ȣ��
	public Child(int _age, String _name) {
		super(_age, _name);
		System.out.println("Child Condstructor");
	}
	
	// Override
	public void showInfo() {
		System.out.println("Child showInfo");
		super.showInfo();
	}
}

public class Main{
	public static void main(String[] args) {
		Child a = new Child(25, "REAKWON");
		a.showInfo();
	}
}