package Ch02;

import java.io.InputStream;

public class T1016 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// Ex2. �ֿܼ��� �Է��� �ѱ� �˾Ƴ���
		
		InputStream is = System.in;
		
		byte[] data = new byte[100];
		
		System.out.print("�̸� : ");
		int nameBytes = is.read(data);
		
		String name = new String(data, 0, nameBytes-2);
		
		/*
		���� 2����Ʈ�� EnterŰ�� �ش��ϴ� ĳ���� ����(13)�� ���� �ǵ�(10)
		�̹Ƿ� ���ڿ����� ���ܽ�Ŵ
		*/
		
		System.out.print("�ϰ� ���� �� : ");
		int commentBytes = is.read(data);
		String comment = new String(data, 0, commentBytes-2);
		
        /*
           ���� 2����Ʈ�� EnterŰ�� �ش��ϴ� ĳ���� ����(13)�� ���� �ǵ�(10)
           �̹Ƿ� ���ڿ����� ���ܽ�Ŵ
         */
        
		System.out.println("�Է��� �̸� : " + name);
		System.out.println("�Է��� �ϰ� ���� �� : " + comment);
		
	}

}
