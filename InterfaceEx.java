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
//		System.out.println("������������~~");
//	}
//	public void receiveCall() {
//		System.out.println("��ȭ �Ծ��.");
//	}
//	public void sendSMS() {
//		System.out.println("���ڰ��ϴ�.");
//	}
//	public void receiveSMS() {
//		System.out.println("���ڿԾ��.");
//	}
//	public void play() {
//		System.out.println("���ǿ����մϴ�.");
//	}
//	public void stop() {
//		System.out.println("�����ߴ��մϴ�.");
//	}
//	public void schedule() {
//		System.out.println("���� �����մϴ�.");
//	}
//}
//public class InterfaceEx {
//	public static void main(String[] args) {
//		SmartPhone phone = new SmartPhone();
//		phone.printLogo();
//		phone.sendCall();
//		phone.play();
//		System.out.println("3�� 5�� ���ϸ� " + phone.calculate(3, 5));
//		phone.schedule();
//	}
//
//}
