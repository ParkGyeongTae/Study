//package three;
//
//public class Circle {
//	
//	// ���� ������ �ʵ�
//	int radius;
//	// ���� �̸� �ʵ�
//	String name;
//	
//	// ���� ������
//	public Circle() {
//		System.out.println("������ȣ��!");
//	}
//	
//	// ���� ���� ��� �޼ҵ�
//	public double getArea() {
//		return 3.14*radius*radius;
//	}
//	
//	
//	public static void main(String[] args) {
//		Circle pizza;
//		// Circle ��ü ����
//		pizza = new Circle();
//		// ������ �������� 10���� ����
//		pizza.radius = 10;
//		// ������ �̸� ����
//		pizza.name = "�ڹ�����";
//		// ������ ���� �˾Ƴ���
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "�� ������ " + area);
//		
//		// Circle ��ü ����
//		Circle donut = new Circle();
//		// ������ �������� 2�� ����
//		donut.radius = 2;
//		// ������ �̸� ����
//		donut.name = "�ڹٵ���";
//		// ������ ���� �˾Ƴ���
//		area = donut.getArea();
//		System.out.println(donut.name + "�� ������ " + area);
//	}
//
//}


//class Shape {
//	
//	protected String name;
//	public void paint() {
//		draw();
//	}
//	
//	public void draw() {
//		System.out.println("Shape");
//	}
//}
//
//public class Circle extends Shape {
//	
//	public void draw() {
//		System.out.println("Circle");
//	}
//	
//	public static void main(String[] args) {
//		
//		Shape b = new Circle();
//		b.paint();
//	}
//}

//class Shape {
//	protected String name;
//	public void paint() {
//		draw();
//	}
//	public void draw() {
//		System.out.println(name);
//	}
//}
//public class Circle extends Shape {
//	protected String name;
//	
//	public void paint() {
//		System.out.println("circle in");;
//	}
//	
//	public void draw() {
//		name = "Circle";
//		super.name = "Shape";
//		super.draw();
//		System.out.println(name);
//	}
//	public static void main(String[] args) {
//		Shape b = new Circle();
//		b.paint();
//	}
//}

