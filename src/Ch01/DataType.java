package Ch01;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 @ 식별자
		 ex)	class HelloWorld{
		 			main(){
		 				int i;
		 			}
		 		}
		 			
		 * 식별자 명명 규칙
		 1. 영문자(A~Z, a~z)와 숫자(0~9)와 '_', '$'의 조합으로 만들어진다.
		 2. 첫 글자는 반드시 영문자나 '_'로 시작하여야 한다. 숫자로 시작해서는 안된다.
		 3. 식별자는 철자(스펠링)가 같다고 해도 대소문자를 구분하기 때문에 조심해야 한다.
		 	ex) aaa, AAA 같지 않다.
		 4. 자바에서 사용되는 예약어는 식별자로 사용할 수 없다.
		 	ex) class, int, float
		 5. 식별자는 가급적이면 자기 역활에 맞는 이름을 부여한다.
		 
		 * 식별자로 사용하지 못하는 예
		 1. 스페이스나 \t, \n 등은 올 수 없다.
		 	ex) Hello World, Hello\nWorld
		 2. 처음 글자는 숫자가 될 수 없다.
		 	ex) 7HelloWorld
		 3. 자바에서 사용되는 키워드는 사용될 수 없다.
		 	ex) class, main, int, Double, Scaaner
		 4. 특수 문자는 '_' 혹은 '$'만 사용 가능하다.
		 	ex) #HelloWorld
		 	
		@ 자바의 자료 타입
			기본 자료 타입
				Boolean(논리형)
				숫자(Number)
					정수형(Integer)
						byte	: 1byte(8bit)
						short	: 2byte(16bit)
						char	: 2byte(16bit)
						int		: 4byte(32bit)	<
						long	: 8byte(64bit)
					실수형(floating, Double)
						float	: 4byte(32bit)
						double	: 8byte(64bit)	<
				문자(Character)
						char
						String	<
			레퍼런스 타입 : 클래스, 인터페이스, 배열
			
		@ 상수와 변수
		형식 : 자료타입 변수명;
		
		@ 정수형 - byte, short, int, long
		
			- 크기순으로 나열
			 byte	short	int 	long
			 1byte	2byte	4byte	8byte
			 2^0	2^1		2^2		2^3		 
		 */
		
		byte byteVer = 1;
		short shortVar = 128;
		int intVar = 32768;
		long longVar = 2100000000L;	// long 타입의 정수형 상수는 점미사 L 를 붙임
		
		System.out.println(byteVer);
		System.out.println(shortVar);
		System.out.println(intVar);
		System.out.println(longVar);
		
		/*
		 @ 실수형 - float, double
		   실수형 상수의 예
		    종류			예		설명
		  ======================================
		  	소수형	1234.5		가장 일반적으로 사용한 실수형 데이터
		  			0.0000987
		  			
		  	지수형	1.2345E3	영문자 E를 기준으로 앞에는 기수부 뒤에서 지수부를 기술함
		  			0.987E-5
		 */
		
		double doubleVar = 1.234567890123456789;
		float floatVar = 1.234567890123456789f;  // float형 실수형 상수는 접미사 f를 붙임
		
		System.out.println(doubleVar);
		System.out.println(floatVar);
	}

}
