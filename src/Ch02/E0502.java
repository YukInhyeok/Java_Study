package Ch02;/*상속구현
 
  상위 클래스 : Vehicle 클래스
  
  class  Vehicle{
     // 필드
      * 필드1 : name 이름
      * 필드2 : maxspeed 최대속도
      * 필드3 : seater 정원
     // 생성자
      * 디폴트 생성자
      * 일반 생성자(최대속도)
      * 일반 생성자(최대속도, 정원)
     // 메소드
      * printInfo()
  }
  
  
  하위 클래스 : Motor 클래스
      // 필드
       * 필드1 : name 이름
       * 필드2 : displacement 배기량
      // 생성자
       * 디폴트 생성자
      * 일반 생성자(최대속도)
      * 일반 생성자(최대속도, 정원)
      // 메소드
       * printTotal()
  
 */

class Vehicle{
	public String name ="차량";  // 이름
	public double maxSpeed;     // 최대속도
	public int seater;          // 정원
	
	public void printInfo() {
		System.out.print("name: " + name);
		System.out.print(" , 최대속도: " + maxSpeed);
		System.out.println(" , 정원: " + seater);
	}
}

class Motor extends Vehicle{
	public String name ="자동차";  // 이름
	public int displacement;      // 배기량
	
	public void printTotal() {
		//System.out.print("name: " + name);
		System.out.print("name: " + this.name);
		System.out.print(" , 최대속도: " + maxSpeed);
		System.out.print(" , 정원: " + seater);		
		System.out.println(" , 배기량: " + displacement);
	}
}


public class E0502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor myCar = new Motor();
		myCar.maxSpeed = 160;
		myCar.seater = 5;
		myCar.displacement = 1500;
		myCar.printInfo();
		System.out.println("--------------------------");
		myCar.printTotal();
	}

}
