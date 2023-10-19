import java.net.*;
import java.io.*;

public class T1104 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			URL java = new URL("https://www.google.com/");
			BufferedReader in = new BufferedReader(new InputStreamReader(java.openStream()));
			String inLine;
			while((inLine = in.readLine()) != null) {
				System.out.println(inLine);
			}
			in.close();
		}catch(MalformedURLException e) {
			System.out.println(e);
		}
	}

}
