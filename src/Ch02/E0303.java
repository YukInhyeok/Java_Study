
public class E0303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
    * �����ε�
    1. ����
      -> Ŭ���������� �̹� �����ϴ� �޼ҵ�� �̸��� ������ �Ű������� ������ �Ű������� Ÿ���� �ٸ����Ͽ� �ߺ��Ͽ�
      �޼ҵ带 ������ �� �ִ�. 
    2. ����
      - ������ �����ε�
       -> ����
       
        public class Ŭ������{
          Ŭ������(){
            // ����Ʈ ������
          }
          
          Ŭ������(Ÿ�� �Ű�����,...){
          }
          
          Ŭ������(Ÿ�� �Ű�����,...){
          }
        }
        
        ex)
        
        public class Car{
            public String model;
            public String color;
            public int speed;
            
            Car(){
              // ����Ʈ ������
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
        Car c1 = new Car(����);
        Car c2 = new Car(����, ������);
        Car c3 = new Car(���, �Ͼ��, 100);
        
   
      - �޼��� �����ε�
       -> ����
       
       public class Ŭ������{
          ����������  ��ȯŸ��  �޼ҵ��(){
          }
          
          ����������  ��ȯŸ��  �޼ҵ��(�ڷ�Ÿ��  �Ű�����,....){
              ......
          }
          
          ����������  ��ȯŸ��  �޼ҵ��(�ڷ�Ÿ��  �Ű�����,....){
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
   
   3. ����
   - �޼ҵ��� �̸��� ���� �Ű������� ������ Ÿ���� �ݵ�� �޶�� �Ѵ�. 
   - �޼ҵ��� �̸�, �Ű������� ������ Ÿ���� �����ϰ� ���� Ÿ��(int, float, double)�� �޶󼭴� �����ε��� 
     ���������� �ʴ´�. 
     
     ex)
     
     // �޼ҵ� �����ε��� �������� �ʴ� ���
     int max(int a, int b){
        .....
     } 
     
     double max(int a, int b){
        .....
     }

     
     // �޼ҵ� �����ε��� �����Ǵ� ���
     int max(int a, int b){
        .....
     } 
     
     double max(double a, double b){
        .....
     } 
     
        
 */
	}

}
