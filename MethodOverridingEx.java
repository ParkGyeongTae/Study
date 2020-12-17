//package three;
//
//// 슈퍼클래스
//class Shape {
//	
//	public Shape next;
//	public Shape() {
//		next = null;
//	}
//	
//	public void draw() {
//		System.out.println("Shape");
//	}
//}
//
//class Line extends Shape {
//	
//	// 메소드 오버라이딩
//	public void draw() {
//		System.out.println("Line");
//	}
//}
//
//class Rect extends Shape {
//	
//	// 메소드 오버라이딩
//	public void draw() {
//		System.out.println("Rect");
//	}
//}
//
//class Circle extends Shape {
//	
//	// 메소드 오버라이딩
//	public void draw() {
//		System.out.println("Circle");
//	}
//}
//
//public class MethodOverridingEx {
//	static void paint(Shape p) {
//		
//		// p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 동적바인딩
//		p.draw();
//	}
//	
//	public static void main(String[] args) {
//		Line line = new Line();
//		
//		paint(line);
//		paint(new Shape());
//		paint(new Line());
//		paint(new Rect());
//		paint(new Circle());
//	}
//
//}
//
