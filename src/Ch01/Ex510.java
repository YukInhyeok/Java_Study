import java.util.Scanner;

public class Ex510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  if~else if 문
  if~else if~else 문
  
  형식 :
  
  		if(조건1){
  			조건 1에 만족할 때 저리할 문장;
  			}
  		else if(조건2){
  			조건 2에 만족할 때 처리할 문장;
  			}
  			
  		..........
  		
  		else if(조건 n){
  			조건 n에 만족할 때 처리할 문장;
  			}
  		else {
  			위에서 언급한 모든 조건에 대해서 만족하지 않을 때 처리할 문장;
  			}
 */
		// 양수, 음수, 0 구분하는 프로그램
		
		Scanner input = new Scanner(System.in);
		
		int a;
		
		System.out.print("정수형 데이터 한 개를 입력하세요. >>");
		
		a = input.nextInt();
		
		if(a > 0) {
			System.out.println("양수이다.");
		}
		else if(a < 0) {
			System.out.println("음수이다.");
		}
		else {
			System.out.println("0이다.");
		}
		
	}

}
