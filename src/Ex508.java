// 양수인지 음수인지 판단하는 프로그램

import java.util.Scanner;
public class Ex508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a;
		
		System.out.println("정수형 데이터 한 개를 입력하세요. >> ");
		
		a = input.nextInt();
		
		if(a>0) {
			System.out.println("양수입니다.");
		}
		else {
			System.out.println("음수입니다.");
		}
	}

}
