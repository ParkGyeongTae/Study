//package four;
//
//public class Circle {
//	
//	// 원의 반지름 필드
//	int radius;
//	// 원의 이름 필드
//	String name;
//	
//	// 생성자
//	public Circle() {
//	}
//	
//	public double getArea() {
//		return 3.14 * radius * radius;
//	}
//	
//	public static void main(String[] args) {
//		
//		// 참조변수 피자 선언
//		Circle pizza;
//		
//		// 원 객체 생성
//		pizza = new Circle();
//		// 피자 반지름 설정
//		pizza.radius = 10;
//		
//		// 피자 이름 설정
//		pizza.name = "자바피자";
//		// 피자 면적 알기
//		double area = pizza.getArea();
//		
//		System.out.println(pizza.name + " 의 면적은 " + area);
//		
//		// 원 객체 생성
//		Circle donut = new Circle();
//		
//		// 도넛 반지름 설정
//		donut.radius = 2;
//		// 도넛 면적 알기
//		donut.name = "던킨도넛";
//		
//		area = donut.getArea();
//		
//		System.out.println(donut.name + " 의 면적은 " + area);
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
//		pizza.name = "자바피자";
//		double area = pizza.getArea();
//		System.out.println(pizza.name + " 의 면적은 " + area);
//		
//		Circle donut = new Circle();
//		donut.radius = 2;
//		donut.name = "자바도넛";
//		area = donut.getArea();
//		System.out.println(donut.name + " 의 면적은 " + area);
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
//		pizza.name = "자바피자";
//		pizza.radius = 10;
//		System.out.println(pizza.name + "의 면적은 " + pizza.getArea());
//		Circle donut = new Circle();
//		donut.name = "자바도넛";
//		donut.radius = 2;
//		System.out.println(donut.name + "의 면적은 " + donut.getArea());
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
//		pizza.name = "자바피자";
//		pizza.radius = 10;
//		System.out.println(pizza.name + "의 면적은 " + pizza.getArea());
//		Circle donut = new Circle();
//		donut.name = "자바도넛";
//		donut.radius = 2;
//		System.out.println(donut.name + "의 면적은 " + donut.getArea());
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
//		Circle pizza = new Circle(10, "자바피자");
//		
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은 " + pizza.getArea());
//		
//		Circle donut = new Circle();
//		donut.name = "자바도넛";
//		area = donut.getArea();
//		System.out.println(donut.name + "의 면적은 " + area);
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
//		Circle pizza = new Circle(10, "자바피자");
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은 " + area);
//		Circle donut = new Circle();
//		donut.name = "자바도넛";
//		area = donut.getArea();
//		System.out.println(donut.name + "의 면적은 " + area);
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

