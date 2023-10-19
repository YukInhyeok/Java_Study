/*
 * ����Ʈ ��Ʈ���� ����� ���� Ŭ���̾�Ʈ ���α׷�
 	1. �������� ������ �����
 		- ServerSocket ��ü�� �����Ѵ�.
 		ServerSocket serverSocket = new ServerSocket(9000);
 	
 	- ServerSocket ��ü�� ����  accept() �޼ҵ带 ȣ����
 		Socketsocket = serverSockeet.accept();
 
 	- ���� ������ ����ϰ� �� �Ŀ��� �ݾƾ� �Ѵ�.
 		serverSocket.close()
 
 	2. Ŭ���̾�Ʈ ���� ������ �����
 		- Socket ��ü�� �����Ѵ�.
 			Socket socket = new Socket("127.0.0.1", 9000);
 
 	- ������ �ۼ��ſ� ����� �Է� ��Ʈ�� ��ü�� ��� ��Ʈ�� ��ü�� ��´�.
 		InputStrem in = socket.getInputStream();
 		OutputStream out = socket.getOutputStream();
 
 	- write �޼ҵ�� read �޼ҵ带 ȣ���Ͽ� ������ �۽� �Ǵ� �����Ѵ�.
 
 		out.write(data);
 		int data = in.read();
 
 	- Ŭ���̾�Ʈ ���� �ݴ´�.
 		socket.close();
 
 */

import java.io.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.net.ServerSocket;
import java.net.Socket;

public class T1105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			// ���� ������ ������
			serverSocket = new ServerSocket(9001);
			// Ŭ���̾�Ʈ ������ ��ٸ�
			socket = serverSocket.accept();
			// ����� ��Ʈ�� ����
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			//Ŭ���̾�Ʈ�� ���� �޽����� �о��
			byte arr[] = new byte[100];
			in.read(arr);
			// ȭ�鿡 ���
			System.out.println(new String(arr));
			// ������ "Hello, Client" ���
			String str = "Hello, Client";
			out.write(str.getBytes());
			
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
