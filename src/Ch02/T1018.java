import java.io.Console;

public class T1018 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// ���̵�� �н����带 �ַܼκ��� �д´�.
		
		Console console = System.console();
		
		System.out.print("���̵� : ");
		String id = console.readLine();
		
		
		System.out.print("�н����� : ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		
		System.out.println("=============================");
		System.out.println(id);
		System.out.println(strPassword);
	}

}
