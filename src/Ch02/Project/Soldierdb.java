package Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class Soldierdb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			String dirverName = "com.mysql.jdbc.Driver";
			
			Class.forName(dirverName);
					
			String dbURL = "jdbc:mysql://localhost:3306/project?serverTimezone=UTC";
			
			Connection con = DriverManager.getConnection(dbURL, "root", "sm991201" );
			
			System.out.println("MySQL DB�� ���������� �����߽��ϴ�.");
			
			con.close();
			
		}catch(Exception e) {
			System.out.println("MySQL DB���ӿ� ������ �ֽ��ϴ�.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
