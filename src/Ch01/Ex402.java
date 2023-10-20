package Ch01;

public class Ex402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 단항 연산자
  1. 부호 연산자(+, -)
  
  연산식			설명
  +		피연산자	피연산자의 부호 유지
  -		피연산자	피연산자의 부호 변경
 */
	
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = "+ result1); // +(-100)
		System.out.println("result2 = "+ result2); // -(-100)
		System.out.println();
		
/*
  	2.증감 연산자(++, --)
  		연산식				설명
  	++	피연산자		다른 연산을 수행하기 전에 피연산자의 값을 1증가시킴
  	--	피연산자		다른 연산을 수행하기 전에 피연산자의 값을 1감소시킴
  	피연산자	++		다른 연산을 수행한 후 피연산자의 값을 1증가시킴
  	피연산자	--		다른 연산을 수행한 후 피연산자의 값을 1감소시킴
 */
	
		int x1 = 10;
		int y1 = 10;
		int z;
		
		++x1;
		System.out.println("++x1 = " + x1);
		
		y1--;
		System.out.println("++y1 = " + y1);
		
		z = x1-- + ++y1;
		System.out.println("x1 = " + x1 + ", y1 = " + y1 );
		System.out.println("x1-- + ++y1 = " + z);
		System.out.println();
		
/*
  3. 논리 부정 연산자(!)
  
  	연산식			설명
  	! 피연산자			피연산자가 true이면 false 값을 산출
  					피연산자가 false이면 true 값을 산출
 */
		
		boolean play = true;
		
		System.out.println("play = " + play);
		
		play = !play;
		
		System.out.println("!play = " + play);
		
/*
  4. 비트 반전 연산자(~)
 */
		
		int b1 = 10;
		int b2 = ~b1;
		
		System.out.println("b1 = " + b1); // 00001010
		System.out.println("b2 = " + b2); // 11110110
		System.out.println();
		
	}

}
