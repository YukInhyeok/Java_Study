import java.sql.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class T1305 {

	final static String sql ="delete from employee where name=?";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driver = "com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
		Connection con = null;
		PreparedStatement pstmt = null;		
		
		String ssabum ,sname, sjobGread, semail, stemp;
		int ndepartment;
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("삭제할 사원의 이름이 무엇인가요?");
			System.out.print("이름 입력 >> ");
			sname = br.readLine();
			
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, "root", "sm991201");
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, sname);
			
			int rowCount = pstmt.executeUpdate();
			
			if(rowCount == 1) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
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
