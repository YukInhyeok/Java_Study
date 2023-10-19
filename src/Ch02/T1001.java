package Ch02;

/*
 1. IO 패키지
   - 스트림 : 단방향으로 연속적으로 흘러가는 것 
             
   - 종류 : 바이트 스트림, 문자스트림
   
   1.1 바이트 스트림
      - 정의 : 바이트 중심의 정보 입출력을 담당하는 클래스
      - 종류 : 입력 스트림(InputStream)
      			ex) 키보드, 파일, 네트워크상의 프로그램
              출력 스트림(OutputStream)
                ex) 모니터, 파일, 네트워크상의 프로그램    
   1.2 문자 스트림
	  - 정의 : 문자 중심의 정보 입출력을 담당하는 클래스
	  - 종류 : 입력 스트림(Reader)
	  			ex) 키보드, 파일, 네트워크상의 프로그램
	          출력 스트림(Writer)     
	            ex) 모니터, 파일, 네트워크상의 프로그램 
   
   
    	출발지              프로그램                도착지
    	==============================================
    	
    1.  키보드   -------> 도착지    출발지----------> 1. 모니터
    2.  파일    입력 스트림                출력 스트림  2. 파일
    3.  프로그램                                    3. 프로그램
   
 
2. 입력/출력 스트림에서 사용되는 클래스 종류
  - 바이트 기반 스트림 : 그림, 멀티미디어 등의 바이너리 데이터를 읽고 출력할 때 사용
  - 문자 기반 스트림  : 문자 데이터를 읽고 출력할 때 사용
  
                                          Object                              <= 최상의 클래스  
  ============================================================================
        |      바이트 기반 스트림               |       문자 기반 스트림              <= 최상의 클래스의 하위 클래스 
 구분    |---------------------------------------------------------------------
        | 입력 스트림       |    출력 스트림     |  입력 스트림        | 출력 스트림
 -----------------------------------------------------------------------------
 최상위   |                |                  |                  |
 클래스   | InputStream    |   OutputStream   | Reader           | Writer
 ----------------------------------------------------------------------------
 하위 클래스  | XXXInputStream  | XXXOutputStream   | XXXReader       | XXXWriter  
 (예)       |(FileInputStream)|(FileOutputStream) |(FileReader)     | (FileWriter)  
 ============================================================================  		  
 
3. 주요 기본 스트림을 위한 클래스
 - 바이트 스트림 하위 클래스                             |    문자 스트림 하위 클래스                       처리 내용
 InputStream                 OutputStream           |     Reader            Writer            <-- 최상의 클래스     
 ===============================================================================  		  
 FileInputStream           FileOutputStream         |	 FileReader         FileWriter         <-- 파일 단위
 StringBufferInputStream   StringBufferOutputStream |    StringReader       StringWriter       <-- 문자열 입출력
 ByteArrayInputStream      ByteArrayOutputStream    |    CharArrayReader	CharArrayWriter    <-- 배열 단위 
  
4. 스트림의 입출력의 편리를 위하여 사용되는 보조 스트림
              바이트 중심                     |                  문자 중심
 =======================================================================================
 입력 스트림                 출력스트림          |       입력 스트림             출력 스트림
 ===========================================================================================  
 DataInputStream       DataOutputStream     |                                           <-- 문자 단위, 자바의 자료형으로 입출력
 BufferedInputStream   BufferedOutputStream |     BurreredReder         BufferedWriter   <-- 버퍼 단위, 입출력시 버퍼링을 사용  
 ObjectInputStream     ObjectOutputStream   |                                   		  <- 객체, 객체를 직렬화하여 입출력
                                            |     InputStreamReader     OutputSreamWriter <- 바이트를 문자로 변환, 바이트 스트림을 문자 스트림으로 연결하여 입출력 
                       PrintStream          |                           PrintWriter       <- 출력, 출력에 편리성 제공                     		  
 ------------------------------------------------------------------------------------------------------  		  
   
 */
public class T1001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
