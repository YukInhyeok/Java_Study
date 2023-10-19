package Ch02;/*
 ����Ÿ��              �޼ҵ�                      							  ����
==================================================================================================================================
int				read() throws IOException				1���� ���ڸ� �а� ����
														ex) read();
														
int				read(char[] b)							���� ���ڵ��� 	�Ű������� �־��� ���� �迭�� �����ϰ� ���� ���� ���� �����մϴ�.
 														ex) read(b);
 														
int				read(char[] b, int off, int len) 		len ���� ���ڸ� �а� �Ű������� �־��� ���� �迭���� b[off]����  len������ �����մϴ�.
     											  		�׸��� ���� ���� ���� �����մϴ�.
     											  		ex) read(b, 2, 3);
     											  		
void			close()									�Է� ��Ʈ���� �ݽ��ϴ�.
int				available()								�Է� ��Ʈ������ ���� �� �ִ� ����Ʈ �� ��ȯ	
 */	

/*
 ���α׷� �ۼ� �ܰ�
 1 �ܰ� : ���� Ŭ������ import �Ѵ�.
 2 �ܰ� : throws Exception �߰� 
 3 �ܰ� : ��ü ����
 4 �ܰ� : ����Ʈ �迭 ����
 5 �ܰ� : while() �ݺ��� ���
 6 �ܰ� : test1.db�� �Է�
 7 �ܰ� : �Է� ��Ʈ�� ���� 
 */

import java.io.InputStream;
import java.io.FileInputStream;

public class T1008 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		InputStream is = new FileInputStream("D:/test3.db");
		
		byte[] buffer = new byte[10];
		
		int readByteNum = is.read(buffer, 1, 7);
		
		if(readByteNum != -1) {
			for(int i=0;i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}

}
