import java.io.Console;

public class T1018 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 아이디와 패스워드를 콘솔로부터 읽는다.
		
		Console console = System.console();
		
		System.out.print("아이디 : ");
		String id = console.readLine();
		
		
		System.out.print("패스워드 : ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		
		System.out.println("=============================");
		System.out.println(id);
		System.out.println(strPassword);
	}

}
