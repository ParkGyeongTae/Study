//package five;
//
//class ParentClass {
//	public void parentMethod() {
//		System.out.println("부모클래스의 parentMethod()가 호출됨");
//	}
//}
//
//class ChildrenClass extends ParentClass {
//	public void childrenMethod() {
//		System.out.println("자식클래스의 childMethod()가 호출됨");
//		System.out.println("부모클래스의 parentMethod()가 호출됨");
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
//		System.out.println("부모클래스의 메서드가 호출됨");
//	}
//}
//class ChildrenClass extends ParentClass {
//	public void childrenMethod() {
//		System.out.println("자식클래스의 메서드가 호출됨");
//		System.out.println("부모클래스의 메서드가 호출됨");
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
//		System.out.println("부모클래스의 메서드가 호출됨");
//	}
//}
//class ChildrenClass extends ParentClass {
//	public void childrenMethod() {
//		System.out.println("자식클래스의 메서드가 호출됨");
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
//		System.out.println("부모입니다. 나이는 " + this.age + " 살 입니다.");
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
//		System.out.println("자식입니다. 나이는 " + this.age + " 살 입니다.");
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
//		System.out.println("부모입니다. 나이는 " + this.age + " 살 입니다.");
//	}
//}
//class ChildClass extends ParentClass {
//	private int age;
//	public ChildClass(int age) {
//		super(age + 30);
//		this.age = age;
//	}
//	public void family() {
//		System.out.println("자식입니다. 나이는 " + this.age + " 살 입니다.");
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