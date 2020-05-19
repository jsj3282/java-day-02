package day02;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

          /*
		  //예제 1. 
		 Scanner input = new Scanner(System.in); 
		 int num;
		 System.out.print("수를 입력 : "); 
		 num = input.nextInt(); 
		 if(num % 3 == 0) {
		 System.out.println("입력하신 수는 3의 배수입니다.");
		 }else {
		 System.out.println("입력하신 수는 3의 배수가 아닙니다."); 
		 }
		 
		 //예제 2. 
		 Scanner input = new Scanner(System.in); 
		 int su1, su2, max, min;
		 System.out.print("정수 두 개 입력 : "); 
		 su1 = input.nextInt(); 
		 su2 =input.nextInt(); 
		 if(su1>su2) { 
			 max = su1; 
			 min = su2;
		     System.out.println("max : " + max + "min : " + min); 
		 } else { 
			 max = su2; 
			 min= su1; 
			 System.out.println("max : " + max + "min : " + min);
		 }
		
		 //예제 3. 
		 //수를 입력받아 5의 배수인지 아닌지 구분 
		 //수를 입력받아 0보다 크고 100보다 작으면 정상, 아니면 비정상으로 출력
		 //수를 입력받아 짝수이면서 3의 배수이면 출력 
		
		 Scanner input = new Scanner(System.in);
		 System.out.print("수 입력 : "); 
		 int num1 = input.nextInt(); 
		 if(num1 % 5 == 0) {
			 System.out.println("5의 배수입니다."); 
			 }else { 
				 System.out.println("5의 배수가 아닙니다.");
				 
		int num2 = input.nextInt(); 
		if(num2>0 && num2<100) {
			System.out.println("정상입니다."); 
			}else { 
				System.out.println("비정상입니다."); 
			} 
		
		int num3 = input.nextInt(); 
		if(num3 % 2 ==0 && num3 % 3 == 0) {
		 System.out.println("짝수이면서 3의 배수입니다."); 
		 }else {
			 System.out.println("짝수이면서 3의 배수가 아닙니다."); }

		
		  //예제 4. 
		 Scanner input = new Scanner(System.in); 
		 int num;
		 System.out.print("수 입력 : "); 
		 num = input.nextInt(); 
		 if(num > 100) {
			 System.out.println(num + " : 100보다 크다"); 
		}else if(num > 50) {
			System.out.println(num + " : 50보다 크다"); }
		else { System.out.println(num +"50보다 작은 값들"); 
		}
		
		 //예제 5. 
		 //커피의 개당 가격은 2000원이다. 10개 초과하면 초과하는 양에 대해서만 개당
		 //1500원씩 받는다. 커피의 개수를 입력 받아 금액을 출력하시오. 
		 //usb 1개에 5000원한다. 그런데 한번에 10개 이상을 사면 전체 금액의 10%를 
		 //할인하여 준다.그리고 100개 이상을 사면 전체 금액의 12%를 할인하여 준다. 
		 //x통의 usb를 사려면 얼마가 있어야 하는가? 
		 Scanner input = new Scanner(System.in); 
		 System.out.print("커피의 개수를 입력하시오 : "); 
		 int coffee = input.nextInt(); 
		 if(coffee<10) { 
			 int price = coffee * 2000;
			 System.out.println("커피의 가격은 총 " + price + "원 입니다."); }
		 else { 
			 int price = (coffee-10) * 1500 + 10 * 2000; 
			 System.out.println("커피의 가격은 총 " + price +"원 입니다."); 
			 }
		 
		 int usb = input.nextInt(); 
		 if(usb<10) { 
			 int price = usb * 5000;
			 System.out.println("usb의 가격은 총 " + price + "원 입니다."); 
			 }else if(usb>10) {
				 if(usb>100) { 
					 double price = usb * 5000 * 0.88;
					 System.out.println("usb의 가격은 총 " + price + "원 입니다."); 
					 }
				 else { 
					 double price =usb * 5000 * 0.9; 
					 System.out.println("usb의 가격은 총 " + price + "원 입니다."); 
					 } 
				 }
		
		*/
		// 예제 6. 
		// 국, 영, 수학 점수를 입력받아 평균이 60점 이상이고 각 점수가 40점 이상이면 합격, 
		// 아니면 평균불합격인지, 과목 불합격인지 사유를 출력하고, 평균이 90점 이상이면 'A', 
		// 80 이상 'B', 70 이상 'C', 60 이상 'D', 60미만이면 'F'를 출력하시오. 
		// (출력 : 불합격 또는 합격, 국, 영, 수, 합계, 평균, 등급)

		Scanner input = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = input.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = input.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = input.nextInt();
		int sum = kor + math + eng;
		double avg = (kor + math + eng) / 3;
		String level = null;
		if (avg > 60) {
			if (kor > 40 && math > 40 && eng > 40) {
				System.out.println("합격입니다!");
			} else {
				System.out.println("과목 불합격입니다!");
			}
			if (avg > 90)
				level = "A";
			if (avg > 80)
				level = "B";
			if (avg > 70)
				level = "C";
			if (avg > 60)
				level = "D";
		} else {
			System.out.println("평균 불합격입니다!");
			level = "F";
		}
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("합계  : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("등급 : " + level);

		/*
		
		// 예제 7. 정수를 입력받아 아래와 같이 출력하시오.
		// 1) 3의 배수이면서, 4의 배수에도 해당 => [ ]은(는) 3의배수이면서, 4의 배수입니다. 
		// 2) 3의 배수에만 해당 => [ ]은(는) 3의 배수입니다. // 3) 4의 배수에만 해당 => [ ]은(는) 4의 배수입니다. 
		// 4) 3의 배수도, 4의 배수도 해당안됨 => [ ]은(는) 3의 배수도 4의 배수도 아닙니다. 
		// 5) 0입력시 잘못 입력 
		Scanner input = new Scanner(System.in);
		System.out.print("0을 제외한 양의 정수를 하나 입력하시오 : "); 
		int num = input.nextInt(); 
		if(num != 0) { 
			if (num % 3 == 0) {
				if (num % 4 == 0) { 
					System.out.println(num +"은 3의 배수이면서, 4의 배수입니다."); 
					} 
				else { 
					System.out.println(num + "은 3의 배수입니다."); 
				}
				} else { 
					System.out.println(num + "은 3의 배수도 4의 배수도 아닙니다."); 
					} 
			}else {
				System.out.println("잘못입력하셨습니다."); 
				}

		// 예제 8. 비행기를 타는데 30분 거리까지의 기본 요금은 30000원이며, 10분 단위로 추가요금 5000원씩 부가된다. //비행기 탈
		// 시간을 입력하여 요금 계산기를 만드시오.
		Scanner input = new Scanner(System.in);
		System.out.print("비행기 탈 시간을 입력하시오 : ");
		int time = input.nextInt();
		int price = 0;
		if (time <= 30) {
			price = 30000;
		} else {
			if (time % 10 == 0) {
				price = 30000 + ((time-30) / 10) * 5000;
			}else {
				price = 30000 + (((time-30) / 10) + 1) * 5000;
			}
		}
		System.out.println("요금은 : " + price);
		//31분~40분 : 8000원, 5000원
		//41분~50분 : 13000원, 10000원
		 
		 */
	}
}
