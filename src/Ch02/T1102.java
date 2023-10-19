/*
 	java.net ��Ű���� Ŭ���� ���
 
 		Ŭ���� �̸�                                        ����
 =======================================================================================================
 	Authenticator				��Ʈ��ũ ����κ��� ������ ��� ����� �˰� �ִ� ��ü
 	ContentHandler				�߻� Ŭ�����μ� URL Connection���κ��� ��ü�� �д� ��� Ŭ������ ����Ŭ����
 	DatagramPacket				�����ͱ׷� ��Ŷ�� ��Ÿ����.
 	DatagramSocket				�����ͱ׷� ��Ŷ�� �ۼ����ϴ� ��Ĺ�� ��Ÿ����.
 	DatagramSocketImpl			�߻� Ŭ�����μ� �����ͱ׷��� ��� ��Ĺ ������ ��� Ŭ����
 	HttpURLConnection			HTTP Ư¡���� ����  URLConnection�� ��Ÿ����
 	InetAddress					IP �ּҸ� ��Ÿ����.
 	JarURLConnection			�ڹ� ��ī�̺� ����(JAR)�� ��Ÿ����.
 	MulticastSocket				IP ��� ��Ŷ�� �ۼ����ϴµ� �����ϴ�.
 	NetPermission				�پ��� ��Ʈ��ũ ������ ���� Ŭ����
 	PasswordAuthentication		Authenticator�� ���Ͽ� ���̴� ������ Ȧ��
 	ServerSocket				���� ������ ��Ÿ����.
 	Socket						Ŭ���̾�Ʈ ������ �����Ѵ�.
 	SocketImpl					������ �����ϴ� ��� Ŭ������ ���� ����Ŭ����
 	SocketPermiision			������ ���� ��Ʈ��ũ ������ ��Ÿ����.
 	URL							���� ���̵� ���� �����ϴ� �ڿ��� ���� ��������  URL �� ��Ÿ����.
 	URLClassloader				JAR ���ϰ� ���丮�� �����ϴ�  URL  Ž�� ��ηκ��� Ŭ������ �ڿ��� �ε��ϴµ� ���δ�.
 	URLConnection				���ø����̼ǰ� URL ������ ��� ���θ� ��Ÿ���� ��� Ŭ������ ���� Ŭ����
 	URLDecoder					MIME ������ ���ڿ��� �ٲ��ִ� �޼ҵ带 �����Ѵ�.
 	URLEncoder					String��  MIME�������� ��ȯ�ϴ� �޼ҵ带 �����Ѵ�.
 	URLStreamHandler			��Ʈ�� �������� ó���� ���� ��� Ŭ������ ���۴�����	
 
  
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class T1102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br;
		String url = null;
		InetAddress[] addresses;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������Ʈ �ּҸ� �Է��ϼ���-> ");
		
		try {
			url = br.readLine();
			addresses = InetAddress.getAllByName(url);
			for(int i=0; i<addresses.length; i++) {
				System.out.println(addresses[i]);
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
