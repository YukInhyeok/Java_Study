
public class Ex404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  3. 비교 연산자(<,<=,>,>=,==,!=)
 */
		
		int num1 = 10;
		int num2 = 10;
		
		boolean result41 = (num1 == num2);
		System.out.println("result41 = " + result41);
		
		boolean result42 = (num1 != num2);
		System.out.println("result42 = " + result42);
		
		boolean result43 = (num1 <= num2);
		System.out.println("result43 = " + result43);
		
		double v11 = 0.1;
		float v12 = 0.1f;
		
		System.out.println("v11 == v12 : " + (v11 == v12));
		System.out.println("(float)v11 == v12 : " + ((float)v11 == v12));
		System.out.println();
		System.out.println();
		
/*
   문자열 비교
 */
		String strVar21 ="홍길동";
		String strVar22 ="홍길동";
		String strVar23 = new String("홍길동");
		
		System.out.println("strVar21 == strVar22 : " + (strVar21 == strVar22));
		System.out.println("strVar21 == strVar23 : " + (strVar21 == strVar23));
		System.out.println();
		System.out.println("strVar21.equals(strVar22) : " + strVar21.equals(strVar22));
		System.out.println("strVar21.equals(strVar22) : " + strVar21.equals(strVar23));
		
		
/*
  4. 논리 연산자(&&, ||, &, |, ^, !)
 */
		
		int charCode = 'A';
		
		if( (charCode >= 65) && (charCode <=90) ) {
			System.out.println("대문자 입니다.");		
		}
		else {
			
		System.out.println("꽝!!!");
		}
		
		System.out.println();
		
		if( (charCode >= 65) || (charCode <=90) ) {
			System.out.println("대문자 입니다.");		
		}
		else {
			
		System.out.println("꽝!!!");
		}
		
		System.out.println();
		
		if( (charCode >= 65) & (charCode <=90) ) {
			System.out.println("대문자 입니다.");		
		}
		else {
			
		System.out.println("꽝!!!");
		}
		
		System.out.println();
		
		int valueCode = 6;
		
		if( (valueCode == 0) || (valueCode > 5)  ) {
			System.out.println("숫자 입니다.");
		}
		else {
			System.out.println("꽝!!!");
		}
		


/*
  5. 비트 연산자 (&, |, ^, ~, <<, >>, >>>)
   AND(논리곱) : &  => 두 비트 모두 1일 경우에만 연산 결과가 1
   OR(논리합) : | => 두 비트 중 하나만 1이면 연산 결과는 1
   XOR(베타적논리합) : ^ => 두 비트 중 하나는 1이고 다른 하나가 0일 경우 연산 결과는 1
   NOT(논리 부정) : ~ => 보수
   
   	 00001101  A
   	 10101010  B
   	 ========
   	 00001000 (논리곱)
   	 10101111 (논리합)
   	 10100111 (베타적 논리합)
   	 11110010 (~A)
   	 01010101 (~B)
 */
		
		System.out.println();
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 | 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("~25 = " + (~25));
		
/*
  비트 이동 연산자(<<, >>, >>>)
  
  연산식									설명
  =========================================================================================
  a << b		정수 a의 각 비트를 b만큼 왼쪽으로 이동(빈자리는 0으로 채워진다)
  a >> b		정수 a의 각 비트를 b만큼 오른쪽으로 이동(빈자리는 정수 a의 최상위 부호 비트와 같은 값으로 채워진다.)
  a >>> b		정수 a의 각 비트를 b 만큼 오른쪽으로 이동(빈자리는 0으로 채워진다.)
 */
		
		System.out.println("1 << 3 : " + (1<<3));
		System.out.println("-8 >> 3 : " + (-8 >> 3));
		System.out.println("-8 >>> 3 : " + (-8 >>> 3));
		System.out.println();
		
		
/*
  6. 대입 연산자(=, +=, -=, &=, *=)
 */
		int result51 = 0;
		result51 += 10; // result51 = result51 + 10;		 
		System.out.println("result51 = " + result51);
		System.out.println();
		System.out.println();
	}
}
