//package three;
//
//public class Circle {
//	
//	// 원의 반지름 필드
//	int radius;
//	// 원의 이름 필드
//	String name;
//	
//	// 원의 생성자
//	public Circle() {
//		System.out.println("생성자호출!");
//	}
//	
//	// 원의 면적 계산 메소드
//	public double getArea() {
//		return 3.14*radius*radius;
//	}
//	
//	
//	public static void main(String[] args) {
//		Circle pizza;
//		// Circle 객체 생성
//		pizza = new Circle();
//		// 피자의 반지름을 10으로 설정
//		pizza.radius = 10;
//		// 피자으 이름 설정
//		pizza.name = "자바피자";
//		// 피자의 면적 알아내기
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은 " + area);
//		
//		// Circle 객체 생성
//		Circle donut = new Circle();
//		// 도넛의 반지름을 2로 설정
//		donut.radius = 2;
//		// 도넛의 이름 설정
//		donut.name = "자바도넛";
//		// 도넛의 면적 알아내기
//		area = donut.getArea();
//		System.out.println(donut.name + "의 면적은 " + area);
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

