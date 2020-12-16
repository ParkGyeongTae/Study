package TutorialPackage;

import java.util.Scanner;

//public class javaStudy_201216 {
	
/*
 * 1. JDK와 JRE의 차이점을 설명한 것 중 틀린 것은 무엇입니다?
 *
 *  1. JDK는 JRE의 컴파일러 등의 개발도구가 포함된다. O
 *  2. 자바 프로그램을 개발하려면 JDK가 반드시 필요하다. O
 *  3. 자바 프로그램을 실행만 하려면 JRE를 설치해도 상관없다. O
 *  4. JRE에는 컴파일러(javac.exe)가 포함되어 있다 X
 *  
 * 2. JVM에 대한 설명으로 틀린 것은 무엇입니까?
 * 
 *  1. JVM은 java.exe 명령어에 의해 구동된다. O
 *  2. JVM은 바이트 코드를 기계어로 변환시키고 실행한다. O
 *  3. JVM은 운영체제에 독립적이다. (운영체제별로 동일한 JVM이 사용된다.) X
 *  4. 바이트 코드는 JVM에 독립적이지만, JVM은 운영체제에 종속적이다. O
 *  
 * 3. 자바 프로그램 개발과정을 순서대로 나열하세요.
 * 
 *  1. javac.exe로 바이트 코드 파일(~.class)을 생성한다. (2)
 *  2. java.exe로 JVM을 구동시킨다. (3)
 *  3. 자바 소스 파일(~.java)를 작성한다. (1)
 *  4. JVM은 main() 메소드를 찾아 메소드 블록을 실행시킨다. (4)
 *  
 * 4. 자바 소스 파일을 작성할 때 틀린 것은 무엇입니까?
 * 
 *  1. 자바 소스 파일명과 클래스 이름은 대소문자가 동일해야 한다. O
 *  2. 클래스 블록과 메소드 블록은 반드시 중괄호 {}로 감싸야 한다. O
 *  3. 실행문 뒤에는 반드시 세미콜론(;)을 붙여야 한다. O
 *  4. 주석은 문자열 안에도 작성할 수 있다. X
 *  
 * 5. 자바 주석문의 종류가 아닌 것은 무엇입니까?
 * 
 *  1. // : 행 주석 O
 *  2. /*... / : 범위 주석 O
 *  3. /**... / : API 도큐먼트 주석 O
 *  4. <!--....--> : 범위 주석 X
 *  
 * 6. 이클립스에 대한 설명으로 틀린 것은 무엇입니까?
 * 
 *  1. 이클립스는 JDK(JRE)를 설치해야만 실행할 수 있다. O
 *  2. 이클립스에서 소스 파일을 저장하면 자동 컴파일되어 바이트 코드 파일이 생성된다. O
 *  3. 워크스페이스는 프로젝트들이 생성되는 기본 디렉토리를 말한다. O
 *  4. metadata는 프로젝트의 소스 파일들이 저장되는 디렉토리이다. X
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
//		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요. : ");
//		int n = scanner.nextInt();
//		
//		while (n != -1) {
//			sum += n;
//			count += 1;
//			n = scanner.nextInt();
//		}
//		
//		if (count == 0) {
//			System.out.println("입력된 수가 없습니다.");
//		} else {
//			System.out.println("정수의 개수는 " + count + " 개 이며");
//			System.out.println("평균은 " + sum/count + " 입니다.");
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
//		System.out.println("양수의 합은 " + sum);
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Exit을 입력하면 종료합니다.");
//		while (true) {
//			System.out.println(" >> ");
//			String text = scanner.nextLine();
//			if (text.equals("Exit")) {
//				break;
//			}
//		}
//		System.out.println("종료합니다.");
//		scanner.close();
		
//		int age = 25;
//		double price = 100.5;
//		String name = "신용권";
//		String hobby = "독서";
		
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
//		System.out.println("총합 : " + sum);
//		double avg = (double) sum / 3;
//		System.out.println("평균 : " + avg);
		
//		int[] scores;
//		scores = new int[] { 83, 90, 87 };
//		
//		int sum1 = 0;
//		for (int i = 0; i < 3; i++) {
//			sum1 += scores[i];
//		}
//		
//		System.out.println("총합 : " + sum1);
//		
//		int sum2 = add(new int[] { 83, 90, 87 });
//		System.out.println("총합 : " + sum2);
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
//		arr3[0] = "1월";
//		arr3[1] = "2월";
//		arr3[2] = "3월";
//		for (int i = 0; i < 3; i++) {
//			System.out.println("arr3[" + i + "] = " + arr3[i]);
//		}
		
//		int[] scores = { 83, 90, 87 };
//		
//		int sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum += scores[i];
//		}
//		System.out.println("총합 : " + sum);
//		
//		double avg = (double) sum / scores.length;
//		System.out.println("평균 : " + avg);
	
//		if (args.length != 2) {
//			System.out.println("프로그램 사용법");
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
//		System.out.println("점수 총합 : " + sum);
//		
//		double avg = (double) sum / scores.length;
//		System.out.println("점수 평균 = " + avg);
//	}

//public class javaStudy_201216 {
//
//	public static void main(String[] args) {
//		
//		Student s1 = new Student();
//		System.out.println("s1 변수가 Student 객체를 참조합니다.");
//		
//		Student s2 = new Student();
//		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
//	}
//
//}

//public class javaStudy_201216 {
//	public static void main(String[] args) {
//		
//		Car Mycar = new Car();
//		
//		System.out.println("제작회사 : " + Mycar.company);
//		System.out.println("모델명 : " + Mycar.model);
//		System.out.println("색깔 : " + Mycar.color);
//		System.out.println("최고속도 : " + Mycar.maxSpeed);
//		System.out.println("현재속도 : " + Mycar.speed);
//		
//		Mycar.speed = 60;
//		
//		System.out.println("현재속도 : " + Mycar.speed);
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
//		System.out.println("사각형의 면적은 " + rect.getArea());
//		
//		scanner.close();
//	}
//}

//public class javaStudy_201216 {
//	public static void main(String[] args) {
//		
//		Car myCar = new Car("검정", 3000);
//		}
//}

//public class javaStudy_201216 {
//	public static void main(String[] args) {
//		Korean k1 = new Korean("박자바", "011225-1234567");
//		System.out.println("k1.name : " + k1.name);
//		System.out.println("k1.ssn : " + k1.ssn);
//		
//		Korean k2 = new Korean("김자바", "930525-0654321");
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
//		Car car2 = new Car("자가용");
//		System.out.println("car2.company : " + car2.company);
//		System.out.println("car2.model : " + car2.model);
//		System.out.println();
//		
//		Car car3 = new Car("자가용", "빨강");
//		System.out.println("car3.company : " + car3.company);
//		System.out.println("car3.model : " + car3.model);
//		System.out.println("car3.color : " + car3.color);
//		System.out.println();
//		
//		Car car4 = new Car("택시", "검정", 200);
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
























