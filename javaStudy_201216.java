package TutorialPackage;

import java.util.Scanner;

//public class javaStudy_201216 {
	
/*
 * 1. JDK�� JRE�� �������� ������ �� �� Ʋ�� ���� �����Դϴ�?
 *
 *  1. JDK�� JRE�� �����Ϸ� ���� ���ߵ����� ���Եȴ�. O
 *  2. �ڹ� ���α׷��� �����Ϸ��� JDK�� �ݵ�� �ʿ��ϴ�. O
 *  3. �ڹ� ���α׷��� ���ุ �Ϸ��� JRE�� ��ġ�ص� �������. O
 *  4. JRE���� �����Ϸ�(javac.exe)�� ���ԵǾ� �ִ� X
 *  
 * 2. JVM�� ���� �������� Ʋ�� ���� �����Դϱ�?
 * 
 *  1. JVM�� java.exe ��ɾ ���� �����ȴ�. O
 *  2. JVM�� ����Ʈ �ڵ带 ����� ��ȯ��Ű�� �����Ѵ�. O
 *  3. JVM�� �ü���� �������̴�. (�ü������ ������ JVM�� ���ȴ�.) X
 *  4. ����Ʈ �ڵ�� JVM�� ������������, JVM�� �ü���� �������̴�. O
 *  
 * 3. �ڹ� ���α׷� ���߰����� ������� �����ϼ���.
 * 
 *  1. javac.exe�� ����Ʈ �ڵ� ����(~.class)�� �����Ѵ�. (2)
 *  2. java.exe�� JVM�� ������Ų��. (3)
 *  3. �ڹ� �ҽ� ����(~.java)�� �ۼ��Ѵ�. (1)
 *  4. JVM�� main() �޼ҵ带 ã�� �޼ҵ� ����� �����Ų��. (4)
 *  
 * 4. �ڹ� �ҽ� ������ �ۼ��� �� Ʋ�� ���� �����Դϱ�?
 * 
 *  1. �ڹ� �ҽ� ���ϸ�� Ŭ���� �̸��� ��ҹ��ڰ� �����ؾ� �Ѵ�. O
 *  2. Ŭ���� ��ϰ� �޼ҵ� ����� �ݵ�� �߰�ȣ {}�� ���ξ� �Ѵ�. O
 *  3. ���๮ �ڿ��� �ݵ�� �����ݷ�(;)�� �ٿ��� �Ѵ�. O
 *  4. �ּ��� ���ڿ� �ȿ��� �ۼ��� �� �ִ�. X
 *  
 * 5. �ڹ� �ּ����� ������ �ƴ� ���� �����Դϱ�?
 * 
 *  1. // : �� �ּ� O
 *  2. /*... / : ���� �ּ� O
 *  3. /**... / : API ��ť��Ʈ �ּ� O
 *  4. <!--....--> : ���� �ּ� X
 *  
 * 6. ��Ŭ������ ���� �������� Ʋ�� ���� �����Դϱ�?
 * 
 *  1. ��Ŭ������ JDK(JRE)�� ��ġ�ؾ߸� ������ �� �ִ�. O
 *  2. ��Ŭ�������� �ҽ� ������ �����ϸ� �ڵ� �����ϵǾ� ����Ʈ �ڵ� ������ �����ȴ�. O
 *  3. ��ũ�����̽��� ������Ʈ���� �����Ǵ� �⺻ ���丮�� ���Ѵ�. O
 *  4. metadata�� ������Ʈ�� �ҽ� ���ϵ��� ����Ǵ� ���丮�̴�. X
 */
	
//	public static void main(String args[]) {
	
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
//		int sum = 0;
//		
//		for (int i = 0; i <= 10; i++) {
//			sum += i;
//			System.out.print(i);
//			
//			if (i <= 9) {
//				System.out.print("+");
//			} else {
//				System.out.print("=");
//				System.out.print(sum);
//			}
//		}
		
//		int i = 0;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
//		int count = 0;
//		int sum = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���. : ");
//		int n = scanner.nextInt();
//		
//		while (n != -1) {
//			sum += n;
//			count += 1;
//			n = scanner.nextInt();
//		}
//		
//		if (count == 0) {
//			System.out.println("�Էµ� ���� �����ϴ�.");
//		} else {
//			System.out.println("������ ������ " + count + " �� �̸�");
//			System.out.println("����� " + sum/count + " �Դϴ�.");
//		}
//		scanner.close();
		
//		int i = 0;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i < 10);
		
//		char c = 'a';
//		
//		do {
//			System.out.print(c);
//			c = (char)(c + 1);
//		} while (c <= 'z');
		
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.print(i + "*" + j + "=" + i*j);
//				System.out.print('\t');
//			}
//			System.out.println();
//		}
		
