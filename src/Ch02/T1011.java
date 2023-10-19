/* Writer Ŭ������ �ֿ� �޼ҵ�
����Ÿ��              �޼ҵ�                      							  ����
=============================================================================================================================
void			write()									1 ����Ʈ(byte)�� ���
														ex) abstact void write(int one) throws IOException

void			write(char[] b)							�Ű������� �־��� �־��� �迭 b�� ��� ����Ʈ�� ����Ѵ�.
void			write(char[] b, int off, int len)  		�Ű������� �־��� �迭 b[off]���� len�� ������ ����Ʈ�� ����Ѵ�.
														ex)  write(b, 2, 3);

void			write(String str)						�Ű������� �־��� ���ڿ��� �����ϴ�.
void			write(String str, int off, int len) 	�Ű������� �־��� ���ڿ����� off �������� len��������	���ڸ� ����Ѵ�.

void			flush()									��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ����մϴ�.
void			close()									��� ��Ʈ�� �ݰ� ���õ� ��� �ڿ��� �����մϴ�.	 
 */

/*
 ���α׷� �ۼ� �ܰ�
 1 �ܰ� : ���� Ŭ������ import �Ѵ�.
 2 �ܰ� : throws Exception �߰� 
 3 �ܰ� : ��ü ����
 4 �ܰ� : �迭 ����
 5 �ܰ� : test5.txt�� ���
 6 �ܰ� : ��� ���ۿ� �ִ� ������ ��� ���
 7 �ܰ� : ��� ��Ʈ�� ���� 
 */

import java.io.Writer;
import java.io.FileWriter;

public class T1011 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Writer writer = new FileWriter("D:/test6.txt");
		// FileWriter writer = new FileWriter("D:/test6.txt");
		
		char[] array= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
		
		writer.write(array, 1, 5);  //'B', 'C', 'D', 'E', 'F'
		
		writer.flush();
		writer.close();
		
	}

}
