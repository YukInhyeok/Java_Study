/*
 
 	1. ���ϰ� ���� Ŭ���̾�Ʈ ���
       	�����������α׷� + Ŭ���̾�Ʈ�������α׷�
 	2. ���� ���ϰ� Ŭ���̾�Ʈ ����
  		: ���� ������ ���� �������α׷��� ������� ������ ��ٸ���(listen) �������θ� ���
  		: Ŭ���̾�Ʈ �������α׷������� Ŭ���̾�Ʈ ������ �̿��Ͽ� ������ ����
  		: ���� ������ Ŭ���̾�Ʈ�� �����ؿ��� Ŭ���̾�Ʈ ������ �߰��� ����� ��� Ŭ���̾�� ����ϰ� ��
  	
	3. ���۰���
		=> 1. ���� �������α׷��� ServerSocket Ŭ������ �̿��Ͽ� ���� ���� ��ü�� �����ϰ�
      			(new ServerSocket(���� port)) Ŭ���̾�Ʒ ������ �ޱ� ���� ��ٸ���.
      			���� ������ ������ �� ��Ʈ ��ȣ�� �־� �ش� ��Ʈ�� ������ ���� Ŭ���̾�Ʈ ��ٸ��� �Ѵ�.
		=> 2. Ŭ���̾�Ʈ �������α׷��� Socket Ŭ������ �׿��Ͽ� Ŭ���̾�Ʈ ���� ��ü�� �����ϰ�,
      			(new Socket(���� IP, ���� port)) ������ ������ �õ��Ѵ�. 
      			���� ��ü�� ���� �� ��, ������ ���� ������  IP �ּҿ� ��Ʈ ��ȣ�� �����Ѵ�.
		=> 3. ������ Ŭ���̾�Ʈ�κ��� ���� ��û�� ������ accept() �޼ҵ忡�� ���ӵ� Ŭ���̾�Ʈ��
				����ϵ��� ���� Ŭ���̾�Ʈ ������ ���� �����Ѵ�.
		=> 4. ������ Ŭ���̾�Ʈ ��� �������κ��� ����� ��Ʈ���� ����, �����͸� �ְ� ���� �غ��Ѵ�.
		=> 5. ������ ������ Ŭ���̾�Ʈ ���� ���ϰ� Ŭ���̾�Ʈ ������ ��ȣ ����� ä ��Ʈ���� �̿��Ͽ� ���������
     			�����͸� �ְ� �޴´�.
		=> 6. ������ Ŭ���̾�Ʈ�� ������ �� ������ accept() �޼ҵ忡�� ���� ���� Ŭ����Ʈ ������ �����Ͽ�
				Ŭ���̾�Ʈ�� ����ϵ��� �Ѵ�. ����� ������ ������ �ݴ´�.
  	
  		TCP Client							TCP Server
  											ServerSocket()
  												|
  											accept()
  						Connect				    |
  		Socket()     ------------------>        |   									    	
  			|									|
  		I/O Stream ���� 						I/O Stream ����
  			|			Request					|
  	-->	write()		------------------->    read()
  	|	    | 		    Response 				|  Request ó��
    --- read()		<-------------------	write()	
  		    |									|
  		close()    							close()
  		
* ������ �̿��� ���� Ŭ���̾�Ʈ ��� ���α׷��� �������� ����  		
  		
  		 TCP Client								TCP Server
  												listener = new ServerSocket(���� port);
  													|
  												Socket socket = listner.accept();
  											Connect |
clientSocket = new Socket(���� IP, ���� port); ----->  |   									    	
  			|										|
clientSocket.getOutputStream();					socket.getInputStream();
  			|			Request						|
  	-->	write()		------------------->   		 read()
  	|	    | 		    Response 					|  Request ó��
    --- read()		<-------------------		write()	
  		    |										|
  		    |									clientSocket.close()
  	clientSocket.close()    					socket.close()

	# Socket Ŭ������ �޼ҵ�
	Socket(String host, int port)  : host: ������ ������  IP ��ȣ, port: ������ ��Ʈ��ȣ
	Socket(InetAddress addr, int port) : addr : ������ ������  InetAddress ��ü
	void close() : ���� ������ �ݴ´�.
	InputStream() getInputStream, OutputStream getOutputStream() : InputStream, OutputStream ��ü ��ȯ
	int getPort()

	# ServerSocket Ŭ������ �޼ҵ�  		    
	ServerSocket(int port) : Ŭ���̾�Ʈ ��û�� �޾Ƶ��� ��Ʈ��ȣ�� ����  ServerSocket ���� ���� 
	Socket accept() : Ŭ���̾�Ʈ�� ��û �޾Ƶ��� ���� Socket ��ü�� �����ؼ� ��ȯ�Ѵ�.
	void close() : ���� ������ �ݴ´�.
  		    
 */
public class T1101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
