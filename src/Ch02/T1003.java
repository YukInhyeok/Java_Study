/*
 ����Ÿ��              �޼ҵ�                      							  ����
================================================================================================================
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

//1 �ܰ� : ���� Ŭ������ import �Ѵ�.
import java.io.*;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class T1003 {

	public static void main(String[] args) throws Exception {  // 2�ܰ� : throws Exception �߰�
		// TODO Auto-generated method stub

		// 3 �ܰ� : ��ü ����
		OutputStream os = new FileOutputStream("D:/test1.db");
		
		// 4 �ܰ� : ������ �ʱ�ȭ
		byte a = 10;
		byte b = 20;
		byte c = 30;
		byte d = 40;
		
		// 5�ܰ� : test1.db�� ���
		os.write(a);
		os.write(b);
		os.write(c);
		os.write(d);
		
		// 6 �ܰ� : ��� ���ۿ� �ִ� ������ ��� ���
		os.flush();
		
		//7 �ܰ� : ��� ��Ʈ�� ���� 
		os.close();
		
	}

}
