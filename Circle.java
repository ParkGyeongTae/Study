//package five;
//
//class Shape {
//	protected String name;
//	public void paint() {
//		draw();
//	}
//	public void draw() {
//		System.out.println(name);
//	}
//}
//
//public class Circle extends Shape {
//	protected String name;
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

//package five;
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

//package five;
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

//package five;
//public class Circle {
//	int radius;
//	String name;
//	public Circle() {
//	}
//	public double getArea() {
//		return 3.14 * radius * radius;
//	}
//	public static void main(String[] args) {
//		Circle pizza;
//		pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "자바피자";
//		double area = pizza.getArea();
//		System.out.println(pizza.name + " 의 면적은 " + area);
//		Circle donut = new Circle();
//		donut.radius = 2;
//		donut.name = "자바도넛";
//		area = donut.getArea();
//		System.out.println(donut.name + " 의 면적은 " + area);
//	}
//}

//package five;
//public class Circle {
//	int radius;
//	String name;
//	public Circle() {
//	}
//	public double getArea() {
//		return 3.14 * radius * radius;
//	}
//	public static void main(String[] args) {
//		Circle pizza = new Circle();
//		pizza.radius = 10;
//		pizza.name = "자바피자";
//		double area = pizza.getArea();
//		System.out.println(pizza.name + " 의 면적은 " + area);
//		Circle donut = new Circle();
//		donut.radius = 2;
//		donut.name = "자바도넛";
//		area = donut.getArea();
//		System.out.println(donut.name + " 의 면적은 " + area);
//	}
//}