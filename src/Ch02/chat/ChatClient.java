package Ch02.chat;

/*
 * ä�� Ŭ���̾�Ʈ Ŭ���� ChatClient
 - Ŭ���� ChatClient : 1:1 ä���� ���� Ŭ���̾�Ʈ�� �����ڿ��� Socket ��ü�� �����Ͽ� ������ �����ϰ� ������ ����Ѵ�.
 - �޼ҵ� communicate()���� �������� �޽��� �ۼ����� ���� ������ MsgSender��  MsgReceiver�� �����ϰ� �����Ѵ�.
 - �������� �޽����� �������� ������ �� �� [Eneter] Ű�� ������.
 - �ݴ�� �����κ��� �޽����� ������ ǥ����¿� [����] "�޽�������" �������� ǥ��
 */

// 1�ܰ� : Ŭ���� import
import java.io.*;
import java.net.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
	
	// 2�ܰ� : Ŭ���� ����
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	
	// 3�ܰ� : ChatClient ������ ����
	public ChatClient(String ip, int port) {
		// 4�ܰ� : try-catch() ����
		try {
			//5�ܰ� : ���� ���� ����
			socket = new Socket(ip, port);
			//6�ܰ� : Ŭ���̾�Ʈ ��Ʈ��ȣ, ���� �ּ�, ���� ��Ʈ�� ��µǴ� �޼��� ȣ��
			printInfo();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printInfo() {
		System.out.println(">>> ������ ���ӿ� �����߽��ϴ�.");
		//7�ܰ� : ���� ��Ʈ ��ȣ, Ŭ���̾�Ʈ �ּ�, Ŭ���̾�Ʈ ��Ʈ��ȣ ���
		System.out.println("	Ŭ���̾�Ʈ ��Ʈ��ȣ:"+ socket.getLocalPort());
		System.out.println("	���� �ּ�:"+socket.getInetAddress());
		System.out.println("	���� ��Ʈ��ȣ:"+socket.getPort()+ "\n");
		System.out.println(">>> ������ ������ �޼����� ���� Enter�� ��������.");
	}
	
	public void communicate() {
		//8�ܰ� : Ŭ���̾�Ʈ ���Ͽ� �Է°� ����� ����  sender�� receiver�� ����
		Ch02.chat.MsgSender sender = new Ch02.chat.MsgSender("Ŭ���̾�Ʈ: ", socket);
		Ch02.chat.MsgReceiver receiver = new Ch02.chat.MsgReceiver("Ŭ���̾�Ʈ: ", socket);
		//9�ܰ� :sender�� receiver�� ����
		sender.start();
		receiver.start();
	}
	
	public void close() {
		// 10�ܰ� : try-catch() ����
		try {
			//11�ܰ� : Ŭ���̾�Ʈ ���� ����
			socket.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12�ܰ� : ���� �ּҿ� ��Ʈ��ȣ�� �����Ͽ� ������ ����
		ChatClient client = new ChatClient("127.0.0.1", 7070);
		//13�ܰ� : ������ ���
		client.communicate();
		
	}

}
