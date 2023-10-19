package Ch02;

public class E0203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 1. 객체지향프로그램 단계
 - 1단계 : 객체 모델링 단계
 - 2단계 : 클래스화 단계
 - 3단계 : 객체 생성과 사용
 
 2. 객체 생성과 사용
 - 클래스 : 객체의 설계도, 틀, 거푸집, 템플릿
 - 객체지향 프로그래밍에서는 클래스로 인스턴스(실체, 객체)를 생성한다.
 
   클래스이름  대행자이름         =    new 클래스이름();
            --------              --------------- 
         참조변수, 레퍼런스 변수       인스턴스를 생성한다. 객체를 생성한다.
                                  인스턴스, 객체 인스턴스
                                  new 연산자에 의해서 생성되는 객체 
 
 	ex)  class Car{
 			int speed;
 			
 			int speedUp(){
 			   speed += 5;
 			}
 			
 			int speedDown(){
 			   speed -= 5;
 			}
 			
 			Car(){
 			   // 디폴트 생성자
 			}
 			
 			Car(int s){ <= 일반 생성자
 			    speed=s;
 			}
 			
 	      }
 	      
 	     //Car  c  =  new  Car();
 	     Car  c  =  new  Car(10);
 	     
 	     c.speed = 10;
 	     
 	     System.out.println(c.speed);  // 10
 
 		 c.speedUp(); // 10->15
 		 System.out.println(c.speed);  // 15
 		 
 		 c.speedDown(); // 15->10
 		 System.out.println(c.speed);  // 10
 
 		 // c.close() <= 객체 종료	
 
 3. 생성자
  - 객체 생성 시 필드에 초기화 역할 담당자
  - 생성자 방법 : 반환타입 X, 매개변수 있음(디폴트 생성자, 일반 생성자)
  - 형식
    * 디폴트 생성자
     클래스이름(){
     }
     
     ex)
     Car(){
     }
     
     Car c = new Car();
     
    * 일반 생성자
      클래스이름(매개변수1...){
        필드명1 = 매개변수1;
      }
      ex)
      Car(int s){
        speed = s;
      }  
 
 	  Car c = new Car(10);	
 
 4. Setter/Getter
  - Getter
  
    접근지정자  자료타입  get함수명(){
       return speed;
    }
    
    ex)  public int getSpeed(){
             return speed;
    }   
   
  - Setter
  
    접근지정자 자료타입(void)  set함수명(int sp){
    	  speed	= sp;
    }  
  
  
    ex1)  public void  setSpeed(int sp){
                speed = sp;
    }
    
    
    ex2)  public void  setSpeed(int speed){
                this.speed = speed;
    }
 
 
 
 */
	}

}
