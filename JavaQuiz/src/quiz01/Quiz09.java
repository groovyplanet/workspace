package quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		String y = scan.next();
		int z = scan.nextInt();

		
		
		
		switch (y) {
		case "+":System.out.print(x+z);

			break;
		case "-":System.out.print(x-z);

			break;
		case "*":System.out.print(x*z);

			break;
		case "/":System.out.print(x/z);

			break;

		default: System.out.println("잘못입력");
			break;
		}





	}

}
//숙제내용
//명인교육은 사칙연산이 가능한 계산기를 만드려고 합니다.
//
//
//숫자, 연산자, 숫자 를 입력하여 사칙연산을 수행합니다.
//
//사용할 수 있는 연산자는 (+, -, *, /) 입니다
//4가지 연산자 외에 다른 연산자를 입력하면 "잘못입력" 을 출력합니다.
//
//5 + 4 = 9
//5 / 4 = 1
//
////숫자 문자 숫자 를 입력받아 연산결과를 출력하는 프로그램을 switch문으로 만들어주세요.