//		Scanner scanner = new Scanner(System.in);
//		int sum = 0;
//		for (int i = 0; i < 5; i++) {
//			int n = scanner.nextInt();
//			if (n <= 0) {
//				continue;
//			} else {
//				sum += n;
//			}
//		}
//		System.out.println("����� ���� " + sum);
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Exit�� �Է��ϸ� �����մϴ�.");
//		while (true) {
//			System.out.println(" >> ");
//			String text = scanner.nextLine();
//			if (text.equals("Exit")) {
//				break;
//			}
//		}
//		System.out.println("�����մϴ�.");
//		scanner.close();
		
//		int age = 25;
//		double price = 100.5;
//		String name = "�ſ��";
//		String hobby = "����";
		
//		char v1 = 'A';
//		
//		if (v1 == 'A') {
//			int v2 = 100;
//			double v3 = 3.14;
//		}
//		
//		boolean v4 = true;
		
//		int[] scores = {10, 20, 30};
//		for (int i = 0; i < 3; i++) {
//			System.out.print(scores[i] + " ");
//		}
		
//		int[] scores = { 83, 90, 87 };
//		
//		System.out.println("scores[0] : " + scores[0]);
//		System.out.println("scores[1] : " + scores[1]);
//		System.out.println("scores[2] : " + scores[2]);
//		
//		int sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum += scores[i];
//		}
//		System.out.println("���� : " + sum);
//		double avg = (double) sum / 3;
//		System.out.println("��� : " + avg);
		
//		int[] scores;
//		scores = new int[] { 83, 90, 87 };
//		
//		int sum1 = 0;
//		for (int i = 0; i < 3; i++) {
//			sum1 += scores[i];
//		}
//		
//		System.out.println("���� : " + sum1);
//		
//		int sum2 = add(new int[] { 83, 90, 87 });
//		System.out.println("���� : " + sum2);
//		System.out.println();
//		
//	}
//	
//	public static int add(int[] scores) {
//		int sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum += scores[i];
//		}
//		return sum;
//	}
		
//	public static void main(String[] args) {
		
//		int[] arr1 = new int[3];
//		for (int i = 0; i < 3; i++) {
//			System.out.println("arr1[" + i + "] : " + arr1[i]);
//		}
//		
//		arr1[0] = 10;
//		arr1[1] = 20;
//		arr1[2] = 30;
//		for (int i = 0; i < 3; i++) {
//			System.out.println("arr1[" + i + "] : " + arr1[i]);
//		}
//		
//		double[] arr2 = new double[3];
//		for (int i = 0; i < 3; i++) {
//			System.out.println("arr2[" + i + "] = " + arr2[i]);
//		}
//		
//		arr2[0] = 0.1;
//		arr2[1] = 0.2;
//		arr2[2] = 0.3;
//		for (int i = 0; i < 3; i++) {
//			System.out.println("arr2[" + i + "] = " + arr2[i]);
//		}
//		
//		String[] arr3 = new String[3];
//		for (int i = 0; i < 3; i++) {
//			System.out.println("arr3[" + i + "] = " + arr3[i]);
//		}
//		
//		arr3[0] = "1��";
//		arr3[1] = "2��";
//		arr3[2] = "3��";
//		for (int i = 0; i < 3; i++) {
//			System.out.println("arr3[" + i + "] = " + arr3[i]);
//		}
		
//		int[] scores = { 83, 90, 87 };
//		
//		int sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum += scores[i];
//		}
//		System.out.println("���� : " + sum);
//		
//		double avg = (double) sum / scores.length;
//		System.out.println("��� : " + avg);
	
//		if (args.length != 2) {
//			System.out.println("���α׷� ����");
//			System.out.println("java MainStringArrayArgument num1 num2");
//			System.exit(0);
//		}
//		String strNum1 = args[0];
//		String strNum2 = args[1];
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		
//		int result = num1 + num2;
//		System.out.println(num1 + " + " + num2 + " = " + result);
		
//		int[][] mathScores = new int[2][3];
//		for (int i = 0; i < mathScores.length; i++) {
//			for (int k = 0; k < mathScores[i].length; k++) {
//				System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
//			}
//		}
//		System.out.println();
//		
//		int[][] englishScores = new int[2][];
//		englishScores[0] = new int[2];
//		englishScores[1] = new int[3];
//		for (int i = 0; i < englishScores.length; i++) {
//			for (int k = 0; k < englishScores[i].length; k++) {
//				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
//			}
//		}
//		System.out.println();
//		
//		int[][] javaScores = { {95, 80}, {92, 96, 80} };
//		for (int i = 0; i < javaScores.length; i++) {
//			for (int k = 0; k < javaScores[i].length; k++) {
//				System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
//			}
//		}
//		
//		String[] strArray = new String[3];
//		strArray[0] = 'Java';
//		strArray[1] = 'Java';
//		strArray[2] = new String("Java");
//		
//		System.out.println("");
		
//		String[] strArray = new String[3];
//		strArray[0] = "Java";
//		strArray[1] = "Java";
//		strArray[2] = new String("Java");
//		
//		System.out.println( strArray[0] == strArray[1] );
//		System.out.println( strArray[0] == strArray[2] );
//		System.out.println( strArray[0].equals(strArray[2]));
		
