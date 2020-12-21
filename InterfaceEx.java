//package five;
//
////interface AIInterface {
////	void recongnizeSpeech();
////	void synthesizeSpeech();
////}
////
////class AIPhone implements MobilePhoneInterface, AIInterface {
////	public void sendCall() {
////	}
////	public void receiveCall() {
////	}
////	public void sendSMS() {
////	}
////	public void receiveSMS() {
////	}
////	public void recognizeSpeech() {
////	}
////	public void synthesizeSpeech() {
////	}
////	public int touch() {
////	}
////}
//
//interface PhoneInterface {
//	final int TIMEOUT = 10000;
//	void sendCall();
//	void receiveCall();
//	default void printLogo() {
//		System.out.println(" ** Phone ** ");
//	}
//}
//
//interface MobilePhoneInterface extends PhoneInterface {
//	void sendSMS();
//	void receiveSMS();
//}
//
//interface MP3Interface {
//	public void play();
//	public void stop();
//}
//class PDA {
//	public int calculate(int x, int y) {
//		return x+y;
//	}
//}
//class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
//	public void sendCall() {
//		System.out.println("따르릉따르릉~~");
//	}
//	public void receiveCall() {
//		System.out.println("전화 왔어요.");
//	}
//	public void sendSMS() {
//		System.out.println("문자갑니다.");
//	}
//	public void receiveSMS() {
//		System.out.println("문자왔어요.");
//	}
//	public void play() {
//		System.out.println("음악연주합니다.");
//	}
//	public void stop() {
//		System.out.println("음악중단합니다.");
//	}
//	public void schedule() {
//		System.out.println("일정 관리합니다.");
//	}
//}
//public class InterfaceEx {
//	public static void main(String[] args) {
//		SmartPhone phone = new SmartPhone();
//		phone.printLogo();
//		phone.sendCall();
//		phone.play();
//		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
//		phone.schedule();
//	}
//
//}
