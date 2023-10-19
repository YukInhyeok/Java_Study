package Ch02.chat;
/*
 * �۽��� ���� Ŭ���� MsgSender
 -Ŭ���� MsgSender : �޽��� �۽��� �����ϴ� ������
 -ǥ���Է����� �޽����� �޾� ����(����,Ŭ���̾�Ʈ)�� �տ� �ٿ� ���濡�� �۽��Ѵ�.
 -�۽ŵǴ� ���� : [�޽����� ������ ����] "�޽��� ����"
 -�ݺ� while() ���ο��� ǥ���Է� �߻��� ������ ���� s.nextLine();�� ���ؼ� ��� �޽����� �۽��ϵ��� �Ѵ�.
 */

// 1 �ܰ�
import java.io.*;
import java.net.*;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MsgSender extends Thread{
	//2�ܰ� : ���Ǵ� Ŭ������ ���� ����
	String nickname;
	Socket socket;
	PrintWriter out;
	
	//3�ܰ� : MsgSender �����ڸ� ����
	public MsgSender(String nickname, Socket socket) {
		this.nickname = nickname;
		this.socket = socket;
		//4�ܰ� : try-catch() ���� ����
		try {
			//5�ܰ�: ���Ͽ� ��� ��Ʈ���� ����
			out = new PrintWriter(
					new OutputStreamWriter(socket.getOutputStream()));
		}catch(IOException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void run() {
		//6�ܰ�: ǥ���Է�
		Scanner s = new Scanner(System.in);
		//7�ܰ�: while()���� ���� �ݺ�
		while(out != null) {
			//8�ܰ�: �۽��Ϸ��� �ϴ� ���ڿ��� ����
			String msg = s.nextLine();
			//9�ܰ� : ������ ����� ������� �տ� �ٿ� ����
			out.println(nickname+msg);
			//10�ܰ� : flush() �޼ҵ带 ���� �ٷ� ó���ϰ� �� ������ش�.
			out.flush();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
