package Ch01;

public class Ex701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  1. 배열
   동일한 자료형을 정해진 수만큼 저장 처리한 후 처리하는 객체
   배열 항목 : 원소
     - 원소는 0으로 시작하는 수의 첨자에 의한 참조
     ex) x[0], x[1]
     - 배열 크기가 n이면 첨자는 0부터 n-1까지 유효
     - 배열 크기를 알아보기 위한 방법 : 배열명.length
       ex) array.length, x.length
       
  2. 배열 객체를 참조하는 배열 변수 선언
  	 * 변수 선언
  	   - 변수를 선언하고 선언된 변수에 값을 입력
  	     ex) int i;
  	     	 i = 0;
  	   - 변수를 선언하는 동시에 값을 입력 => 변수 초기화
  	     ex) int i = 0;
  	     
	2.1 배열 선언 1 - 배열 선언 후 선언된 배열에 값을 삽입하는 경우
		- 배열타입 배열변수명[];
		  ex) int day[]; //  1차원 배열 선언
		      day[0] = 1; // 선언된 배열에 값을 입력
		- 배열 타입[]	배열 변수명;  => 배열 선언 디폴트
		  ex) double[]	month; // 1차원 배열 선언
		  	  month[0] = 4; // 선언된 배열에 값을 입력
		- 배열 타입	[]배열변수명;
		  ex) String [] year; // 1차원 배열 선언
		  	  year[0] = "2021";
		- 배열 객체 => int[] day;  // 1차원 배열 선언, 디폴트 배열선언 방법
			  		 day[0] = new int[4];
			  		 
			  		 => int [] day = new int[4];
			  		 
			  		 => double[] month = new double[12];
			  		 => String[] year = new String[3];
			  		 
			비교문장 => Scanner input = new Scanner(System.in);
	
	
	
	2.2 배열 선언 2 - 배열을 선언하는 동시에 값을 삽입하는 경우
	
		- 배열타입 배열변수명[];
		  ex) int day[] = {1,2,3,4,5,6,7,8};
		  
		  	  * int day[8] 처럼 사용하면 오류가 발생합니다.
		  	  
		  	  System.out.println(day.length);
		  	  
		- 배열 타입[]	배열 변수명;  => 배열 선언 디폴트
		  ex) double[]	month = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0,11.0,12.0}; 
		  	  
			  System.out.println(month.length);
			  System.out.println(month[2]);
			  
		- 배열 타입	[]배열변수명;
		  ex) String [] year = {"국어", "영어", "수학"};
		  	  
		- 배열 객체 => int[] day;  // 1차원 배열 선언, 디폴트 배열선언 방법
			  		day = new int[3];	// 배열 객체 생성
			  		day[0] = 1;
			  		day[1] = 2;
			  		day[2] = 3;
			  		
			  		int[] day;		//배열 객체 초기화
			  		day = new int[] {1,2,3};
 */
		// * 배열을 선언하고 선언된 배열에 값을 삽입 유형
		// 배열 선언
		
		int[] x; // int x[]; or	int []x;
		double[] y; //double y[]; or double []y;
		
		// 배열 생성
		
		x = new int[4];
		y = new double[3];
		
		// 배열 크기 확인
		
		System.out.println("x 배열의 크기 : " + x.length);
		System.out.println("y 배열의 크기 : " + y.length);
		
		System.out.println();
		
		// * 배열을 선언하는 동시에 값을 삽입 유형
		char[] ch = new char[6];
		String[] str = new String[4];
		
		//배열 크기 확인
		System.out.println("ch 배열의 크기 : " + ch.length);
		System.out.println("str 배열의 크기 : " + str.length);
		
	}

}
