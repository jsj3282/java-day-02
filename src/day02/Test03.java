package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws IOException {
		
		/*
		//���� 1.
		int num1 = 9, num2 = 2;
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
		
		//���� 2.
		int su1, su2;
		su1 = su2 = 5;
		System.out.println("su1 + 1 = " + (su1 += 1));
		System.out.println("su1 - 1 = " + (su1 -= 1) );
		System.out.println("su1 * su2 = " + (su1 *= su2));
		System.out.println("su1 / su2 = " + (su1 /= su2));
		System.out.println("su1 % su2 = " + (su1 %= su2));
		
		//���� 3.
		double do1 = 3.0, do2 = 3.1;
		System.out.println("do1 <= do2 ũ�� �� : " + (do1 <= do2));
		System.out.println("do1 >= do2 ũ�� �� : " + (do1 >= do2));
		System.out.println("do1 == do2 ũ�� �� : " + (do1 == do2));
		System.out.println("do1 != do2 ũ�� �� : " + (do1 != do2));
		
		//���� 4.
		System.out.println("false || false : " + (false || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("true || true : " + (true || false));
		
		System.out.println("!true : " + !true);
		System.out.println("!false : " + !false);
		
		System.out.println("false && false : " + (false && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("true && true : " + (true && true));
		
		//���� 5.
		int su1;
		double su2;
		
		su1 = 5; ++su1;
		System.out.println("++su1 = " + su1);
		su1 = 5; su1++;
		System.out.println("su1++ = " + su1);
		su2 = 11.2; ++su2;
		System.out.println("++su2 = " + su2);
		su2 = 11.2; su2++;
		System.out.println("++su2 = " + su2);
		
		//���� 6.
		int su1, su2, su3;
		
		su1 = 10; su2 = ++su1;
		su1 = 10; su3 = su1++;
		System.out.println("su2 = " + su2);
		System.out.println("su3 = " + su3);
		
		//���� 7.
		int su;
		su = 8;
		String s = (su % 2 == 0)? "¦��":"Ȧ��";
		System.out.println(su + "=" + s);
		
		su = 9;
		s = (su % 2 == 0)? "¦��":"Ȧ��";
		System.out.println(su + "=" + s);
		
		//���� 8.
		//���� �Է� �޾� ¦, Ȧ���� �����Ͽ� ����Ͻÿ�.
		//���� �Է� �޾� 3�� ����̸� ����Ͻÿ�.
		//�� ���� �Է� �޾� ū ���� ����Ͻÿ�.
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("�� �Է� : ");
		num = input.nextInt();
		String s = (num % 2 == 0)? "¦��" : "Ȧ��";
		System.out.println(num + " =" + s);
		s = (num % 3 ==0)? "3�� ����̴�":"3�� ����� �ƴϴ�";
		System.out.println(num + "=" + s);
		
		InputStreamReader input_char = new InputStreamReader(System.in);
		BufferedReader input_string = new BufferedReader(input_char);
		System.out.print("�� �� �Է� : ");
		String str = input_string.readLine();	
		String[] array = str.split(" ");
		for(int i = 0; i < array.length; i++) {
			System.out.print("num"+(i+1)+" : "+array[i]+"\t");
		}
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("�� �� �Է� : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("num1 : " + num1 + " ,  " + "num2 : " + num2);
		String s = (num1>num2)?"num1�� num2���� ũ��":"num2�� num1���� ũ��";
		System.out.println(s);
	}
}
