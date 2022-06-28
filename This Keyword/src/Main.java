
public class Main {
	int a;
	int b;
	
	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static void main(String[] args) {	
		Main m = new Main();
		m.setData(4,1);	

		System.out.println(m.a);
		System.out.println(m.b);
	}

}
