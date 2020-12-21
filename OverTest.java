//package five;
//
//class OverloadingTest {
//	
//	void cat() {
//		System.out.println("매개변수 없음");
//	}
//	
//	void cat(int a, int b) {
//		System.out.println("매개변수 : "+a+","+b);
//	}
//	
//	void cat(String c) {
//		System.out.println("매개변수 : " + c);
//	}
//}
//
//public class OverTest {
//	
//	public static void main(String[] args) {
//		
//		OverloadingTest ot = new OverloadingTest();
//		ot.cat();
//		ot.cat(20, 80);
//		ot.cat("오버로딩 예제입니다.");
//	}
//}

//package five;
//class OverloadingTest {
//	void cat() {
//		System.out.println("매개변수 없음");
//	}
//	void cat(int a, int b) {
//		System.out.println("매개변수 : " + a + "," + b);
//	}
//	void cat(String c) {
//		System.out.println("매개변수 : " + c);
//	}
//}
//public class OverTest {
//	public static void main(String[] args) {
//		OverloadingTest ot = new OverloadingTest();
//		ot.cat();
//		ot.cat(20, 80);
//		ot.cat("오버로딩");	
//	}
//}

//package five;
//class OverloadingTest {
//	void cat() {
//		System.out.println("매개변수 없음");
//	}
//	void cat(int a, int b) {
//		System.out.println("매개변수 : " + a + "," + b);
//	}
//	void cat(String c) {
//		System.out.println("매개변수 : " + c);
//	}
//}
//public class OverTest {
//	public static void main(String[] args) {
//		OverloadingTest ot = new OverloadingTest();
//		ot.cat();
//		ot.cat(20, 80);
//		ot.cat("오버로딩");
//	}
//}

//package five;
//
//class Woman {
//	
//	public String name;
//	public int age;
//	
//	public void info() {
//		System.out.println("여자의 이름은 " +name+ ", 나이는 " +age+ "살 입니다.");
//	}
//}
//
//class Job extends Woman {
//	
//	String job;
//	
//	public void info() {
//		super.info();
//		System.out.println("여자의 직업은 " +job+ "입니다.");
//	}
//}
//
//public class OverTest {
//	public static void main(String[] args) {
//		Job job = new Job();
//		job.name = "유리";
//		job.age = 30;
//		job.job = "프로그래머";
//		job.info();
//	}
//}

//package five;
//class Woman {
//	public String name;
//	public int age;
//	public void info() {
//		System.out.println("여자의 이름은 " +name+ ", 나이는 " +age+ " 살 입니다.");
//	}
//}
//class Job extends Woman {
//	String job;
//	public void info() {
//		super.info();
//		System.out.println("여자의 직업은 " +job+ " 입니다.");
//	}
//}
//public class OverTest {
//	public static void main(String[] args) {
//		Job job = new Job();
//		job.name = "유리";
//		job.age = 30;
//		job.job = "프로그래머";
//		job.info();
//	}
//}