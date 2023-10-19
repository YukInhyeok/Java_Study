/*
 Reader Ŭ������ �ֿ� �޼ҵ�
����Ÿ��              �޼ҵ�                       								 ����
============================================================================================================================
int				read() throws IOException					1���� ���ڸ� �а� ����
															ex) read();
															
int				read(char[] b)								���� ���ڵ��� 	�Ű������� �־��� ���� �迭�� �����ϰ�
 															���� ���� ���� �����մϴ�.
 															ex) read(b);
 															
int				read(char[] b, int off, int len)  			len ���� ���ڸ� �а� �Ű������� �־��� ���� �迭���� b[off]���� len������ �����մϴ�. 
															�׸��� ���� ���� ���� �����մϴ�.
     											  			ex) read(b, 2, 3);		
     											  			
void			mark(int readAheadLimit)					��Ʈ���� ���� ��ġ�� ǥ��
int				reset()										�Է� ��Ʈ���� ǥ�õǾ� �ִ� �κп��� �ٽ� �����Ͽ� �غ�
boolean			markSupported()								mark()�� reset()�� �������θ� ��ȯ
boolean			ready()										�Է� ��Ʈ������ ���ڸ� ���� �غ� �Ǿ��ִ��� ��ȯ
int				skip(long n)								���� n����ū �ǳʶ�
void			close()										�Է� ��Ʈ���� �ݽ��ϴ�. 
 */
/*
 ���α׷� �ۼ� �ܰ�
 1 �ܰ� : ���� Ŭ������ import �Ѵ�.
 2 �ܰ� : throws Exception �߰� 
 3 �ܰ� : ��ü ����
 4 �ܰ� : while() �ݺ��� ���
 5 �ܰ� : test4.txt�� �Է�
 6 �ܰ� : �Է� ��Ʈ�� ���� 
 */

import java.io.Reader;
import java.io.FileReader;

public class T1012 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Reader reader = new FileReader("D:/test4.txt");
		
		System.out.println("�ƽ�Ű �ڵ尪 \t ���� ���ڰ�");
		
		while(true) {
			int data = reader.read();
			if(data == -1)
				break;
			System.out.print(data+"\t\t\t");  // �ƽ�Ű �ڵ尪
			System.out.println((char)data);  // ������ ���� ��
		}
		
		reader.close();
	}

}
