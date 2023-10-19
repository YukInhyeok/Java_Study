
public class Ex705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
    다차원 배열
    
    2.1 배열 선언 1 - 배열 선언 후 선언된 배열에 값을 삽입하는 경우
 		- 배열타입  배열변수명[][];
 		  ex) int day[][]; // 2차원 배열 선언
 		  	  day[0][0] = 1;// 선언된 배열에 값을 입력
 		  	  	
 		-  배열타입[][]  배열변수명;  => 배열 선언 디폴트
 		  ex) double[][]  month;  // 2차원 배열 선언
 		  	  month[0][1] = 4;  // 선언된 배열에 값을 입력
 		  	  
 		-  배열타입[] 배열변수명[];
 		  ex) String[] year[]; // 2차원 배열 선언 
 		  	  year[1][3] = "2021";
 		  	  
 		- 배열객체 => int[][] day; // 1차원 배열 선언, 디폴트 배열선언 방법
 					day = new int[2][1];
 					
 					=> int[][] day = new int[2][1];
 					
 					=> double[][] month = new double[3][4];
 					=> String[][] year = new String[2][3]; 
 					
 		
 	2.2 배열 선언 2 - 배열을 선언하는 동시에 값을 삽입하는 경우
 	
 	    - 배열타입  배열변수명[];
 		  ex) int day[][] = {{1,2},{3,4},{5,6}};
 		    
 		      결과 : 1  2
 		            3  4
 		            5  6 		      
 		  	
 		-  배열타입[]  배열변수명;  => 배열 선언 디폴트 타입
 		  ex) double[][]  month = {{1.1, 2,3},{3.4, 7,3}};
 		  
 		      결과 : 1.1  2.3
 		            3.4  7.3
 		  
 		-  배열타입[]  배열변수명[];
 		  ex) String[] year[] = {{"국어", "영어", "수학"}, {"컴퓨터", "프로그램", "자바"}};
 		  	  
 		  	  결과 : 국어  영어  수학
 		  	        컴퓨터  프로그램  자바
 		  	  
 		  	  
 		- 배열객체 => int[][] day;  // 배열 선언
 		 			day = new int[2][2];	// 배열 객체 생성
 		 			day[0][0] = 1;
 		 			day[0][1] = 2;
 		 			day[1][0] = 3;
 		 			day[1][1] = 4;
 		 			
 		 			결과 :  1  2
 		 			       3  4
 		 			
 		 			
 		 			int[][] day;     // 배열 객체 초기화
 		 			day = new int[][] {{1, 2}{3, 4}};    
 		 			
 		 			결과 :  1  2
 		 			       3  4    
 */
		
		int[][] day;
		day = new int[2][2];
		
		day[0][0] = 1;
		day[0][1] = 2;
		day[1][0] = 3;
		day[1][1] = 4;
		
		for(int i=0; i< day.length; i++) {
			for(int j=0; j<day[i].length; j++ ) {
				System.out.print("\t" + day[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int value1[] : day) {
			for(int value2 : value1) {
				System.out.print("\t" + value2);
			}
			System.out.println();
		}
		
		
	}

}
