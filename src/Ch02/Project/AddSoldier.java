package Project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddSoldier {

final static String sql="insert into soldier(gunbun, name, address, specialty, class, affiliation, gunNumber) values(?,?,?,?,?,?,?)";
	
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
			System.out.println("���� ���� �Է��ϱ�");
			System.out.println("���� �Է� >> ");
			sgunbun = br.readLine();
			System.out.println("�̸� �Է� >> ");
			sname = br.readLine();			  
			System.out.println("�ּ� �Է� >> ");
			saddress = br.readLine();			
			System.out.println("��Ư�� >> ");
			sspecialty = br.readLine();
			System.out.println("��� >> ");
			sclass = br.readLine();
			System.out.println("�Ҽ� >> ");
			saffiliation = br.readLine();
			System.out.println("�ѱ��ȣ >> ");
			sgn = br.readLine();
			ngunNumber = Integer.parseInt(sgn);
			
			
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, "root", "sm991201");
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, sgunbun);
			pstmt.setString(2, sname);
			pstmt.setString(3, saddress);
			pstmt.setString(4, sspecialty);
			pstmt.setString(5, sclass);
			pstmt.setString(6, saffiliation);
			pstmt.setInt(7, ngunNumber);
			
			int rowCount = pstmt.executeUpdate();
			
			System.out.println("�����Ͽ����ϴ�.");
			
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
