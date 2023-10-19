package Ch02;// 학생을 위한 클래스의 생성자 구현과 객체 생성

class Student{
	String name;
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("학생이름 : " + this.name);
	}
	
}


public class E0403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 	2. 생성자
 	- 정의 : 객체가 생성될 때 필요한 작업을 수행하는 특별한 메소드
 	
 		ex) Student stu = new Student("홍길동");
 	
 			class Student{
 				String name;
 				
 				public Student(){
 					
 				}
 				
 				public Student(String name){
 					this.name = name;
 				}
 				
 				public void setName(String name){
 						this.name = name;
 				}
 				
 				public String getName(){
 					return this.name;
 					}
 				
 			}
 	
 */
		
		Student stu = new Student("홍길동");
		
		stu.print();
		
		System.out.println("학생이름 : " + stu.getName());
		
		stu.setName("유관순");
		
		System.out.println("학생이름 : " + stu.getName());
		
	}

}
