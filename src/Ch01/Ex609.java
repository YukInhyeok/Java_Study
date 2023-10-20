package Ch01;

public class Ex609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while문을 이용한 1부터 100까지 합을 출력 프로그램
		
		int sum = 0;
		
		int i=1;
		
		while(i<=100) {
			//sum = sum+1;
			sum += i;
			i++;
		}
		
		System.out.println("1부터 100까지의 합 : " + sum);
	}

}
