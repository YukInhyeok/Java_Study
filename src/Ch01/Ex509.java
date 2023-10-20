package Ch01;// 두 정수 중에서 최대값과 최소값을 구하는 프로그램

import java.util.Scanner;
public class Ex509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a, b;
		int max, min;
		
		System.out.print("정수형 데이터 2개를 입력하세요. >> ");
		
		a = input.nextInt();
		b = input.nextInt();
		
		if(a > b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
			
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min);
		}
	}

}
