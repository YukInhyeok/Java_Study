package Ch02;

public class T1302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  JDBC : 자바 프로그램과 관계형 데이터 원보에 대한 인터페이스로서 관계형 데이터베이스에 접근한는 방법과
  		SQL 명령들을 수행할 수 있게 해주는 방법들을 제공하는 라이브러리
  		
  		java application
  		
  		JDBC
  		
  		DB2  Oracle MySql MSSql Sybase
  		
  JDBC 드라이버 타입
  1. JDBC-ODBC 브리지
  	 : JDBC에 들어온 모든 명령을 ODBC(Open Database Connectivity)형으로 변환하여 ODBC
  	 	드라이버로 전달해 준다.
  2. 네이티브-API 부분적인 자바 드라이버
  	 : 로컬에 설치된 원시 라이브러리를 이용해 데이터베이스와 연결
  	 : 원시 라이브러리는 거의 C로 작성이 되어 있다.
  	 : JDBC에 들오언 데이터베이스 명령을 각각의  DBMS 시스템에 호출에 맞춰서 변환한 후, 그 명령을 전달
  	 : DBMS와 연결되는 부분은 C/C++와 같은 네이티브 코드로 작성되어 있음
  	 : 자바로 랩핑해서 JDBC 드라이버로 구현 
  3. JDBC-NET 순수 자바 드라이버
  	 : 원시 라이브러리의 호출이 로컬에서 이루지는 것이 아니라 원격 서버에서 이루어진다.
  	 : JDBC 드라이버를 통해서 데이터베이스 명령을 호출하면 JDBC 드라이버는 그 명령을 변경하지 않고 그대로 데이터베이스
  	   접근 미들웨어로 전송하고, 미들웨에서는 해당 데이터베이스에 적합한 명령어로 변환
  4. 네이티브-프로토콜 순수 자바 드라이버  		
  	 : 순수 자바로 만들어졌음
  	 : ODBC 나 원시 라이브러리를 이용하지 않고 곧바로 데이터베이스에 연결되어지는 장점
  	 : 순수하게 자바로 구현되기 때문에 네트워크를 통해 각각의   DBMS로 직접 요청 전송
  	 
  	 	
   자바와 데이터베이스 연동
   
    	JDBC  프로그래밍 단계                         사용 클래스
    	==============================================================
1.    	JDBC 드라이버 로드			 System.setProperty()
    							 Class.forName()
    				
2.    	데이터베이스 연결			java.sql.Connection
    				
3.		Statement 생성			java.sqlStatement
								java.sql.prepareStatement
    										 
4.		SQL문 전송				java.sql.Statement - executeQuery()
												   - executeUpdate()
  	 	
5.		결과받기					java.sql.ResultSet
  	 				
6.		연결 해제					java.sql.Connection - close()
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
  	 	
 */
	}

}
