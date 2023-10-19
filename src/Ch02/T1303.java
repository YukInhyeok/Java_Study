package Ch02;// 사원의 모든 정보 출력 프로그램

import java.sql.*;

public class T1303 {
	
	final static String sql = "select * from employee";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null; 
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "root", "sm991201");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("번호 \t 사번 \t 이름 \t 직책 \t 부서 \t 이메일");
			System.out.println("======================================================");
			while(rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print("\t");
				System.out.print(rs.getInt(2));
				System.out.print("\t");
				System.out.print(rs.getString(3));
				System.out.print("\t");
				System.out.print(rs.getString(4));
				System.out.print("\t");
				System.out.print(rs.getInt(5));
				System.out.print("\t");
				System.out.print(rs.getString(6));
				//System.out.print("\n");
				System.out.println();
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
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
