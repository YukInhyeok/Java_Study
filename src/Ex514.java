
public class Ex514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  switch 문
  
  형식 : 
  
 	문장 1
 	
 	switch(정수식){
 			case 정수값1 : 
 				문장;
 				break;
 			case 정수값2 :
 				문장;
 				break;
 			case 정수값3 :
 				문장;
 				break;
 				....
 				
 			default:
 				문장 m;
 	}
 	
 	다음 문장;
 	
 	* switch~case 문 사용시 주의사항
 	1. switch 문의 시작과 긑을 알리는 {, } 기호는 절대 생략할 수 없다.
 	2. case 문 다음의 정수 값은 각각 달라야 한다.
 	3. switch 문은 정수식에서 변수나 수식이 올 수 있으나, 정수 값에는 변수나 수식이 올 수 없다.
 	   반드시 값만 기술해야 한다.
 */
		
		int time = (int)(Math.random()*4) + 8;
		
		System.out.println("현재 시간 : " + time + "시");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
				break;
			case 9:
				System.out.println("회의를 합니다.");
				break;
			case 10:
				System.out.println("업무를 봅니다.");
				break;
			default:
				System.out.println("외근을 나갑니다.");
		}
	}

}
