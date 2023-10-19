import java.util.Scanner;

public class Ex612 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0이 입력되기 전까지 입력받은 정수의 합 구하기
		
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		int total = 0;
		
		System.out.println("0이 입력되기 전까지 입력받은 정수의 합 구하기");
		
		do {
			total += a;
			System.out.print("누적할 정수 데이터를 입력하세요. >> ");
		}while((a = input.nextInt()) != 0);
		
		System.out.println("Total = " + total);
	}

}
