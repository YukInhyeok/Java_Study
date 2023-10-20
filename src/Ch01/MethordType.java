package Ch01;

public class MethordType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World!!!");
		
		/*
	@ 출력을 위한 메소드의 종류
	- System 클래스를 구성하는 3개의 필드
			필드					설명
		===============================================
			in			키보드로부터 입력받기 위한 필드
			out			콘솔로 출력하기 위한 필드
			err			에러 메세지를 콘솔로 출력하기 위한 필드
			
	- 출력을 위한 메소드의 종류
			메소드							설명
		================================================
			println(내용)					ln은 Line의 약자로
										이 메소드는 자동 개형을 하며 내용을 출력한다.
										ex) print("Hello\n")
											println("Hello");
			print(내용)					마지막 출력한 문자 뒤에 다음 내용을 출력하므로
										줄이 바뀌지 않는다.
			printf("형식 지정자", 내용)		형식 지정자에 맞게 내용을 출력한다.
			
			
	- 확장 문자의 종류
			확장문자				설명				
		===========================================================
			\n			[Enter] 키와 기능을 갖으며 줄을 바꾼다(new Line)
			\t			탭 키로 일정한 간격을 띄운다(horizontal tab)
			\b			백스페이스 기능으로 뒤로 한 칸 후진한다(backspace)			제어문자
			\r			동일한 줄의 맨 앞으로 커서만 옮긴다(carriage return)
			\f			출력 용지를 한 페이지 넘긴다(form feed)
			\a			경고음이 난다(alert)
		------------------------------------------------------------
			\\			\ 문자를 출력한다(back slash)		이미 예약된 의미로 사용되어서
			\'			' 문자를 출력한다(single quote)		표현하기 힘든 기호로 표현
			\"			" 문자를 출력한다(double quote)
			\0			null 문자
		 */
		
		System.out.print("학과\t: ");
		System.out.println("정보통신융합공학부");
		System.out.println("과목\t: 기초Java프로그래밍\n제출일\t: 2021년3월19일");
		System.out.printf("이름\t: %s", "홍길동");
		/*
		 	%c : 문자
		 	%s : 문자열
		 	%d : 숫자(정수)
		 	%f : 숫자(실수)
		 */
	}

}
