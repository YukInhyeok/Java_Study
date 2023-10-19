package Ch02.Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Soldier {

	final static String sql = "select * from soldier";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null; 
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "root", "sm991201");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("��ȣ \t ���� \t\t �̸� \t �ּ� \t\t\t ��Ư�� \t ��� \t �Ҽ� \t �ѱ��ȣ ");
			System.out.println("==========================================================================================");
			while(rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print("\t");
				System.out.print(rs.getString(2));
				System.out.print("\t");
				System.out.print(rs.getString(3));
				System.out.print("\t");
				System.out.print(rs.getString(4));
				System.out.print("\t\t");
				System.out.print(rs.getString(5));
				System.out.print("\t ");
				System.out.print(rs.getString(6));
				System.out.print("\t ");
				System.out.print(rs.getString(7));
				System.out.print("\t ");
				System.out.print(rs.getInt(8));
				System.out.print("\t");
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
