package Ch02;

class Hap{
	// �ʵ� ����
	public int i,j;
	
	// �޼ҵ� ����
	int hap() {
		return i+j;
	}
	
	int cha() {
		if(i>j)
		    return i-j;
		else
			return j-i;
	}
	
	int gop() {
		return i*j;
	}
	
	int div() {
		if(i>j)
		    return i/j;
		else
			return j/i;
	}
}
public class E0205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hap h = new Hap();
		
		h.i = 5;
		h.j = 7;
		
		System.out.println(h.hap());
		System.out.println(h.cha());
		System.out.println(h.gop());
		System.out.println(h.div());
	}

}
