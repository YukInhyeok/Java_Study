package Ch01;

public class Ex403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 이항 연산자
  1. 산술 연산자(+,-,*,/,%)
 */
		
		int x2 = 5;
		int y2 = 2;
		
		int result21 = x2 + y2;
		System.out.println("x2 + y2 = " + result21);
		int result22 = x2 - y2;
		System.out.println("x2 - y2 = " + result22);
		int result23 = x2 * y2;
		System.out.println("x2 * y2 = " + result23);
		int result24 = x2 / y2;
		System.out.println("x2 / y2 = " + result24);
		int result25 = x2 % y2;
		System.out.println("x2 % y2 = " + result25);
		System.out.println();
/*
  char 타입 연산
 */
		char c1 = ('A' + 8);
		char c2 = 'B';
		char c3 = (char)(c1 + c2);
		System.out.println("'A'+8 = " + c1);
		System.out.println("(char)(c1+c2) = " + c3);
		
/*
   오버플로우 탐지
 */
		
		int x31 = 1500000000;
		int y31 = 1000000000;
		
		int z31 = x31 + y31;
		
		System.out.println("x31+y31 = " + z31);
		
/*
  오버플로우 해결
 */
				
		long x32 = 150000000000L;
		long y32 = 100000000000L;
		
		long z32 = x32 + y32;
				
		System.out.println("x32+y32 = " + z32);
				
/*
   정확하게 계산할 때에는 부동소수점 타입을 사용하지 않는다.
   예 : 사과 1개를 0.1 단위 10조각으로 보고, 그 중 7조각(0.7)을 뺀 3조각(0.3)을 result변수에 저장한다.
   		result의 결과는 0.3일 것이다.
 */
		
// 잘못된 예
	int apple = 1;
	double pieceUnit = 0.1;
	int number = 7;
	
	double result31 = apple - number*pieceUnit;
	
	System.out.println("사과 한개에서");
	System.out.println("0.7 조각을 빼면");
	System.out.println(result31 + "조각이 남는다.");
	
// 올바른 예
	int apple1 = 1;
	int number1 = 7;
	int totalPieces = apple1 * 10;
	int temp = totalPieces - number1;
	
	double result32 = temp/10.0;
	
	System.out.println("사과 한개에서");
	System.out.println("0.7 조각을 빼면");
	System.out.println(result32 + "조각이 남는다.");
	
/*
   2. 문자열 연결 연산자(+)
 */
	
	String str1 = "자바" + 3 + 15.0;
	String str2 = " 프로그래밍";
	
	System.out.println("str1 + str2 = " + (str1 + str2));
	}

}
