package Ch02;/*
 ����Ÿ��              �޼ҵ�                      							  ����
======================================================================================================================
int				read() throws IOException				1���� ���ڸ� �а� ����
														ex) read();
														
int				read(char[] b)							���� ���ڵ��� 	�Ű������� �־��� ���� �迭�� �����ϰ� ���� ���� ���� �����մϴ�.
 														ex) read(b);
 														
int				read(char[] b, int off, int len)  		len ���� ���ڸ� �а� �Ű������� �־��� ���� �迭����
     											  		b[off]����  len������ �����մϴ�.
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
 4 �ܰ� : while() �ݺ��� ���
 5 �ܰ� : test1.db�� �Է�
 6 �ܰ� : �Է� ��Ʈ�� ���� 
 */

import java.io.InputStream;
import java.io.FileInputStream;

public class T1006 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		InputStream is = new FileInputStream("D:/test1.db");
		
		while(true) {
			int data = is.read();
			if(data == -1)
				break;  // �����Ͱ� ������ ����
			System.out.println(data);
		}
		
		is.close();
	}

}
