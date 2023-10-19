
public class Ex615 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6. break ¹®
		
		int count = 0;
		
		for(int i = 1; i<=100; i++) {
			System.out.print("\t" + i);
			count++;
			if(count == 7) {
				break;
			}
		}
	}

}
