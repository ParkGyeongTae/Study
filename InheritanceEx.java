//package five;
//
//class Person {
//	
//	private int weight;
//	int age;
//	protected int height;
//	public String name;
//	
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//	
//	public int getWeight() {
//		return weight;
//	}
//}
//
//class Student extends Person {
//	public void set() {
//		age = 30;
//		name = "홍길동";
//		height = 175;
//		setWeight(99);
//	}
//	
//	public void showStudent() {
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("키 : " + height);
////		System.out.println("몸무게 : " + setWeight(100));
//	}
//}
//
//public class InheritanceEx {
//	public static void main(String[] args) {
//		Student s = new Student();
//		s.set();
//		s.showStudent();
//	}
//}