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
import java.net.*;

public class T1106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try {
			// ���� ���α׷��� �ִ� IP �ּҿ� ������ ���� ���� ��Ʈ ��ȣ�� ���� ��ü�� ����
			socket = new Socket("127.0.0.1", 9001);
			// ���� ��ü ������ ���ÿ� �����ʿ� ������ ��û�ϰ� ��
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			// ������ "Hello, Server"
			String str = "Hello, Server";
			out.write(str.getBytes());
			// ������ ���� �޼����� �о���
			byte arr[] = new byte[100];
			in.read(arr);
			// ȭ�鿡 ���
			System.out.println(new String(arr));
			
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
