package chat;
/*
 * ä���� ���� ������ �������� MsgSender�� MsgReceiver�� ���
 - Ŭ���� ChatServer : 1:1 ä���� ���� ������ �����ڿ��� ServerSocket()�� ����
 - �޼��� communicate() : Ŭ���̾�Ʈ�� ������ ��ٸ��� ������ �̷������ ������ �����ϰ� ������ ����ϸ�
   						Ŭ���̾���� �޽��� �ۼ����� ���� ������ MsgSender�� MsgRecevier �����ϰ� �����Ѵ�.
 - Ŭ���̾�Ʈ���� �޼����� �������鹮���� �� �� [Enter] Ű�� ������.
 - �ݴ�� Ŭ���̾�Ʈ�κ��� �޽����� ������ ǥ����¿� [Ŭ���̾�Ʈ] "�޼��� ����" �������� ǥ��
 */
// 1�ܰ� : Ŭ���� import
import java.io.*;
import java.net.*;

public class ChatServer {
	
	//2�ܰ� : ������ Ŭ������ ����
	int port = 7070;
	ServerSocket server;
	Socket socket;
	
	//3�ܰ� : ChatServer�� ������ ����
	public ChatServer(int port){
		this.port = port;
		System.out.println(">>> ������ �����մϴ�.");
		// 4�ܰ�: try-catch() ����
		try {
			//5�ܰ� : ServerSocket ��ü ����
			
			server = new ServerSocket(port);
			
		}catch(IOException e) {
			//System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
	public void communicate() {
		// 6 �ܰ� : ��⹮�� ���
		System.out.println(">>> Ŭ���̾�Ʈ�� �����ϱ⸦ ��ٸ��� �ֽ��ϴ�.");
		
		// 7�ܰ� : try-catch() ����
		try {
			//8�ܰ� : Ŭ���̾�Ʈ ���� ������ ����ϸ鼭 Ŭ���̾�Ʈ�� ������ ��û�ϸ� ��û�� �޾Ƶ��δ�.
			socket = server.accept();
			
			//9�ܰ� : �ּҿ� ��Ʈ�� ��Ÿ���� printInfo() �޼ҵ� ����
			printInfo();
			
			//10�ܰ� : ���� ���Ͽ� �Է°� ����� ���� sender�� receiver ����
			MsgSender sender = new MsgSender("����", socket);
			MsgReceiver receiver = new MsgReceiver("����", socket);
			
			//11�ܰ� : sender��  receiver �� �����带 ����
			receiver.start();
			sender.start();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	public void close() {
		// 12�ܰ� : try-catch() ����
		try {
			//13�ܰ� : ���� ���� ����
			socket.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printInfo() {
		System.out.println(">>> Ŭ���̾�Ʈ�� ���ӿ� �����߽��ϴ�.");
		//14�ܰ� : ���� ��Ʈ ��ȣ, Ŭ���̾�Ʈ �ּ�, Ŭ���̾�Ʈ ��Ʈ��ȣ ���
		System.out.println("	���� ��Ʈ��ȣ:"+ socket.getLocalPort());
		System.out.println("	Ŭ���̾�Ʈ �ּ�:"+socket.getInetAddress());
		System.out.println("	Ŭ���̾�Ʈ ��Ʈ��ȣ:"+socket.getPort()+ "\n");
		System.out.println(">>> Ŭ���̾�Ʈ�� ������ �޼����� ���� Enter�� ��������.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int port = 7070;
		ChatServer myServer = new ChatServer(port);
		myServer.communicate();
				
	}
}
