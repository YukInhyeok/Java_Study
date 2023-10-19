// 1단계 : java.util.Scanner 클래스를 import 한다.
import java.util.*;
import java.util.Scanner;
public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2단계 : Scanner클래스 객체를 생성한다.
		Scanner input = new Scanner(System.in);
		
		// 3단계 : 변수 선언
		double a,b,c;
		
		// 4단계 : 입력받을 내용에 따라 문구를 작성한다.
		System.out.print("실수형 데이터 2개를 입력하세요. >> ");
		
		// 5단계 : nextInt() 메소드를 이용해서 정수값을 입력한다.
		
		a = input.nextDouble();
		b = input.nextDouble();
		
		// 6단계 : a와 b를 처리한다.
		c = a*b;
		
		// 7단계 : 결과 c를 콘솔에 출력한다.
		System.out.println(a + " * " + b + " = " + c);
	}

}
