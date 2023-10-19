
public class E0303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
    * 오버로딩
    1. 정의
      -> 클래스내에서 이미 존재하는 메소드와 이름이 같더라도 매개변수의 개수나 매개변수의 타입을 다른게하여 중복하여
      메소드를 정의할 수 있다. 
    2. 종류
      - 생성자 오버로딩
       -> 형식
       
        public class 클래스명{
          클래스명(){
            // 디폴트 생성자
          }
          
          클래스명(타입 매개변수,...){
          }
          
          클래스명(타입 매개변수,...){
          }
        }
        
        ex)
        
        public class Car{
            public String model;
            public String color;
            public int speed;
            
            Car(){
              // 디폴트 생성자
            }
            
            Car(String model){
              ......
            }
            
            Car(String model, String color){
              .......
            }
            
            Car(String model, String color, int speed){
               ....... 
            }
        
        }
        
        Car c = new Car();
        Car c1 = new Car(현대);
        Car c2 = new Car(현대, 검정색);
        Car c3 = new Car(기아, 하얀색, 100);
        
   
      - 메서드 오버로딩
       -> 형식
       
       public class 클래스명{
          접근지정자  반환타입  메소드명(){
          }
          
          접근지정자  반환타입  메소드명(자료타입  매개변수,....){
              ......
          }
          
          접근지정자  반환타입  메소드명(자료타입  매개변수,....){
              ......
          }
       }  
       
      ex) class Car{
           public String model;
           public String color;
           public int speed;
           
           public void speedAdd(){
              System.out.println(speed);
           }
           
           public int speedAdd(int s1){
                 speed = speed + s1;
                 // speed += s1;
           }
           
           public int speedAdd(int s1, int s2){
                 speed = speed + s1 + s2;
                 // speed = s1 + s2;
                 //speed = speed + s1; speed = speed + s2; 
           }
           
           public double speedAdd(double s1, double s2){
                 speed = s1+s2;
                 // speed = speed +s1; speed = speed + s2;
           }
           
           public int speedAdd(double s1, double s2){
                 speed = (int)s1+ (int)s2;
                 // speed = speed + (int)s1; speed = speed + (int)s2;
           }
           
      }  
   
   3. 조건
   - 메소드의 이름은 같되 매개변수의 개수나 타입은 반드시 달라야 한다. 
   - 메소드의 이름, 매개변수의 개수와 타입이 동일하고 리턴 타입(int, float, double)만 달라서는 오버로딩이 
     성립되지는 않는다. 
     
     ex)
     
     // 메소드 오버로딩이 성립되지 않는 경우
     int max(int a, int b){
        .....
     } 
     
     double max(int a, int b){
        .....
     }

     
     // 메소드 오버로딩이 성립되는 경우
     int max(int a, int b){
        .....
     } 
     
     double max(double a, double b){
        .....
     } 
     
        
 */
	}

}
