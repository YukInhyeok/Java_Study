package Ch01;

public class Ex602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 2. for 문
		 - 형식 
		 	
		 	명령문;
		 	for(초기문; 조건식; 반복 후 작업){
		 	//	초기식; 조건식; 증감식
		 	 	명령문;
		 	}
		 	명령문;
		 	
		 - 초기문
		 	: 대개 for 문의 조건식에서 사용하는 변수를 초기화
		 	ex) int i = 1;
		 	
		 	: 특징
		 	1. 초기문은 시작할 때 한 번만 수행된다.
		 	2. 콤마(,)로 분리하여 여러 문장을 나열할 수 있다.
		 	 ex) for(int i, int j, ...; i < 10; i++, j++)
		 	3. 초기문을 빈 상태로 두어도 된다.
		 	 ex) int i=1; 
		 	 	 for(;i<10;i++)
		 	 	 또는
		 	 	 int i;
		 	 	 for(i=1;i<10;i++)
		 	 	 또는
		 	 	 for(int i=1; i<10; i++)
		 	 	 
		 	 - 조건문
		 	 : 논리형 변수나 논리 연산자만 사용할 수 있다.
		 	 : 조건식의 결과가 true인 경우 반복이 계속되로 false인 경우 반복 종료
		 	  ex) for(int i=1; true; i++) // 무한루프
		 	  	  for(int i=1; ; i++) // 무한루프
		 	  	  for(int i=1; i<10; i++)
		 	  	  
		 	  - 반복 후 작업
		 	  : for(int i=1; i<10; i++){ // 증감식
		 	  		System.out.println(i);
		 	  }
		 	  
		 	  => for(int i=1; i<10; i++, System.out.println(i)){
		 	  
		 	   }
		 	   
		 */
		
		for(int i=1; i<=10; i++) {
			System.out.print("\t"+i);
		}
	}

}
