package Ch02;

public class T1201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	1. TCP ���� ���α׷���
 	1-1 ���� ���ϰ� ����
 	- ���� ����(���� ���) : ����Ǿ� Ŭ���̾�Ʈ�� ���� ��û�� ��ٸ��ٰ� ��û�� ������ Ŭ���̾�p�� ����� ���Ͽ� ������ �����ϴ� ������ ����
 	- ����(����/Ŭ���̾�Ʈ) : ����/Ŭ���̾�Ʈ ����, �������� ����� �ϱ� ���ؼ� ���� ��û�� ����
 
 	1-2 ���� ���α׷��� ���� = ����ϱ� ���� ����
 
 					����								Ŭ���̾�Ʈ
	1�ܰ�: ServerSocket  myServerSocket = new ServerSocket(7070);

	2�ܰ� :				Socket mySocket = new Socket("127.0.0.1", 7070);
									<---------->
	3�ܰ� : Socket mySocket = myServerSocket.accept()

	4�ܰ� : mySocket.getOutputStream()   ------->  mySocket.getInputStream();
			mySocket.getInputStream()	<-------  mySocket.getOutputStream();	
 				  
* �ܰ� ����
	1�ܰ� : [����] ��Ʈ��ȣ�� �̿��ؼ� ServerSocket�� ���� Ŭ���̾�Ʈ�� ��û�� ��ٸ���. 				  

	2�ܰ� : [Ŭ���̾�Ʈ] ������ �ּ�(127.0.0.1)�� ��Ʈ��ȣ(7070)�� �̿��ؼ� Socket�� ���� ������ �����Ѵ�.  

	3�ܰ� : [����] Ŭ���̾�Ʈ�� ��û�� �޾� �鿩 ������ Socket�� �����Ѵ�.

	4�ܰ� : [����][Ŭ���̾�Ʈ] ������ Ŭ���̾�Ʈ���� ����� Socket ���� �ڷḦ ��ȯ�� �� �ֵ��� �Է½�Ʈ���� ��½�Ʈ���� �����Ͽ� ���� ����Ѵ�.


	1-3 ������ Ŭ���̾�Ʈ�� ���� ���α׷��� ���
******Ŭ���� ServerSockete, Socket

 					����								Ŭ���̾�Ʈ
 				
	>> ������ �����մϴ�.
	ServerSocket myServerSocket  = new ServerSocket(7070);
	>> Ŭ���̾�Ʈ�� �����ϱ� ��ٸ��� �ֽ��ϴ�.

									>> ������ �����ϱ� ���ؼ� ������ �����Ѵ�
									Socket mySocket  =  new  Socket("127.0.0.1", 7070);
									>> ���� ������ �����߽��ϴ�. 
						<------------
	Socket mySocket = myServerSocket.accept();
	>> Ŭ���̾�Ʈ�� ���ӿ� �����߽��ϴ�.

							*������ Ŭ���̾�Ʈ�� ����*
			*������ Ŭ���̾�Ʈ���� ������ �ۼ����ϱ� ���� Ŭ���̾�Ʈ ���Ͽ� ��Ʈ���� ����*
			BufferedReader in = new BufferedReader(
						new InputStreamReader(mySocket.getInputStream()));			   	
			PrintWriter out = new PrintWriter(
						new OutputStreamWriter(mySocket.getOutputStream()));

							*�ۼ����ϱ� ���� �޽����� ����*	
								String msg = "�ȳ��ϼ���? Ŭ���̾�Ʈ�Դϴ�.";
								out.println(msg);
					<----------------------
System.out.println("[Ŭ���̾�Ʈ]" + in.readLine());		
[Ŭ���̾�Ʈ] �ȳ��ϼ���? Ŭ���̾�Ʈ�Դϴ�.		

String msg = "������ �����ϽŰ��� ȯ���մϴ�.";
out.println(msg);
[����] ������ �����ϽŰ��� ȯ���մϴ�.
					----------------------->
								System.out.println("[����]" + in.readLine());
								[����] ������ �����ϽŰ��� ȯ���մϴ�.
									
















 */
	}

}
