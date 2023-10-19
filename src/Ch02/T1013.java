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
 4 �ܰ� : �迭 ����
 5 �ܰ� : while() �ݺ��� ���
 6 �ܰ� : test5.txt�� �Է�
 7 �ܰ� : �Է� ��Ʈ�� ���� 
 */

import java.io.Reader;
import java.io.FileReader;

public class T1013 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Reader is = new FileReader("D:/test5.txt");
		
		char[] buffer = new char[100];
		
		while(true) {
			int readCharNum = is.read(buffer);
			if(readCharNum == -1)
				break;
			for(int i=0; i<readCharNum; i++) {
			//for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}

}
