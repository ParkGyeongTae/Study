//package five;
//
//class ParentClass {
//	public void parentMethod() {
//		System.out.println("�θ�Ŭ������ parentMethod()�� ȣ���");
//	}
//}
//
//class ChildrenClass extends ParentClass {
//	public void childrenMethod() {
//		System.out.println("�ڽ�Ŭ������ childMethod()�� ȣ���");
//		System.out.println("�θ�Ŭ������ parentMethod()�� ȣ���");
//		parentMethod();
//	}
//}
//
//public class InheritanceTest {
//	public static void main(String[] args) {
//		ChildrenClass child = new ChildrenClass();
//		child.childrenMethod();
//	}
//}

//package five;
//class ParentClass {
//	public void parentMethod() {
//		System.out.println("�θ�Ŭ������ �޼��尡 ȣ���");
//	}
//}
//class ChildrenClass extends ParentClass {
//	public void childrenMethod() {
//		System.out.println("�ڽ�Ŭ������ �޼��尡 ȣ���");
//		System.out.println("�θ�Ŭ������ �޼��尡 ȣ���");
//		parentMethod();
//	}
//}
//public class InheritanceTest {
//	public static void main(String[] args) {
//		ChildrenClass child = new ChildrenClass();
//		child.childrenMethod();
//	}
//}

//package five;
//class ParentClass {
//	public void parentMethod() {
//		System.out.println("�θ�Ŭ������ �޼��尡 ȣ���");
//	}
//}
//class ChildrenClass extends ParentClass {
//	public void childrenMethod() {
//		System.out.println("�ڽ�Ŭ������ �޼��尡 ȣ���");
//		parentMethod();
//	}
//}
//public class InheritanceTest {
//	public static void main(String [] args) {
//		ChildrenClass child = new ChildrenClass();
//		child.childrenMethod();
//	}
//}

//package five;
//
//class ParentClass {
//	
//	private int age;
//	
//	public ParentClass(int age) {
//		this.age = age;
//	}
//	
//	public void family() {
//		System.out.println("�θ��Դϴ�. ���̴� " + this.age + " �� �Դϴ�.");
//	}
//}
//class ChildrenClass extends ParentClass {
//	
//	private int age;
//	
//	public ChildrenClass(int age) {
//		super(age + 30);
//		this.age = age;
//	}
//	
//	public void family() {
//		System.out.println("�ڽ��Դϴ�. ���̴� " + this.age + " �� �Դϴ�.");
//	}
//	
//	public void childrenMethod() {
//		family();
//		super.family();
//	}
//}
//public class InheritanceTest {
//	
//	public static void main(String[] args) {
//		
//		ChildrenClass child = new ChildrenClass(20);
//		child.childrenMethod();
//	}
//}

//package five;
//class ParentClass {
//	private int age;
//	public ParentClass(int age) {
//		this.age = age;
//	}
//	public void family() {
//		System.out.println("�θ��Դϴ�. ���̴� " + this.age + " �� �Դϴ�.");
//	}
//}
//class ChildClass extends ParentClass {
//	private int age;
//	public ChildClass(int age) {
//		super(age + 30);
//		this.age = age;
//	}
//	public void family() {
//		System.out.println("�ڽ��Դϴ�. ���̴� " + this.age + " �� �Դϴ�.");
//	}
//	public void childrenMethod() {
//		family();
//		super.family();
//	}
//}
//public class InheritanceTest {
//	public static void main(String[] args) {
//		ChildClass child = new ChildClass(20);
//		child.childrenMethod();
//	}
//}