//		int[] oldIntArray = { 1, 2, 3 };
//		int[] newIntArray = new int[5];
//		
//		for (int i = 0; i < oldIntArray.length; i++) {
//			newIntArray[i] = oldIntArray[i];
//		}
//		
//		for (int i = 0; i < newIntArray.length; i++) {
//			System.out.print(newIntArray[i] + ", ");
//		}
		
//		String[] oldStrArray = { "java", "array", "copy" };
//		String[] newStrArray = new String[5];
//		
//		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length );
//		
//		for (int i = 0; i < newStrArray.length; i++) {
//			System.out.print(newStrArray[i] + ", ");
//		}
		
//		int[] scores = { 95, 71, 84, 93, 87 };
//		
//		int sum = 0;
//		for (int score : scores) {
//			sum += score;
//		}
//		System.out.println("���� ���� : " + sum);
//		
//		double avg = (double) sum / scores.length;
//		System.out.println("���� ��� = " + avg);
//	}

//public class javaStudy_201216 {
//
//	public static void main(String[] args) {
//		
//		Student s1 = new Student();
//		System.out.println("s1 ������ Student ��ü�� �����մϴ�.");
//		
//		Student s2 = new Student();
//		System.out.println("s2 ������ �� �ٸ� Student ��ü�� �����մϴ�.");
//	}
//
//}

//public class javaStudy_201216 {
//	public static void main(String[] args) {
//		
//		Car Mycar = new Car();
//		
//		System.out.println("����ȸ�� : " + Mycar.company);
//		System.out.println("�𵨸� : " + Mycar.model);
//		System.out.println("���� : " + Mycar.color);
//		System.out.println("�ְ�ӵ� : " + Mycar.maxSpeed);
//		System.out.println("����ӵ� : " + Mycar.speed);
//		
//		Mycar.speed = 60;
//		
//		System.out.println("����ӵ� : " + Mycar.speed);
//	}
//}

//public class javaStudy_201216 {
//	public static void main(String[] args) {
//		
//		FieldInitValue fiv = new FieldInitValue();
//		
//		System.out.println("byteField : " + fiv.byteField);
//		System.out.println("shortField : " + fiv.shortField);
//		System.out.println("intField : " + fiv.intField);
//		System.out.println("longField : " + fiv.longField);
//		
//		System.out.println("booleanField : " + fiv.booleanField);
//		System.out.println("charField : " + fiv.charField);
//		System.out.println("floatField : " + fiv.floatField);
//		System.out.println("doubleField : " + fiv.doubleField);
//		
//		System.out.println("arrField : 32- + fiv.arrField);
//		System.out.println("referenceField : " + fiv.referenceField);
//		
//	}
//}

//public class javaStudy_201216 {
//	
//	int width;
//	int height;
//	
//	public int getArea() {
//		return width*height;
//	}
//	
//	public static void main(String[] args) {
//		
//		javaStudy_201216 rect = new javaStudy_201216();
//		Scanner scanner = new Scanner(System.in);
//		System.out.print(">> ");
//		
//		rect.width = scanner.nextInt();
//		rect.height = scanner.nextInt();
//		
//		System.out.println("�簢���� ������ " + rect.getArea());
//		
//		scanner.close();
//	}
//}

//public class javaStudy_201216 {
//	public static void main(String[] args) {
//		
//		Car myCar = new Car("����", 3000);
//		}
//}

//public class javaStudy_201216 {
//	public static void main(String[] args) {
//		Korean k1 = new Korean("���ڹ�", "011225-1234567");
//		System.out.println("k1.name : " + k1.name);
//		System.out.println("k1.ssn : " + k1.ssn);
//		
//		Korean k2 = new Korean("���ڹ�", "930525-0654321");
//		System.out.println("k2.name : " + k2.name);
//		System.out.println("k2.ssn : " + k2.ssn);
//	}
//}

//public class javaStudy_201216 {
//	public static void main(String[] args) {
//		Car car1 = new Car();
//		System.out.println("car1.company : " + car1.company);
//		System.out.println();
//		
//		Car car2 = new Car("�ڰ���");
//		System.out.println("car2.company : " + car2.company);
//		System.out.println("car2.model : " + car2.model);
//		System.out.println();
//		
//		Car car3 = new Car("�ڰ���", "����");
//		System.out.println("car3.company : " + car3.company);
//		System.out.println("car3.model : " + car3.model);
//		System.out.println("car3.color : " + car3.color);
//		System.out.println();
//		
//		Car car4 = new Car("�ý�", "����", 200);
//		System.out.println("car4.company : " + car4.company);
//		System.out.println("car4.model : " + car4.model);
//		System.out.println("car4.color : " + car4.color);
//		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
//	}
//}

//public javaStyudy_201216 {
//	public static void main(String[] args) {
//		sysout
//	}
//}
























