package Ch02;/*
 ����Ÿ��              �޼ҵ�                   							     ����
==================================================================================================================
void			write()									1 ����Ʈ(byte)�� ���
														ex) abstact void write(int one) throws IOException

void			write(byte[] b)							�Ű������� �־��� �־��� �迭 b�� ��� ����Ʈ�� ����Ѵ�.
void			write(byte[] b, int off, int len)  		�Ű������� �־��� �迭 b[off]���� len�� ������	����Ʈ�� ����Ѵ�.
														ex)  write(b, 2, 3);

void			flush()									��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ����մϴ�.
void			close()									��� ��Ʈ�� �ݰ� ���õ� ��� �ڿ��� �����մϴ�.	
 */

/*
 ���α׷� �ۼ� �ܰ�
 1 �ܰ� : ���� Ŭ������ import �Ѵ�.
 2 �ܰ� : throws Exception �߰� 
 3 �ܰ� : ��ü ����
 4 �ܰ� : ������ �ʱ�ȭ
 5 �ܰ� : test1.db�� ���
 6 �ܰ� : ��� ���ۿ� �ִ� ������ ��� ���
 7 �ܰ� : ��� ��Ʈ�� ���� 
 */

import java.io.OutputStream;
import java.io.FileOutputStream;

public class T1005 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		OutputStream os = new FileOutputStream("D:/test3.db");
		
		byte[] array= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		os.write(array, 1, 5);
		
		os.flush();
		os.close();
		
	}

}
