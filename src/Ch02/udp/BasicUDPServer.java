package udp;

/*
 * UDP ����� ���� ���� ����
 - ���ŵ� DatagramPacket���� �޼ҵ� getAddress()��  getPort()�� �̿��ϸ� �� ��Ŷ�� ������ �ּҿ� ��Ʈ���θ� �˼� �ִ�.
 - �ڷḦ ������ Ŭ���̾�Ʈ���� �ڷḦ �����Ϸ���, �ּҿ� ��Ʈ��ȣ�� ����Ͽ� �ٽ�  DatagraPacket�� �����Ͽ� DatagraPacket�� �޼ҵ� send()�� �۽��Ѵ�. 
   
 */

import java.net.*;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BasicUDPServer {
	DatagramSocket dsock;
	DatagramPacket sPack, rPack;
	InetAddress client;
	int sport= 7777, cport;
	
	public BasicUDPServer(int sport) {
		try {
			// DatagramPacket�� sport�� �����Ͽ� ����
			this.sport = sport;
			System.out.println(">>> ������ �����մϴ�.");
			System.out.println(">>> Ŭ���̾�Ʈ�� �����ϱ� ��ٸ��� �ֽ��ϴ�.");
			this.dsock = new DatagramSocket(sport);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void communicate(){
		try {
			// Ű����κ��� ������ ���ڿ��� �Է¹ޱ� ���� BufferedReader ���� ��ȯ
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			while(true) {
				byte[] buffer = new byte[1024];
				
				// Ŭ���̾�Ʈ���� ���۵Ǵ� DatagramPacket�� �ޱ� ���� rPacket ������ �� ���
				rPack = new DatagramPacket(buffer, buffer.length);
				dsock.receive(rPack);
				
				// ���۹��� ����� ���ڿ� ��ȯ
				// String(byte[] bytes, int offset, int length);
				String strIn = new String(rPack.getData(), 0, rPack.getData().length);
				
				// Ŭ���̾�Ʈ�� �ּҿ� ��Ʈ��ȣ�� ��ȯ
				client = rPack.getAddress();
				cport = rPack.getPort();
				
				// ���۹��� ����� ����ϰ� quit�̸� ����
				
				System.out.println("[Ŭ���̾�Ʈ" + client + ":" + cport + "]" + ":" + strIn);
				if(strIn.trim().equals("quit")) {
					break;
				}
				
				// ǥ���Է����� �Էµ� ������ DatagramPacket���� ����� Ŭ���̾�Ʈ�� ����
				String strOut = br.readLine();
				sPack = new DatagramPacket(strOut.getBytes(), strOut.getBytes().length, client, cport);
			  	dsock.send(sPack);
			}
			System.out.println("UDP ������ �����մϴ�.");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicUDPServer client = new BasicUDPServer(7777);
		client.communicate();
	}

}

