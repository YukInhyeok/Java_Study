import java.util.Scanner;


public class Ex501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  1. 조건문
  - 단순 if : 조건에 따라 어떤 명령을 선택적으로 처리하기 위해 사용하는 가장 대표적인 조건문 구문
  - 형식 : 
  		 if(조건문){
  		 	 조건에 만족할 경우 실행되는 문장1;
  		 	 조건에 만족할 경우 실행되는 문장2;
  		 }
  		 
  		 : 조건문 or 조건식 => true 또는 false 값을 산출할 수 있는 연산식, boolean 변수
 */
		
		// 절대값 구하기 프로그램
		
		
		Scanner input = new Scanner(System.in);
		
		int a;
		
		System.out.print("정수형 데이터 한 개를 입력하세요. >> ");
		
		a = input.nextInt();
		
		if(a <0) {
			a=-a;
		}
		
		System.out.println("절대값은 " + a + "입니다.");
		
	}

}
