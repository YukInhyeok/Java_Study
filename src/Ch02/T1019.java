import java.io.FileInputStream;
import java.io.FileOutputStream;

public class T1019 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	String originFileName ="D:/spongebob.png";		
	String targeFileName ="D:/spongebob2.png";
	
	FileInputStream fis = new FileInputStream(originFileName);
	FileOutputStream fos = new FileOutputStream(targeFileName);
	
	int readByteNo;
	
	byte[] readBytes = new byte[1000];
	
	while((readByteNo = fis.read(readBytes)) != -1) {
		fos.write(readBytes, 0, readByteNo);
	}
	
	fos.flush();
	fos.close();
	fis.close();
	
	System.out.println("복사가 잘 되었습니다.^o^~");
		
	}

}
