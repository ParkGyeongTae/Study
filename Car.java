package TutorialPackage;

//public class Car {
//
//	String company = "현대자동차";
//	String model = "그랜저";
//	String color = "검정";
//	String maxSpeed = "350";
//	int speed;
//
//}

//public class Car {
//	
//	Car(String color, int cc) {
//		
//	}
//	
//}

//public class Car {
//	
//	String company = "현대자동차";
//	String model;
//	String color;
//	int maxSpeed;
//	
//	Car() {
//		
//	}
//	
//	Car (String model) {
//		this.model = model;
//	}
//	
//	Car (String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	Car (String model, String color, int maxSpeed) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
//}

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car () {
	}
	
	Car (String model) {
		this(model, "은색", 250);
	}
	
	Car (String model, String color) {
		this(model, color, 250);
	}
	
	Car (String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}









