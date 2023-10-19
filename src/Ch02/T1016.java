package Ch02;

import java.io.InputStream;

public class T1016 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// Ex2. 콘솔에서 입력한 한글 알아내기
		
		InputStream is = System.in;
		
		byte[] data = new byte[100];
		
		System.out.print("이름 : ");
		int nameBytes = is.read(data);
		
		String name = new String(data, 0, nameBytes-2);
		
		/*
		끝에 2바이트는 Enter키에 해당하는 캐리지 리턴(13)과 라인 피드(10)
		이므로 문자열에서 제외시킴
		*/
		
		System.out.print("하고 싶은 말 : ");
		int commentBytes = is.read(data);
		String comment = new String(data, 0, commentBytes-2);
		
        /*
           끝에 2바이트는 Enter키에 해당하는 캐리지 리턴(13)과 라인 피드(10)
           이므로 문자열에서 제외시킴
         */
        
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 하고 싶은 말 : " + comment);
		
	}

}
