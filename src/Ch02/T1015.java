package Ch02;/*
 * �ܼ� �����
   - �ܼ� ���� : �ý����� ����ϱ� ���� Ű���带 �Է��� �ް�, ȭ������ ����ϴ� ����Ʈ���� 
 
 1. System.in �ʵ�
   : InputStream Ÿ���� �ʵ�
   : InputStream ������ ������ ��ų��
     InputStream is = System.in; 
 */



import java.io.InputStream;

public class T1015 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Ex1 : �ֿܼ��� �Է��� ��ȣ �˾ƺ���
		
		System.out.println("===== �޴� =====");
		System.out.println("1. ���� ��ȸ");
		System.out.println("2. ���� ���");
		System.out.println("3. ���� �Ա�");
		System.out.println("4. �����ϱ�");
		System.out.println("�޴��� �����ϼ��� ---> ");
		
		InputStream is = System.in;
		
		char inputChar = (char) is.read();
		
		switch(inputChar) {
		case '1':
			System.out.println("���� ��ȸ�� �����ϼ̽��ϴ�.");
			break;
		case '2':
			System.out.println("���� ����� �����ϼ̽��ϴ�.");
			break;
		case '3':
			System.out.println("���� �Ա��� �����ϼ̽��ϴ�.");
			break;
		case '4':
			System.out.println("�����ϱ⸦ �����ϼ̽��ϴ�.");
			break;	
		}
	}

}
