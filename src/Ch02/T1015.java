package Ch02;/*
 * 콘솔 입출력
   - 콘솔 정의 : 시스템을 사용하기 위해 키보드를 입력을 받고, 화면으로 출력하는 소프트웨어 
 
 1. System.in 필드
   : InputStream 타입의 필드
   : InputStream 변수로 참조를 시킬때
     InputStream is = System.in; 
 */



import java.io.InputStream;

public class T1015 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Ex1 : 콘솔에서 입력한 번호 알아보기
		
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료하기");
		System.out.println("메뉴를 선택하세요 ---> ");
		
		InputStream is = System.in;
		
		char inputChar = (char) is.read();
		
		switch(inputChar) {
		case '1':
			System.out.println("예금 조회를 선택하셨습니다.");
			break;
		case '2':
			System.out.println("예금 출금을 선택하셨습니다.");
			break;
		case '3':
			System.out.println("예금 입금을 선택하셨습니다.");
			break;
		case '4':
			System.out.println("종료하기를 선택하셨습니다.");
			break;	
		}
	}

}
