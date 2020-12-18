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
//		// 레퍼런스 student를 이용하면 name, dept에 접근 가능
//		Student student = new Student("MadPlay");
//		
//		// 레퍼런스 person을 이용하면 Student 객체의 멤버 중
//		// 오직 Person 클래스의 멤버만 접근이 가능
//		Person person = student;
//		person.name = "kimtaeng";
//		
//		// 아래 문장은 컴파일 타임 오류
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