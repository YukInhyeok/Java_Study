package socket;

// 1�ܰ� : Ŭ���� import

import java.io.*;
import java.net.*;

public class BasicClientSocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2�ܰ� : try-catch ������ ����
		try {
			//3�ܰ� : ���� �ּҿ� ��Ʈ��ȣ�� �����Ͽ� ������ ����
			Socket mySocket = new Socket("127.0.0.1", 7070);
			System.out.println(">>> ���� ���ӿ� �����߽��ϴ�.");
			
			//4�ܰ� : ���� ���Ͽ� ��Ʈ���� ����
			BufferedReader in = new BufferedReader(
					new InputStreamReader(mySocket.getInputStream()));  
			PrintWriter out = new PrintWriter(
					new OutputStreamWriter(mySocket.getOutputStream()));
			
			//5�ܰ� : ���� ���Ͽ� �޽��� ����
			
			String msg="�ȳ��ϼ���? Ŭ���̾�Ʈ�Դϴ�.";
			
			//6�ܰ� : Ŭ���̾�Ʈ�� ������ ���ڿ� ����
			out.println(msg);
			
			//7�ܰ� : ���ڿ� ������ ������ �ٷ� ó�����ּ���.
			out.flush();
			
			//8�ܰ� : Ŭ���̾�Ʈ�� ������ �޽����� ���
			System.out.println("[Ŭ���̾�Ʈ] : "+msg);
			
			//9�ܰ� : ���� �������� ���� ���� �޼����� ȭ�鿡 ���
			System.out.println("[����] : "+in.readLine());
			
			//10�ܰ� : ���� ���� ����
			mySocket.close();
			
			
			
			
			
			
			
			
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
	}

}
