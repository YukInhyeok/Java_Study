package Ch01;

public class Ex611 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 4. do ~ while 문
		  
		 - 형식 : 
		 
		 명령문;
		 
		 초기식;
		 
		 do{
		 	명령문;
		 	증감식;
		 }(조건식);
		 
		  명령문;
		  
		  ex)
		   	1. for문을 이용한 예
		   	for(int i =1; i<=10; i++){
		  		System.out.print("\t" + i);
		  		i++;
		  	}
		  	
		  	2. while문을 이용한 예
		  	
		  		int i = 1;
		  	
		  		while(i<=10){
		  			System.out.print("\t" + i);
		  			i++;
		  		}
		  		
		  	3. do ~ while문을 이용한 예
		  	int i = 1;
		  	
		  	do{
		  		System.out.print("\t" + i);
		  		i++;
		  	} while(i<=10)
		  	 */
		
		int i = 1;
		
		do {
			System.out.print("\t" + i);
			i++;
		}
		while(i<=10);
		
		System.out.println();
	}

}
