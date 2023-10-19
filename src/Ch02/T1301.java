package Ch02;// �����ͺ��̽� ���� ���� ���α׷�
// 1�ܰ� : java.sql.* �� import

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class T1301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2�ܰ� : try-catch ���� ����
		try {
			// 3�ܰ� : JDBC ����̹� �̸� ����
			// postgresql ����̹� �̸� : org.postgresql.Driver;
			String dirverName = "com.mysql.jdbc.Driver";
			
			// 4�ܰ� : JDBC ����̹� �ε�
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName(dirverName);
			
			// 5�ܰ� : ������ ������ URL ����
			/*
			 	Oracle => "jdbc:oracle.thin:@localhost.1521:ORA"
			 	MS SQLServer => "jdbc:microsoft:sqlserver://localhost:1433";
			 	mSQL => "jdbc:msql://localhost:1114/DB��";
			 	MySQL => "jdbc:mysql://localhost:3306/DB��";
			 	ODBC => "jdbc:odbc:DB��";
			 	PostgresSQL => "jdbc:postgresql://localhost:4444:DB��";
			 */
			
			String dbURL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
			
			// 6�ܰ� : �����ͺ��̽� ����
			Connection con = DriverManager.getConnection(dbURL, "root", "sm991201" );
			
			// 7�ܰ� : ���� ���� ���� ���
			System.out.println("MySLQ �����ͺ��̽��� ���������� �����߽��ϴ�.");
			
			// ��ɾ� ����
			
			// 8�ܰ� : �����ͺ��̽� ���� ����
			con.close();
			
		}catch(Exception e) {
			System.out.println("MySQL �����ͺ��̽� ���ӿ� ������ �ֽ��ϴ�.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
