package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws IOException {
		
		/*
		//예제 1.
		int num1 = 9, num2 = 2;
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
		
		//예제 2.
		int su1, su2;
		su1 = su2 = 5;
		System.out.println("su1 + 1 = " + (su1 += 1));
		System.out.println("su1 - 1 = " + (su1 -= 1) );
		System.out.println("su1 * su2 = " + (su1 *= su2));
		System.out.println("su1 / su2 = " + (su1 /= su2));
		System.out.println("su1 % su2 = " + (su1 %= su2));
		
		//예제 3.
		double do1 = 3.0, do2 = 3.1;
		System.out.println("do1 <= do2 크기 비교 : " + (do1 <= do2));
		System.out.println("do1 >= do2 크기 비교 : " + (do1 >= do2));
		System.out.println("do1 == do2 크기 비교 : " + (do1 == do2));
		System.out.println("do1 != do2 크기 비교 : " + (do1 != do2));
		
		//예제 4.
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
		
		//예제 5.
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
		
		//예제 6.
		int su1, su2, su3;
		
		su1 = 10; su2 = ++su1;
		su1 = 10; su3 = su1++;
		System.out.println("su2 = " + su2);
		System.out.println("su3 = " + su3);
		
		//예제 7.
		int su;
		su = 8;
		String s = (su % 2 == 0)? "짝수":"홀수";
		System.out.println(su + "=" + s);
		
		su = 9;
		s = (su % 2 == 0)? "짝수":"홀수";
		System.out.println(su + "=" + s);
		
		//예제 8.
		//수를 입력 받아 짝, 홀수를 구분하여 출력하시오.
		//수를 입력 받아 3의 배수이면 출력하시오.
		//두 수를 입력 받아 큰 수를 출력하시오.
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("수 입력 : ");
		num = input.nextInt();
		String s = (num % 2 == 0)? "짝수" : "홀수";
		System.out.println(num + " =" + s);
		s = (num % 3 ==0)? "3의 배수이다":"3의 배수가 아니다";
		System.out.println(num + "=" + s);
		
		InputStreamReader input_char = new InputStreamReader(System.in);
		BufferedReader input_string = new BufferedReader(input_char);
		System.out.print("두 수 입력 : ");
		String str = input_string.readLine();	
		String[] array = str.split(" ");
		for(int i = 0; i < array.length; i++) {
			System.out.print("num"+(i+1)+" : "+array[i]+"\t");
		}
		*/
		Scanner input = new Scanner(System.in);
		System.out.print("두 수 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("num1 : " + num1 + " ,  " + "num2 : " + num2);
		String s = (num1>num2)?"num1이 num2보다 크다":"num2가 num1보다 크다";
		System.out.println(s);
	}
}
