// ��� ���� �߰� ���α׷�

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class T1304 {

	final static String sql="insert into employee(sabum, name, jobGread, department, email) values(?,?,?,?,?)";
	
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
			System.out.println("��� ���� �Է��ϱ�");
			System.out.println("��� �Է� >> ");
			ssabum = br.readLine();
			System.out.println("�̸� �Է� >> ");
			sname = br.readLine();			  
			System.out.println("��å�Է� >> ");
			sjobGread = br.readLine();			
			System.out.println("�μ���ȣ �Է�(10,20,30,...) >> ");
			stemp = br.readLine();
			ndepartment = Integer.parseInt(stemp);
			System.out.println("�̸��� �Է� >> ");
			semail = br.readLine();
			
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, "root", "sm991201");
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, ssabum);
			pstmt.setString(2, sname);
			pstmt.setString(3, sjobGread);
			pstmt.setInt(4, ndepartment);
			pstmt.setString(5, semail);
			
			int rowCount = pstmt.executeUpdate();
			
			System.out.println(rowCount);
			
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
