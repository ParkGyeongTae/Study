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
//		System.out.println("obj의 국어점수 = " + obj.m_nkor);
//		System.out.println("obj의 수학점수 = " + obj.m_nMat);
//		System.out.println("obj의 영어점수 = " + obj.m_nEng);
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
//	static String g_strTeacher = "김구";
//}
//
//public class InstanceVariable {
//	public static void main(String[] args) {
//		Student obj = new Student();
//		
//		obj.m_nEng = 40;
//		obj.m_nMat = 50;
//		
//		System.out.println("obj의 국어점수 : " + obj.m_nKor);
//		System.out.println("obj의 수학점수 : " + obj.m_nMat);
//		System.out.println("obj의 영어점수 : " + obj.m_nEng);
//		
//		System.out.println("Student의 선생님 : " + Student.g_strTeacher);
//		
//		System.out.println("obj의 선생님 : " + obj.g_strTeacher);
//		
//		Student.g_strTeacher = "안중근";
//		System.out.println("obj의 선생님 : " + obj.g_strTeacher);
//	}
//}
//
//package three;
//
//class Student {
//	
//	// 필드의 멤버변수
//	int m_nKor;
//	int m_nEng;
//	int m_nMat;
//	
//	// 멤버 변수의 값을 정해주는 set 메소드
//	public void set(int a, int b, int c) {
//		
//		m_nKor = a;
//		m_nEng = b;
//		m_nMat = c;
//	}
//	
//	// 접근지저자가 public 이고
//	// 반환값이 double 형인
//	// 국, 영, 수의 평균을 구하는 함수
//	public double calc() {
//		
//		double avg;
//		avg = (m_nKor + m_nEng + m_nMat) / 3.0;
//		return avg;
//	}
//	
//	// 접근지정자가 public 이고
//	// 반환값이 없고
//	// 평균을 출력
//	public void disp() {
//		System.out.println("평균은 " + calc() + " 입니다.");
//	}
//}
//
//public class InstanceVariable {
//	public static void main(String [] args) {
//		
//		// 객체 생성
//		Student obj = new Student();
//		
//		// 국, 영, 수 점수 정하기
//		obj.set(80, 65, 85);
//		
//		// 평균 출력
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
//	// 오버로딩 : 함수의 이름은 같지만 매개변수의 개수가 다르다.
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
//		System.out.println("평균은 " + calc() + "입니다.");
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