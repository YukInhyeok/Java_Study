/*
  2. System.out �ʵ�
   : OutputStream Ÿ���� �ʵ� 
   : OutputStream ������ ������ ��ų��
     OutputStream os = System.out; 
 */


import java.io.OutputStream;

public class T1017 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Ex3. ���ӵ� ����, ����, �ѱ� ���
		
		OutputStream os = System.out;
		
		for(byte b=48;b<58;b++) {
			os.write(b);
			System.out.print("\t");
		}
		
		os.write(13); // ĳ���� ����(13)�� ����ϸ� ���������� �Ѿ��.
		
		
		for(byte b=97;b<123;b++) {
			os.write(b);			
		}
		
		os.write(13); // ĳ���� ����(13)�� ����ϸ� ���������� �Ѿ��.
		
		String hangul="�����ٶ󸶹ٻ������īŸ����";
		
		byte[] hangulBytes = hangul.getBytes();
		
		os.write(hangulBytes);
		
		os.flush();
		os.close();
		
	}

}
