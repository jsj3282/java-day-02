package day02;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

          /*
		  //���� 1. 
		 Scanner input = new Scanner(System.in); 
		 int num;
		 System.out.print("���� �Է� : "); 
		 num = input.nextInt(); 
		 if(num % 3 == 0) {
		 System.out.println("�Է��Ͻ� ���� 3�� ����Դϴ�.");
		 }else {
		 System.out.println("�Է��Ͻ� ���� 3�� ����� �ƴմϴ�."); 
		 }
		 
		 //���� 2. 
		 Scanner input = new Scanner(System.in); 
		 int su1, su2, max, min;
		 System.out.print("���� �� �� �Է� : "); 
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
		
		 //���� 3. 
		 //���� �Է¹޾� 5�� ������� �ƴ��� ���� 
		 //���� �Է¹޾� 0���� ũ�� 100���� ������ ����, �ƴϸ� ���������� ���
		 //���� �Է¹޾� ¦���̸鼭 3�� ����̸� ��� 
		
		 Scanner input = new Scanner(System.in);
		 System.out.print("�� �Է� : "); 
		 int num1 = input.nextInt(); 
		 if(num1 % 5 == 0) {
			 System.out.println("5�� ����Դϴ�."); 
			 }else { 
				 System.out.println("5�� ����� �ƴմϴ�.");
				 
		int num2 = input.nextInt(); 
		if(num2>0 && num2<100) {
			System.out.println("�����Դϴ�."); 
			}else { 
				System.out.println("�������Դϴ�."); 
			} 
		
		int num3 = input.nextInt(); 
		if(num3 % 2 ==0 && num3 % 3 == 0) {
		 System.out.println("¦���̸鼭 3�� ����Դϴ�."); 
		 }else {
			 System.out.println("¦���̸鼭 3�� ����� �ƴմϴ�."); }

		
		  //���� 4. 
		 Scanner input = new Scanner(System.in); 
		 int num;
		 System.out.print("�� �Է� : "); 
		 num = input.nextInt(); 
		 if(num > 100) {
			 System.out.println(num + " : 100���� ũ��"); 
		}else if(num > 50) {
			System.out.println(num + " : 50���� ũ��"); }
		else { System.out.println(num +"50���� ���� ����"); 
		}
		
		 //���� 5. 
		 //Ŀ���� ���� ������ 2000���̴�. 10�� �ʰ��ϸ� �ʰ��ϴ� �翡 ���ؼ��� ����
		 //1500���� �޴´�. Ŀ���� ������ �Է� �޾� �ݾ��� ����Ͻÿ�. 
		 //usb 1���� 5000���Ѵ�. �׷��� �ѹ��� 10�� �̻��� ��� ��ü �ݾ��� 10%�� 
		 //�����Ͽ� �ش�.�׸��� 100�� �̻��� ��� ��ü �ݾ��� 12%�� �����Ͽ� �ش�. 
		 //x���� usb�� ����� �󸶰� �־�� �ϴ°�? 
		 Scanner input = new Scanner(System.in); 
		 System.out.print("Ŀ���� ������ �Է��Ͻÿ� : "); 
		 int coffee = input.nextInt(); 
		 if(coffee<10) { 
			 int price = coffee * 2000;
			 System.out.println("Ŀ���� ������ �� " + price + "�� �Դϴ�."); }
		 else { 
			 int price = (coffee-10) * 1500 + 10 * 2000; 
			 System.out.println("Ŀ���� ������ �� " + price +"�� �Դϴ�."); 
			 }
		 
		 int usb = input.nextInt(); 
		 if(usb<10) { 
			 int price = usb * 5000;
			 System.out.println("usb�� ������ �� " + price + "�� �Դϴ�."); 
			 }else if(usb>10) {
				 if(usb>100) { 
					 double price = usb * 5000 * 0.88;
					 System.out.println("usb�� ������ �� " + price + "�� �Դϴ�."); 
					 }
				 else { 
					 double price =usb * 5000 * 0.9; 
					 System.out.println("usb�� ������ �� " + price + "�� �Դϴ�."); 
					 } 
				 }
		
		*/
		// ���� 6. 
		// ��, ��, ���� ������ �Է¹޾� ����� 60�� �̻��̰� �� ������ 40�� �̻��̸� �հ�, 
		// �ƴϸ� ��պ��հ�����, ���� ���հ����� ������ ����ϰ�, ����� 90�� �̻��̸� 'A', 
		// 80 �̻� 'B', 70 �̻� 'C', 60 �̻� 'D', 60�̸��̸� 'F'�� ����Ͻÿ�. 
		// (��� : ���հ� �Ǵ� �հ�, ��, ��, ��, �հ�, ���, ���)

		Scanner input = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kor = input.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int math = input.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng = input.nextInt();
		int sum = kor + math + eng;
		double avg = (kor + math + eng) / 3;
		String level = null;
		if (avg > 60) {
			if (kor > 40 && math > 40 && eng > 40) {
				System.out.println("�հ��Դϴ�!");
			} else {
				System.out.println("���� ���հ��Դϴ�!");
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
			System.out.println("��� ���հ��Դϴ�!");
			level = "F";
		}
		System.out.println("�������� : " + kor);
		System.out.println("�������� : " + eng);
		System.out.println("�������� : " + math);
		System.out.println("�հ�  : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("��� : " + level);

		/*
		
		// ���� 7. ������ �Է¹޾� �Ʒ��� ���� ����Ͻÿ�.
		// 1) 3�� ����̸鼭, 4�� ������� �ش� => [ ]��(��) 3�ǹ���̸鼭, 4�� ����Դϴ�. 
		// 2) 3�� ������� �ش� => [ ]��(��) 3�� ����Դϴ�. // 3) 4�� ������� �ش� => [ ]��(��) 4�� ����Դϴ�. 
		// 4) 3�� �����, 4�� ����� �ش�ȵ� => [ ]��(��) 3�� ����� 4�� ����� �ƴմϴ�. 
		// 5) 0�Է½� �߸� �Է� 
		Scanner input = new Scanner(System.in);
		System.out.print("0�� ������ ���� ������ �ϳ� �Է��Ͻÿ� : "); 
		int num = input.nextInt(); 
		if(num != 0) { 
			if (num % 3 == 0) {
				if (num % 4 == 0) { 
					System.out.println(num +"�� 3�� ����̸鼭, 4�� ����Դϴ�."); 
					} 
				else { 
					System.out.println(num + "�� 3�� ����Դϴ�."); 
				}
				} else { 
					System.out.println(num + "�� 3�� ����� 4�� ����� �ƴմϴ�."); 
					} 
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�."); 
				}

		// ���� 8. ����⸦ Ÿ�µ� 30�� �Ÿ������� �⺻ ����� 30000���̸�, 10�� ������ �߰���� 5000���� �ΰ��ȴ�. //����� Ż
		// �ð��� �Է��Ͽ� ��� ���⸦ ����ÿ�.
		Scanner input = new Scanner(System.in);
		System.out.print("����� Ż �ð��� �Է��Ͻÿ� : ");
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
		System.out.println("����� : " + price);
		//31��~40�� : 8000��, 5000��
		//41��~50�� : 13000��, 10000��
		 
		 */
	}
}
