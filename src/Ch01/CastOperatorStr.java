package Ch01;

public class CastOperatorStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	@	형변환과 캐스트 연산자
	int a;
	a=3.5;
	
	형변환 : 대입 연산자를 두고 자료 타입이 서로 다를 때 대입 연산자 오른쪽의 자료 타입이 왼쪽에 오는
			변수의 자료 타입에 맞추어서 자료 타입 변경
			
	기본자료 - double > float > long > int > char
	
	
	캐스트 연산자
	
	int a = (int)3.5;
			(자료타입)식
		
		 */
		
		char ch01 = 'A';
		char ch02 = '\u0041';
		char ch03 = '\0';
		char ch04 = ' ';
		
		int intVar01 = ch01;
		int intVar02 = ch02;
		int intVar03 = ch03;
		int intVar04 = ch04;
		
		System.out.println("문자 "+ch01 +"의 유니코드 :" + intVar01);
		System.out.println("문자 "+ch02 +"의 유니코드 :" + intVar02);
		System.out.println("문자 "+ch03 +"의 유니코드 :" + intVar03);
		System.out.println("문자 "+ch04 +"의 유니코드 :" + intVar04);
		
		System.out.println("문자 "+ (char)('A'+1) + "의 유니코드 :" + ('A'+1));
		
		String str01 = "참";
		String str02 = "거짓";
		boolean b01 = true;
		boolean b02 = false;
		
		System.out.println(str01 + " : " + b01);
		System.out.println(str02 + " : " + b02);
		
	}

}
