
public class Ex614 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 5. continue 문
		  		  
		  for(초기문; 조건식; 증감식, 반복 후 작업){
		  	......
		  	......
		  	continue;
		  	......
		  }
		  
		  초기문
		  while(조건식){
		  	......
		  	......
		  	증감식;
		  	continue;
		  	......
		  }
		  
		  초기문;
		  do {
		  	......
		  	......
		  	증감식;
		  	continue;
		  	......
		  }while(조건식)
		 
		 */
		
		// 1부터 100까지의 짝수의 합
		
		int sum = 0;
		
		for(int i = 1; i <=100; i++) {
			if(i%2 == 1) {
				continue;
			}
			else {
				sum += i;
			}
		}
		
		System.out.println("1부터 100까지 짝수의 합 = " + sum);
		
		// 1부터 100까지 홀수의 합
		
		int sum1 = 0;
		
		for(int i = 1; i <=100; i++) {
			if(i%2 == 0) {
				continue;
			}
			else {
				sum1 += i;
			}
		}
		
		System.out.println("1부터 100까지 홀수의 합 = " + sum1);
	}

}
