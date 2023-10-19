package socket;

// 1�ܰ� : Ŭ���� import
import java.io.*;
import java.net.*;

public class BasicServerSocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2�ܰ� : try-catch ���� ����
		try {
			//3�ܰ� : ���� ���� ���� ���, ���� ���� ����
			System.out.println(">>> ������ �����մϴ�.");
			ServerSocket myServerSocket = new ServerSocket(7070);
			
			//4�ܰ� : Ŭ���̾�Ʈ�� �����ϱ⸦ ��ٸ���.
			System.out.println(">>> Ŭ���̾�Ʈ�� �����ϱ� ��ٸ��� �ֽ��ϴ�.");
			Socket mySocket = myServerSocket.accept();
			
			//5�ܰ� : Ŭ���̾�Ʈ�� �����ϸ� ��Ʈ�� �����ϱ� ���� �ڵ�
			System.out.println(">>> Ŭ���̾�Ʈ�� ���ӿ� �����߽��ϴ�.");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(mySocket.getInputStream()));  
			PrintWriter out = new PrintWriter(
					new OutputStreamWriter(mySocket.getOutputStream()));
			
			//6�ܰ� : Ŭ���̾�Ʈ �������κ��� ���� �޼����� ȭ�鿡 ���
			System.out.println("[Ŭ���̾�Ʈ] : " + in.readLine());
			
			//7�ܰ� : Ŭ���̾�Ʈ���� ������ ���ڿ��� ����
			String msg="������ �����Ͻ� ���� ȯ���մϴ�.";
			
			//8�ܰ� : Ŭ���̾�Ʈ�� ������ ���ڿ� ����
			out.println(msg);
			
			//9�ܰ� : ���ڿ� ������ ������ �ٷ� ó�����ּ���.
			out.flush();
			
			//10�ܰ� : Ŭ���̾�Ʈ�� �����ϴ� ������ ���� �ֿܼ� ���
			System.out.println("[����] : " + msg);
			
			//11�ܰ� : ������ �����Ѵ�.
			mySocket.close();
			
			
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
	}

}
