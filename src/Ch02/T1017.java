/*
  2. System.out 필드
   : OutputStream 타입의 필드 
   : OutputStream 변수로 참조를 시킬때
     OutputStream os = System.out; 
 */


import java.io.OutputStream;

public class T1017 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Ex3. 연속된 숫자, 영어, 한글 출력
		
		OutputStream os = System.out;
		
		for(byte b=48;b<58;b++) {
			os.write(b);
			System.out.print("\t");
		}
		
		os.write(13); // 캐리지 리턴(13)을 출력하면 다음행으로 넘어간다.
		
		
		for(byte b=97;b<123;b++) {
			os.write(b);			
		}
		
		os.write(13); // 캐리지 리턴(13)을 출력하면 다음행으로 넘어간다.
		
		String hangul="가나다라마바사아자차카타파하";
		
		byte[] hangulBytes = hangul.getBytes();
		
		os.write(hangulBytes);
		
		os.flush();
		os.close();
		
	}

}
