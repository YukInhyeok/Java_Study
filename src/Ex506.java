import java.util.Scanner;

public class Ex506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  if~else문 : 조건식의 결과에 따라 실행문이 선택
  
  	형식 : 
  		if(조건){
  			조건에 만족할 경우 실행되는 문장;
  		}
  		else{
  			조건에 만족하지 않을 경우 실행되는 문장;
  		}
 */
		// 짝수인지 홀수인지 판별하는 프로그램
		
		Scanner input = new Scanner(System.in);
		
		int a;
		
		System.out.print("0 이상의 정수형 데이터 한 개를 입력하세요. >> ");
		
		a = input.nextInt();
		
		if(a % 2 == 1) {
			System.out.println("홀수이다.");
		}
		else {
			System.out.println("짝수이다.");
		}
		
	}

}
