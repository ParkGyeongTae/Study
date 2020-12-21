//package five;
//
//class Point {
//	
//	private int x;
//	private int y;
//	
//	public void set(int x, int y) {
//		
//		this.x = x;
//		this.y = y;
//	}
//	
//	public void showPoint() {
//		
//		System.out.println("("+x+","+y+")");
//	}
//}
//
//class ColorPoint extends Point {
//	
//	private String color;
//	
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//	public void showColorPoint() {
//		System.out.print(color);
//		showPoint();
//	}
//}
//
//public class ColorPointEx {
//	public static void main(String[] args) {
//		
//		Point p = new Point();
//		p.set(1, 2);
//		p.showPoint();
//		
//		ColorPoint cp = new ColorPoint();
//		cp.set(3, 4);
//		cp.setColor("Red");
//		cp.showColorPoint();
//	}
//}

//package five;
//
//class Point {
//	private int x;
//	private int y;
//	public Point() {
//		this.x = 0;
//		this.y = 0;
//	}
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	public void showPoint() {
//		System.out.println("("+x+","+y+")");
//	}
//}
//
//class ColorPoint extends Point {
//	private String color;
//	public ColorPoint(int x, int y, String color) {
//		super(x, y);
//		this.color = color;
//	}
//	public void showColorPoint() {
//		System.out.println(color);
//		showPoint();
//	}
//}
//
//public class ColorPointEx {
//	public static void main(String[] args) {
//		ColorPoint cp = new ColorPoint(5, 6, "blue");
//		cp.showColorPoint();
//	}
//}

//package five;
//
//class Point {
//	private int x;
//	private int y;
//	public Point() {
//		this.x = 0;
//		this.y = 0;
//	}
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	public void showPoint() {
//		System.out.println("("+x+","+y+")");
//	}
//}
//class ColorPoint extends Point {
//	private String color;
//	public ColorPoint(int x, int y, String color) {
//		super(x, y);
//		this.color = color;
//	}
//	public void showColorPoint() {
//		System.out.println(color);
//		showPoint();
//	}
//}
//public class ColorPointEx {
//	public static void main(String [] args) {
//		ColorPoint cp = new ColorPoint(5, 6, "Blue");
//		cp.showColorPoint();
//	}
//}