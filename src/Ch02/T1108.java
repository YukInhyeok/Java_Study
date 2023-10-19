package Ch02;/*
 * ���� ��Ʈ���� ����� ���� Ŭ���̾�Ʈ ���α׷�
 	1. InputStream ��ü�� ������ InputStreamReader ��ü�� ����� �ִ�.
 		InputStreamReader reader = new InputStreamReader(in);
 
 	2. OutputStream ��ü�� ������ PrintWriter ��ü�� ���� �� �ִ�.
 		PrintWriter writer = new PrintWriter(out);
 
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class T1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1", 9002);
			
			// ����� ��Ʈ���� ������
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			// ������ �޼��� ����
			
			writer.println("Hello, Server");
			writer.flush();
			
			// �������� ���� �޽��� �о�� ȭ�鿡 ���
			String str = reader.readLine();
			System.out.println(str);
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
			}catch(Exception e) {
				
			}
		}
	}

}
