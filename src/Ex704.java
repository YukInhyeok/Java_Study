
public class Ex704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  배열 복사
  => 자바의 System 클래스는 배열을 쉽게 복사할 수 있는 메소드 arraycopy() 메소드를 제공
  
  public static void arraycopy(Object src,		// 복사할 원본 배열
  								int srcPos, 	// 복사할 src의 시작 첨자 위치
  								Object dest,	// 복사될 대상 배열
  								int dest, 		// 복사될 dest의 시작 첨자 위치
  								int leng		// 복사할 원소의 수
  								
  	
  		src		1, 2, 3, 4, 5, 6 ....
  		
  		dest	11, 12, 13, 14, 15, 16 ....
  		
  		System.arraycopy(src, 2, dest, 3, 3);
  		
  		결과 : dest	11, 12, 13, 3, 4, 5, 17, 18, 19
  		
  	2. 배열 원소를 출력하기 위해 사용된 for
  	
  	  int[] copyForm = {1,2,3,4,5,6,7};
  	  
  	  for(int i = 0; i < copyForm.length; i++){
  	  		System.out.print(copyForm[i]);
  	  }
  	  
  	  => 결과 : 1 2 3 4 5 6 7
  	  
  3. 배열 원소 출력을 위한 for each 
  
  	int[] coyTo = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
  	
  	for(int value : copyTo ){
  		System.out.print(value + "\t");
  	}
 */
		
		int[] copyFrom = {1, 2, 3, 4, 5, 6, 7};
		int[] copyTo = {10, 20, 30, 40, 50, 60, 70, 80};
		
		System.arraycopy(copyFrom, 4, copyTo, 1, 3);
		
		System.out.println("copyFrom 배열 : ");
		for(int i = 0; i < copyFrom.length; i++) {
			System.out.print("\t" + copyFrom[i]);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("copyTo 배열 : ");
		for(int value : copyTo) {
			System.out.print("\t" + value);
		}
	}

}
