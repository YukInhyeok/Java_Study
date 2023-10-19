package Test1;

import java.util.Date;

public class Account {
	public String name;  // �̸�
	protected Date open; // ��¥
	/*package*/ int number;  // ���¹�ȣ
	private long balance;  // �ܾ�
	
	// ������(������ ��Ű��, ���� Ŭ�������� ��� ����)
	protected Account(String name, int number) {
		this.name = name;
		this.number = number;
		this.open = new Date();
		// Date open = new Date();
	}
	
	//�Ϲݸ޼ҵ�
	// �Ա� �޼ҵ�
	
	public long deposit(long amount) {
		return balance += amount;
	}
	
	// ��� �޼ҵ�
	public long withdraw(long amount) {
		return balance -= amount;
	}
	
	// �̸�, �������� �� �ܾ� ��� �޼ҵ�()
	public long checkBalance() {
		System.out.println("�̸� : " + name + ", ���¹�ȣ : " + number + ", �ܾ� : " + balance);
		return balance;
	}
}
