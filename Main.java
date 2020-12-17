//package three;
//
//class Parent {
//	
//	int age = 45;
//	String name = "Parent";
//	
//	// 기본 생성자
//	public Parent () {
//		System.out.println("Parent Default Constructor");
//	}
//	
//	// 매개변수가 있는 생성자
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
//	// 매개변수가 있는 생성자
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
	
	// 매개변수가 없는 생성자 호출
	public Parent() {
		System.out.println("Parent Default Constructor");
	}
	
	// 매개변수가 있는 생성자 호출
	public Parent(int _age, String _name) {
		age = _age;
		name = _name;
		System.out.println("Parent Constructor");
	}
	
	// showInfo 매소드
	public void showInfo() {
		System.out.println("Name : " + name + ", Age : " + age);
	}
}

class Child extends Parent {
	
	// 매개변수가 없는 생성자 호출
	public Child() {
	}
	
	// 매개변수가 있는 생성자 호출
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