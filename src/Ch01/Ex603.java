
public class Ex603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지의 합을 출력
		
		int sum = 0;
		/*
		for(int i=1; i<=100; i++) {
			//sum = sum + i;
			sum += i;			
		}
		*/
		/*
		int i=1;
		for(;i<=100; i++) {
			sum += i;
		}
		*/
		
		/*
		int i;
		for(i=1; i<=100; i++) {
			sum+= i;
		}
		*/
		
		for(int i=1; i<=100; sum += i, i++) {
			
		}
		System.out.println("1부터 100까지의 합 : "+ sum);
	}

}
