package chat;

/*
 * ������ ���� Ŭ���� MsgReceiver 
 - Ŭ���� MsgReceiver : �޼��� ������ �����ϴ� �������̴�.
 - �����ڿ��� ���� ������ �Է� ��Ʈ�����κ��� �޽��� �޾� �̸� �״�� ǥ������� ����Ѵ�.
 - ��µǴ� ���� : [�޽����� ������ ����] "�޽��� ����"
 */

// 1�ܰ� : Ŭ���� import

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

// 2�ܰ� :  Thread ���
public class MsgReceiver extends Thread{

//3�ܰ� : ���� �� Ŭ���� ����
	String nickname;
	Socket socket;
	BufferedReader in;
	
//4�ܰ� : MesReceiver ������ ����
	public MsgReceiver(String nickname, Socket socket) {
		this.nickname = nickname;
		this.socket = socket;
		// 5�ܰ� : try-catch() ���� ����
		try {
			//6�ܰ� : ���Ͽ� �Է� ��Ʈ���� ����
			in = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
		}catch(IOException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void run() {
	
		//7�ܰ� : while() ���� ���� ���� �޽����� ���� ���� �ݺ�
		while(in != null) {
			//8�ܰ� : �������κ��� ���� �޼����� ȭ�� ���	
			try {
				System.out.println(in.readLine());
			}catch(IOException e) {
				System.out.println(e.toString());
			}
		}
		
		
		
	}
	
	
}
