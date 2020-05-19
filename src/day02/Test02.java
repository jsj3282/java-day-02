package day02;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		/*
		//예제 1.
		Scanner input = new Scanner(System.in);
		int num;
		String name;
		
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("나이 : ");
		num = input.nextInt();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + num);
		*/
		
		//예제 2.
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng, math;
		
		System.out.print("당신의 이름은 무엇입니까? ");
		name = input.next();
		System.out.print(name + "님의 국어 점수 : ");
		kor = input.nextInt();
		System.out.print(name + "님의 영어 점수 : ");
		eng = input.nextInt();
		System.out.print(name + "님의 수학 점수 : ");
		math = input.nextInt();
		System.out.println("================");
		System.out.println("이\t름\t:\t" + name);
		System.out.println("================");
		System.out.println("국\t어\t:\t" + kor);
		System.out.println("영\t어\t:\t" + eng);
		System.out.println("수\t학\t:\t" + math);
		System.out.println("================");
		System.out.println("합\t계\t:\t" + (kor+eng+math));
		System.out.println("================");
		
	}
}
