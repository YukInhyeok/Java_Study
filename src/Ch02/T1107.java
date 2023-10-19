/*
 * ���� ��Ʈ���� ����� ���� Ŭ���̾�Ʈ ���α׷�
 	1. InputStream ��ü�� ������ InputStreamReader ��ü�� ����� �ִ�.
 		InputStreamReader reader = new InputStreamReader(in);
 
 	2. OutputStream ��ü�� ������ PrintWriter ��ü�� ���� �� �ִ�.
 		PrintWriter writer = new PrintWriter(out);
 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class T1107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9002);
			socket = serverSocket.accept();
			
			// ����� ��Ʈ�� ����
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			// Ŭ���̾�Ʈ�� ���� �޽����� �ϰſ� ȭ�鿡 �����
			String str = reader.readLine();
			System.out.println(str);
			
			// Ŭ���̾�Ʈ�� �޼����� ����
			writer.println("Hello, Client");
			writer.flush();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
				serverSocket.close();
			}catch(Exception ignored) {
				
			}
		}
	}

}
