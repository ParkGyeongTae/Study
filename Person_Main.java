//package four;
//
//class Person {
//	String name;
//	String id;
//	
//	// 생성자에서 name 변수 초기화
//	public Person(String name) {
//		this.name = name;
//		System.out.println("부모의 생성자 호출 : " + name);
//	}
//}
//
//// Person 클래스를 상속받는 Student 클래스
//class Student extends Person {
//	String grade;
//	String department;
//	
//	// 생성자 호출시 super 키워드를 이용하여 부모 클래스의 동명 메소드 호출
//	public Student (String name) {
//		super(name);
//		System.out.println("Consol > name : " + name);
//	}
//}
//
//public class Person_Main {
//	public static void main(String[] args) {
//		
//		// 부모 클래스의 객체 생성
//		Person person;
//		
//		// 자식 클래스 객체를 생성하고 인자를 넣어줌
//		Student student = new Student("미니");
//		
//		// 자식 클래스 객체 인스턴스를 부모 클래스 객체 인스턴스로 형을 변환함(업캐스팅)
//		person = student;
//		
//		// Person 클래스 생성자에서 부모 클래스의 메소드를 호출했지만
//		// 자식 > 부모가 아닌 자식 = 부모가 되었기 때문에 출력 시
//		// 자식 클래스의 내용 먼저 출력된다. (콘솔 창에서 출력 가능)
//		System.out.println(person.name);
//	}
//
//}
