package day02;
import java.io.*;

public class Test01 {
	public static void main(String[] args) throws IOException{
		
		/*
		//예제 1.
		int val;
		System.out.print("입력 : ");
		val = System.in.read();
		System.out.println("입력 data : " + val);
		//System.in.read()를 통해 여러번 입력 받아 본다.
		
		//예제 2.
		int val_1, val_2;
		System.out.print("첫번째 입력 : ");
		val_1 = System.in.read();
		System.out.println("첫번째 입력 값 : " + val_1);
		System.out.print("두번째 입력 : ");
		val_2 = System.in.read();
		System.out.println("두번째 입력 값 : " + val_2);
		//Enter라는 문자가 버퍼에 저장되어 있다.
		//Enter는 두개의 문자가 합쳐진 형태 : \r + \n
		// \r : carriage return 커서를 코드의 맨 앞으로 돌아오게 함
		// \n : 다음줄로 이동하게 함.
		
		//예제 3.
		int val_1, val_2;
		System.out.print("첫번째 입력 : ");
		val_1 = System.in.read();
		System.out.println("첫번째 입력 값 : " + val_1);
		System.out.print("두번째 입력 : ");
		System.in.read();
		System.in.read();
		val_2 = System.in.read();
		System.out.println("두번째 입력 값 : " + val_2);
		
		//예제 4. 대문자를 입력받아 소문자로 변환하여 출력하시오.
		char val_1, val_2;
		System.out.print("문자 입력 : ");
		val_1 = (char) System.in.read();
		val_2 = (char) (val_1 + 32);
		System.out.println("입력하신 문자 : " + val_1);
		System.out.println("소문자로 변환 : " + val_2);
		
		
		//예제 5. 문자로 다음 값을 입력받아 숫자로 표현하시오.
		char val_1;
		int val_2;
		System.out.print("값 입력 : ");
		val_1 = (char) System.in.read();
		val_2 = (int)val_1;
		System.out.println("==== 출력 ====");
		System.out.print("입력하신 값 : " + val_1);
		System.out.println();
		System.out.println("변환 후 값 : " + val_2);
		*/
		
		int val_1, val_2;
		System.out.print("첫번째 입력 : ");
		val_1 = System.in.read();
		System.out.println("입력 값 : " + (char)val_1);
		System.out.println("입력 값 : " + (val_1 - '0'));
		//System.out.prinln("입력 값 : " + (val_1 - 48));
		
	}

}
