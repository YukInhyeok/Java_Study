package Ch02;

class Student2{
	public String name;
	
	public Student2() {
		// �⺻(����Ʈ) ������
	}
	
	public Student2(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("�л��̸� : " + this.name);
	}
	
	
}
public class E0404 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 lee = new Student2("�̽���");
		lee.print();
		
		Student2 kim = new Student2();
		kim.name ="��ٺ�";
		kim.print();
		
	}

}
