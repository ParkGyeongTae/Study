//package four;
//
//public class Circle {
//	
//	// ���� ������ �ʵ�
//	int radius;
//	// ���� �̸� �ʵ�
//	String name;
//	
//	// ������
//	public Circle() {
//	}
//	
//	public double getArea() {
//		return 3.14 * radius * radius;
//	}
//	
//	public static void main(String[] args) {
//		
//		// �������� ���� ����
//		Circle pizza;
//		
//		// �� ��ü ����
//		pizza = new Circle();
//		// ���� ������ ����
//		pizza.radius = 10;
//		
//		// ���� �̸� ����
//		pizza.name = "�ڹ�����";
//		// ���� ���� �˱�
//		double area = pizza.getArea();
//		
//		System.out.println(pizza.name + " �� ������ " + area);
//		
//		// �� ��ü ����
//		Circle donut = new Circle();
//		
//		// ���� ������ ����
//		donut.radius = 2;
//		// ���� ���� �˱�
//		donut.name = "��Ų����";
//		
//		area = donut.getArea();
//		
//		System.out.println(donut.name + " �� ������ " + area);
//	}
//}


//package four;
//
//public class Circle {
//	
//	int radius;
//	String name;
//	
//	public Circle() {
//	}
//	
//	public double getArea() {
//		return 3.14 * radius * radius;
//	}
//	
//	public static void main(String[] args) {
//		Circle pizza;
//		pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "�ڹ�����";
//		double area = pizza.getArea();
//		System.out.println(pizza.name + " �� ������ " + area);
//		
//		Circle donut = new Circle();
//		donut.radius = 2;
//		donut.name = "�ڹٵ���";
//		area = donut.getArea();
//		System.out.println(donut.name + " �� ������ " + area);
//	}
//}

//package four;
//
//public class Circle {
//	int radius;
//	String name;
//	public Circle() {
//	}
//	public double getArea() {
//		return 3.14*radius*radius;
//	}
//	public static void main(String[] args) {
//		Circle pizza = new Circle();
//		pizza.name = "�ڹ�����";
//		pizza.radius = 10;
//		System.out.println(pizza.name + "�� ������ " + pizza.getArea());
//		Circle donut = new Circle();
//		donut.name = "�ڹٵ���";
//		donut.radius = 2;
//		System.out.println(donut.name + "�� ������ " + donut.getArea());
//	}
//}

//package four;
//
//public class Circle {
//	int radius;
//	String name;
//	public Circle() {
//	}
//	public double getArea() {
//		return 3.14*radius*radius;
//	}
//	public static void main(String[] args) {
//		Circle pizza = new Circle();
//		pizza.name = "�ڹ�����";
//		pizza.radius = 10;
//		System.out.println(pizza.name + "�� ������ " + pizza.getArea());
//		Circle donut = new Circle();
//		donut.name = "�ڹٵ���";
//		donut.radius = 2;
//		System.out.println(donut.name + "�� ������ " + donut.getArea());
//	}
//}

//package four;
//public class Circle {
//	
//	int radius;
//	String name;
//	
//	public Circle() {
//		radius = 1;
//		name = "";
//	}
//	
//	public Circle(int r, String n) {
//		radius = r;
//		name = n;
//	}
//	
//	public double getArea() {
//		return 3.14*radius*radius;
//	}
//	
//	public static void main(String[] args) {
//		Circle pizza = new Circle(10, "�ڹ�����");
//		
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "�� ������ " + pizza.getArea());
//		
//		Circle donut = new Circle();
//		donut.name = "�ڹٵ���";
//		area = donut.getArea();
//		System.out.println(donut.name + "�� ������ " + area);
//	}
//}

//package four;
//public class Circle {
//	int radius;
//	String name;
//	public Circle() {
//		radius = 1;
//		name = "";
//	}
//	public Circle(int r, String n) {
//		radius = r;
//		name = n;
//	}
//	public double getArea() {
//		return 3.14*radius*radius;
//	}
//	public static void main(String[] args) {
//		Circle pizza = new Circle(10, "�ڹ�����");
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "�� ������ " + area);
//		Circle donut = new Circle();
//		donut.name = "�ڹٵ���";
//		area = donut.getArea();
//		System.out.println(donut.name + "�� ������ " + area);
//	}
//}


