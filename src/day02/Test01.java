package day02;
import java.io.*;

public class Test01 {
	public static void main(String[] args) throws IOException{
		
		/*
		//���� 1.
		int val;
		System.out.print("�Է� : ");
		val = System.in.read();
		System.out.println("�Է� data : " + val);
		//System.in.read()�� ���� ������ �Է� �޾� ����.
		
		//���� 2.
		int val_1, val_2;
		System.out.print("ù��° �Է� : ");
		val_1 = System.in.read();
		System.out.println("ù��° �Է� �� : " + val_1);
		System.out.print("�ι�° �Է� : ");
		val_2 = System.in.read();
		System.out.println("�ι�° �Է� �� : " + val_2);
		//Enter��� ���ڰ� ���ۿ� ����Ǿ� �ִ�.
		//Enter�� �ΰ��� ���ڰ� ������ ���� : \r + \n
		// \r : carriage return Ŀ���� �ڵ��� �� ������ ���ƿ��� ��
		// \n : �����ٷ� �̵��ϰ� ��.
		
		//���� 3.
		int val_1, val_2;
		System.out.print("ù��° �Է� : ");
		val_1 = System.in.read();
		System.out.println("ù��° �Է� �� : " + val_1);
		System.out.print("�ι�° �Է� : ");
		System.in.read();
		System.in.read();
		val_2 = System.in.read();
		System.out.println("�ι�° �Է� �� : " + val_2);
		
		//���� 4. �빮�ڸ� �Է¹޾� �ҹ��ڷ� ��ȯ�Ͽ� ����Ͻÿ�.
		char val_1, val_2;
		System.out.print("���� �Է� : ");
		val_1 = (char) System.in.read();
		val_2 = (char) (val_1 + 32);
		System.out.println("�Է��Ͻ� ���� : " + val_1);
		System.out.println("�ҹ��ڷ� ��ȯ : " + val_2);
		
		
		//���� 5. ���ڷ� ���� ���� �Է¹޾� ���ڷ� ǥ���Ͻÿ�.
		char val_1;
		int val_2;
		System.out.print("�� �Է� : ");
		val_1 = (char) System.in.read();
		val_2 = (int)val_1;
		System.out.println("==== ��� ====");
		System.out.print("�Է��Ͻ� �� : " + val_1);
		System.out.println();
		System.out.println("��ȯ �� �� : " + val_2);
		*/
		
		int val_1, val_2;
		System.out.print("ù��° �Է� : ");
		val_1 = System.in.read();
		System.out.println("�Է� �� : " + (char)val_1);
		System.out.println("�Է� �� : " + (val_1 - '0'));
		//System.out.prinln("�Է� �� : " + (val_1 - 48));
		
	}

}
