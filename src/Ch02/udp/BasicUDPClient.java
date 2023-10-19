package Ch02.udp;

import java.net.*;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BasicUDPClient {
	
	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress server;
	int port = 8888;
	
	public BasicUDPClient(String ip, int port) {
		try {
			// DatagramPacket�� ��  IP �ּҰ� Inetaddress ���¿��� ��
			server = InetAddress.getByName(ip);
			this.port = port;
			this.dsock = new DatagramSocket();
			System.out.println(">>> UDP ������ �����մϴ�.");
			System.out.println(">>> ������ ������ �޽����� ���� Enter�� ��������.");
			System.out.println(">>> �����Ϸ��� quit�� ���� Enter�� ��������" + "\n");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void communicate() {
		try {
			// Ű����κ��� �������� ������ ���ڿ��� �Է¹ޱ� ���� BufferedReader ���·� ��ȯ
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			String strOut = null;
			while((strOut = br.readLine()) != null) {
				// DatagramPacket�� �Է� ���� �����ϰ� ������ ����
				sPack = new DatagramPacket(
						strOut.getBytes(), strOut.getBytes().length, server, port);
				dsock.send(sPack);
				// ������ quit�� �����ϸ� ����
				if(strOut.trim().equals("quit")) {
					break;
				}
				// �����κ��� ���ŵǴ� DtagramPacket�� �޾� ���
				byte[] buffer = new byte[1024];
				rPack = new DatagramPacket(buffer, buffer.length);
				dsock.receive(rPack);
				String strIn = new String(rPack.getData(), 0, rPack.getData().length);
				System.out.println("[����" + server + ":" + port + "]" + ":" + strIn);
			}
			System.out.println("UDP Ŭ���̾�Ʈ�� �����մϴ�.");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicUDPClient client = new BasicUDPClient("127.0.0.1", 7777);
		client.communicate();
	}

}
