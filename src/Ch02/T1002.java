/*
1. ��Ʈ�� Ŭ�������� ���Ǵ� �ֿ� �޼ҵ� 
1-1 ����Ʈ ��Ʈ��
1-1-1 InputStream Ŭ������ �ֿ� �޼ҵ�

����Ÿ��              �޼ҵ�                        ����
=============================================================================
int				read() throws IOException	1���� ���ڸ� �а� ����
											ex) read();
int				read(char[] b)				���� ���ڵ��� 	�Ű������� �־��� ���� �迭�� �����ϰ�
 											���� ���� ���� �����մϴ�.
 											ex) read(b);
int				read(char[] b, int off, int len)  len ���� ���ڸ� �а� �Ű������� �־��� ���� �迭����
     											  b[off]����  len������ �����մϴ�.
     											  �׸��� ���� ���� ���� �����մϴ�.
     											  ex) read(b, 2, 3);
void			close()						�Է� ��Ʈ���� �ݽ��ϴ�.
int				available()					�Է� ��Ʈ������ ���� �� �ִ� ����Ʈ �� ��ȯ	

1-1-2 OutputStream Ŭ������ �ֿ� �޼ҵ�
����Ÿ��              �޼ҵ�                        ����
=============================================================================
void			write()						1 ����Ʈ(byte)�� ���
											ex) abstact void write(int one) throws IOException

void			write(byte[] b)				�Ű������� �־��� �־��� �迭 b�� ��� ����Ʈ�� ����Ѵ�.
void			write(byte[] b, int off, int len)  �Ű������� �־��� �迭 b[off]���� len�� ������
													����Ʈ�� ����Ѵ�.
													ex)  write(b, 2, 3);

void			flush()						��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ����մϴ�.
void			close()						��� ��Ʈ�� �ݰ� ���õ� ��� �ڿ��� �����մϴ�.													

1-2 ���� ��Ʈ��
1-2-1 Reader Ŭ������ �ֿ� �޼ҵ�
����Ÿ��              �޼ҵ�                        ����
=============================================================================
int				read() throws IOException	1���� ���ڸ� �а� ����
											ex) read();
int				read(char[] b)				���� ���ڵ��� 	�Ű������� �־��� ���� �迭�� �����ϰ�
 											���� ���� ���� �����մϴ�.
 											ex) read(b);
int				read(char[] b, int off, int len)  len ���� ���ڸ� �а� �Ű������� �־��� ���� �迭����
     											  b[off]����  len������ �����մϴ�.
     											  �׸��� ���� ���� ���� �����մϴ�.
     											  ex) read(b, 2, 3);		
void			mark(int readAheadLimit)	��Ʈ���� ���� ��ġ�� ǥ��
int				reset()						�Է� ��Ʈ���� ǥ�õǾ� �ִ� �κп��� �ٽ� �����Ͽ� �غ�
boolean			markSupported()				mark()�� reset()�� �������θ� ��ȯ
boolean			ready()						�Է� ��Ʈ������ ���ڸ� ���� �غ� �Ǿ��ִ��� ��ȯ
int				skip(long n)				���� n����ū �ǳʶ�
void			close()						�Է� ��Ʈ���� �ݽ��ϴ�.

1-2-2 Writer Ŭ������ �ֿ� �޼ҵ�
����Ÿ��              �޼ҵ�                        ����
=============================================================================
void			write()						1 ����Ʈ(byte)�� ���
											ex) abstact void write(int one) throws IOException

void			write(char[] b)				�Ű������� �־��� �־��� �迭 b�� ��� ����Ʈ�� ����Ѵ�.
void			write(char[] b, int off, int len)  �Ű������� �־��� �迭 b[off]���� len�� ������
													����Ʈ�� ����Ѵ�.
													ex)  write(b, 2, 3);

void			write(String str)			�Ű������� �־��� ���ڿ��� �����ϴ�.
void			write(String str, int off, int len) �Ű������� �־��� ���ڿ����� off �������� len��������
 													���ڸ� ����Ѵ�.

void			flush()						��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ����մϴ�.
void			close()						��� ��Ʈ�� �ݰ� ���õ� ��� �ڿ��� �����մϴ�.	 
 */
public class T1002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
