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
			System.out.println("병사 정보 입력하기");
			System.out.println("군번 입력 >> ");
			sgunbun = br.readLine();
			System.out.println("이름 입력 >> ");
			sname = br.readLine();			  
			System.out.println("주소 입력 >> ");
			saddress = br.readLine();			
			System.out.println("주특기 >> ");
			sspecialty = br.readLine();
			System.out.println("계급 >> ");
			sclass = br.readLine();
			System.out.println("소속 >> ");
			saffiliation = br.readLine();
			System.out.println("총기번호 >> ");
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
			
			System.out.println("성공하였습니다.");
			
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
