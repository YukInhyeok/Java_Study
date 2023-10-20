package Ch01;// 1단계 : java.util.Scanner 클래스를 import 한다.
import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2단계 : Scanner클래스 객체를 생성한다.
		Scanner input = new Scanner(System.in);
				
		// 3단계 : 변수 선언
		String greeting, name;
		
		// 4-1단계 : 입력받을 내용에 따라 문구를 작성한다.
		System.out.print("인사 말을 입력하세요. >> ");
				
		// 4-2단계 : nextLine() 메소드를 이용해서 문자열을 입력한다.
		greeting = input.nextLine();
				
		// 4-3단계 : 입력받을 내용에 따라 문구를 작성한다.
		System.out.print("이름을 입력하세요. >> ");
						
		// 4-4단계 : nextLine() 메소드를 이용해서 문자열을 입력한다.
		name = input.nextLine();
						
		
		// 7단계 : 결과 c를 콘솔에 출력한다.
		System.out.println();
		System.out.println("인사말 : " + greeting);
		System.out.println("이름 :  " + name);
	}

}
