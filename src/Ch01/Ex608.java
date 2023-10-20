package Ch01;

public class Ex608 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  3. while 문
		  
		  - 형식
		  
		  	for(초기식; 조건식; 증감식) {
		  		명령문;
		  	}
		  	
		  	초기식;
		  	while(조건식){
		  		 명령문;
		  		 증감식;
		  	}
		  	
		  	for(int i = 1; i<=10; i++){
		  		  System.out.print("\t" + i);
		  	}
		  	
		  	int i = 1;
		  	
		  	while(i<=10){
		  		System.out.print("\t" + i);
		  		i++;
		 */
		System.out.println("for문을 이용한 예");
		for(int i = 1; i<=10; i++){
	  		  System.out.print("\t" + i);
	  	}
		
		System.out.println();
		System.out.println();
		
		System.out.println("while문을 이용한 예");
		
		int i = 1;
		
		while(i<=10) {
			System.out.print("\t" + i);
			i++;
		}
		
	}

}
