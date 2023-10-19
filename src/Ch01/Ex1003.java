class Student2{
	public String name;
	
	public Student2() {
		// 기본(디폴트) 생성자
	}
	
	public Student2(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("학생이름 : " + this.name);
	}
	
	
}
public class Ex1003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 lee = new Student2("육인혁");
		lee.print();
		
		Student2 kim = new Student2();
		kim.name ="정환재";
		kim.print();
		
	}

}
