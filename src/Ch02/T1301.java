package Ch02;// 데이터베이스 접속 여부 프로그램
// 1단계 : java.sql.* 를 import

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class T1301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2단계 : try-catch 구문 생성
		try {
			// 3단계 : JDBC 드라이버 이름 지정
			// postgresql 드라이버 이름 : org.postgresql.Driver;
			String dirverName = "com.mysql.jdbc.Driver";
			
			// 4단계 : JDBC 드라이버 로드
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName(dirverName);
			
			// 5단계 : 접속할 정보의 URL 지정
			/*
			 	Oracle => "jdbc:oracle.thin:@localhost.1521:ORA"
			 	MS SQLServer => "jdbc:microsoft:sqlserver://localhost:1433";
			 	mSQL => "jdbc:msql://localhost:1114/DB명";
			 	MySQL => "jdbc:mysql://localhost:3306/DB명";
			 	ODBC => "jdbc:odbc:DB명";
			 	PostgresSQL => "jdbc:postgresql://localhost:4444:DB명";
			 */
			
			String dbURL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
			
			// 6단계 : 데이터베이스 연결
			Connection con = DriverManager.getConnection(dbURL, "root", "sm991201" );
			
			// 7단계 : 연결 상태 문구 출력
			System.out.println("MySLQ 데이터베이스에 성공적으로 접속했습니다.");
			
			// 명령어 구문
			
			// 8단계 : 데이터베이스 구분 종료
			con.close();
			
		}catch(Exception e) {
			System.out.println("MySQL 데이터베이스 접속에 문제가 있습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
