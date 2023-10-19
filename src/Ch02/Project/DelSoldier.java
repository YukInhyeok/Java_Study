package Ch02.Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DelSoldier {

final static String sql ="delete from soldier where gunbun=?";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driver = "com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
		Connection con = null;
		PreparedStatement pstmt = null;		
		
		String sgunbun, sname, saddress, sspecialty, sclass, saffiliation, sgn;
		int ngunNumber;
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("������ ������ ������ �����ΰ���?");
			System.out.print("���� �Է� >> ");
			sgunbun = br.readLine();
			
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, "root", "sm991201");
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, sgunbun);
			
			int rowCount = pstmt.executeUpdate();
			
			if(rowCount == 1) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
