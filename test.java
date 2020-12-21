//package five;
//
//// AbstractTest
//// 추상메서드를 포함하느로 추상클래스 선언
//// 추상 메서드 선언 (구현 x)
//abstract class Cat {
//	abstract void call();
//	void call2() {
//		System.out.println("일반 메서드");
//	}
//}
//
//// Cat 추상클래스를 상속한 클래스
//class FirstCat extends Cat {
//	void call() {
//		System.out.println("첫번째 야용이");
//	}
//}
//
////Cat 추상클래스를 상속한 클래스
//class SecondCat extends Cat {
//	void call() {
//		System.out.println("두번째 야옹이");
//	}
//}
//
//// 메인클래스
//public class test {
//	public static void main(String[] args) {
//		FirstCat fc = new FirstCat();
//		SecondCat sc = new SecondCat();
//		fc.call();
//		sc.call();
//	}
//}

//package five;
//abstract class Cat {
//	abstract void call();
//	void call2() {
//		System.out.println("일반 메서드");
//	}
//}
//class FirstCat extends Cat {
//	void call() {
//		System.out.println("첫번째 야옹이");
//	}
//}
//class SecondCat extends Cat {
//	void call() {
//		System.out.println("두번째 야옹이");
//	}
//}
//public class test {
//	public static void main(String[] args) {
//		FirstCat fc = new FirstCat();
//		SecondCat sc = new SecondCat();
//		fc.call();
//		sc.call();
//	}
//}