//package five;
//
//class OverloadingTest {
//	
//	void cat() {
//		System.out.println("�Ű����� ����");
//	}
//	
//	void cat(int a, int b) {
//		System.out.println("�Ű����� : "+a+","+b);
//	}
//	
//	void cat(String c) {
//		System.out.println("�Ű����� : " + c);
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
//		ot.cat("�����ε� �����Դϴ�.");
//	}
//}

//package five;
//class OverloadingTest {
//	void cat() {
//		System.out.println("�Ű����� ����");
//	}
//	void cat(int a, int b) {
//		System.out.println("�Ű����� : " + a + "," + b);
//	}
//	void cat(String c) {
//		System.out.println("�Ű����� : " + c);
//	}
//}
//public class OverTest {
//	public static void main(String[] args) {
//		OverloadingTest ot = new OverloadingTest();
//		ot.cat();
//		ot.cat(20, 80);
//		ot.cat("�����ε�");	
//	}
//}

//package five;
//class OverloadingTest {
//	void cat() {
//		System.out.println("�Ű����� ����");
//	}
//	void cat(int a, int b) {
//		System.out.println("�Ű����� : " + a + "," + b);
//	}
//	void cat(String c) {
//		System.out.println("�Ű����� : " + c);
//	}
//}
//public class OverTest {
//	public static void main(String[] args) {
//		OverloadingTest ot = new OverloadingTest();
//		ot.cat();
//		ot.cat(20, 80);
//		ot.cat("�����ε�");
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
//		System.out.println("������ �̸��� " +name+ ", ���̴� " +age+ "�� �Դϴ�.");
//	}
//}
//
//class Job extends Woman {
//	
//	String job;
//	
//	public void info() {
//		super.info();
//		System.out.println("������ ������ " +job+ "�Դϴ�.");
//	}
//}
//
//public class OverTest {
//	public static void main(String[] args) {
//		Job job = new Job();
//		job.name = "����";
//		job.age = 30;
//		job.job = "���α׷���";
//		job.info();
//	}
//}

//package five;
//class Woman {
//	public String name;
//	public int age;
//	public void info() {
//		System.out.println("������ �̸��� " +name+ ", ���̴� " +age+ " �� �Դϴ�.");
//	}
//}
//class Job extends Woman {
//	String job;
//	public void info() {
//		super.info();
//		System.out.println("������ ������ " +job+ " �Դϴ�.");
//	}
//}
//public class OverTest {
//	public static void main(String[] args) {
//		Job job = new Job();
//		job.name = "����";
//		job.age = 30;
//		job.job = "���α׷���";
//		job.info();
//	}
//}