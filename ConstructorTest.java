//package three;
//
//class StudentBean {
//	
//	// 멤버 필드 선언
//	private int kor;
//	private int eng;
//	private int mat;
//	
//	// 매개변수가 없는 생성자
//	public StudentBean() {
//		System.out.println("기본 생성자");
//	}
//	
//	// 매개변수가 존재하는 생성자 (위 생성자 매소드 오버로딩)
//	public StudentBean(int a, int b, int c) {
//		
//		this(); // 위 생성자 매소드 오버로딩
//		kor = a;
//		eng = b;
//		mat = c;
//	}
//	
//	// 결과값 출력 메소드
//	public void disp() {
//		System.out.println("국어 점수의 값 : " + kor);
//		System.out.println("영어 점수의 값 : " + eng);
//		System.out.println("수학 점수의 값 : " + mat);
//	}
//}
//
//public class ConstructorTest {
//	
//	public static void main(String[] args) {
//		
//		// 오버로딩 된 생성자 호출
//		StudentBean Obj1 = new StudentBean(70, 60, 80);
//		
//		// 매개변수가 없는 생성자 호출
//		StudentBean Obj2 = new StudentBean();
//		
//		// 결과 값 출력하는 메소드 호출
//		Obj1.disp();
//		Obj2.disp();
//	}
//}