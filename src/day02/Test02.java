package day02;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		/*
		//���� 1.
		Scanner input = new Scanner(System.in);
		int num;
		String name;
		
		System.out.print("�̸� �Է� : ");
		name = input.next();
		System.out.print("���� : ");
		num = input.nextInt();
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + num);
		*/
		
		//���� 2.
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng, math;
		
		System.out.print("����� �̸��� �����Դϱ�? ");
		name = input.next();
		System.out.print(name + "���� ���� ���� : ");
		kor = input.nextInt();
		System.out.print(name + "���� ���� ���� : ");
		eng = input.nextInt();
		System.out.print(name + "���� ���� ���� : ");
		math = input.nextInt();
		System.out.println("================");
		System.out.println("��\t��\t:\t" + name);
		System.out.println("================");
		System.out.println("��\t��\t:\t" + kor);
		System.out.println("��\t��\t:\t" + eng);
		System.out.println("��\t��\t:\t" + math);
		System.out.println("================");
		System.out.println("��\t��\t:\t" + (kor+eng+math));
		System.out.println("================");
		
	}
}