//package four;
//
//public class Circle {
//	
//	int radius;
//	
//	void set(int r) {
//		radius = r;
//	}
//	
//	double getArea() {
//		return 3.14*radius*radius;
//	}
//	
//	public Circle(int r) {
//		radius = r;
//	}
//	
//	public static void main(String[] args) {
//		Circle pizza = new Circle(10);
//		System.out.println(pizza.getArea());
////		Circle donut = new Circle();
////		System.out.println(donut.getArea());
//	}
//	
//}

//package four;
//public class Circle {
//	int radius;
//	void set(int r) {
//		radius = r;
//	}
//	double getArea() {
//		return 3.14*radius*radius;
//	}
//	public Circle() {
//	}
//	public Circle(int r) {
//		radius = r;
//	}
//	public static void main(String[] args) {
//		Circle pizza = new Circle(10);
//		System.out.println(pizza.getArea());
//		Circle donut = new Circle();
//		System.out.println(donut.getArea());
//	}
//}

//package four;
//
//public class Circle {
//	
//	int radius;
//	
//	public Circle() {
//		radius = 1;
//	}
//	
//	public Circle(int r) {
//		radius = r;
//	}
//	
//	double getArea() {
//		return 3.14*radius*radius;
//	}
//}

//package four;
//
//public class Circle {
//	
//	int radius;
//	
//	public Circle() {
//		this.radius = 1;
//	}
//	
//	public Circle(int radius) {
//		this.radius = radius;
//	}
//	
//	double getArea() {
//		return 3.14*this.radius*this.radius;
//	}
//}

//package four;
//public class Circle {
//	int radius;
//	public Circle() {
//		radius = 1;
//	}
//	public Circle(int r) {
//		radius = r;
//	}
//	double getArea() {
//		return 3.14*radius*radius;
//	}
//}

//package four;
//public class Circle {
//	int radius;
//	public Circle() {
//		this.radius = 1;
//	}
//	public Circle(int radius) {
//		this.radius = radius;
//	}
//	double getArea() {
//		return 3.14 * this.radius * this.radius;
//	}
//}

//package four;
//
//public class Circle {
//	
//	int radius;
//	
//	public Circle(int radius) {
//		this.radius = radius;
//	}
//	
//	public void set(int radius) {
//		this.radius = radius;
//	}
//	
//	public static void main(String[] args) {
//		
//		Circle ob1 = new Circle(1);
//		Circle ob2 = new Circle(2);
//		Circle ob3 = new Circle(3);
//		
//		System.out.println(ob1.radius);
//		System.out.println(ob2.radius);
//		System.out.println(ob3.radius);
//		
//		ob1.set(4);
//		ob2.set(5);
//		ob3.set(6);
//		
//		System.out.println(ob1.radius);
//		System.out.println(ob2.radius);
//		System.out.println(ob3.radius);
//		
//	}
//}

//package four;
//public class Circle {
//	int radius;
//	public Circle(int radius) {
//		this.radius = radius;
//	}
//	public void set(int radius) {
//		this.radius = radius;
//	}
//	public static void main(String[] args) {
//		Circle ob1 = new Circle(1);
//		Circle ob2 = new Circle(2);
//		Circle ob3 = new Circle(3);
//		System.out.println(ob1.radius);
//		System.out.println(ob2.radius);
//		System.out.println(ob3.radius);
//		ob1.set(4);
//		ob2.set(5);
//		ob3.set(6);
//		System.out.println(ob1.radius);
//		System.out.println(ob2.radius);
//		System.out.println(ob3.radius);
//	}
//}

//package four;
//
//public class Circle {
//	
//	int radius;
//	
//	public Circle(int radius) {
//		this.radius = radius;
//	}
//	
//	public void set(int radius) {
//		this.radius = radius;
//	}
//	
//	public static void main(String[] args) {
//		Circle ob1 = new Circle(1);
//		Circle ob2 = new Circle(2);
//		Circle s;
//		
//		s = ob2;
//		ob1 = ob2;
//		
//		System.out.println("ob1.radius = " + ob1.radius);
//		System.out.println("ob2.radius = " + ob2.radius);
//	}
//}

//package four;
//public class Circle {
//	int radius;
//	public Circle(int radius) {
//		this.radius = radius;
//	}
//	public void set(int radius) {
//		this.radius = radius;
//	}
//	public static void main(String[] args) {
//		Circle ob1 = new Circle(1);
//		Circle ob2 = new Circle(2);
//		Circle s;
//		s = ob2;
//		ob1 = ob2;
//		System.out.println("ob1.radius = " + ob1.radius);
//		System.out.println("ob2.radius = " + ob2.radius);
//	}
//} 

