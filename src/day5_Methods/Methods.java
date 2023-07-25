package day5_Methods;

public class Methods {
	
	int a = 23;
	

	public static void main(String[] args) {
		
		Methods m = new Methods();
		m.method1(0, null);
		m.method3();
		System.out.println(m.method3());
		m.method2();
	
		System.out.println(m.method4("pen"));

	}
	void method1( int c, String b) {
		b = "bycicle";
		c = 4;
		System.out.println(c + b);
	}
	
	public void method2() {
		
		String name = "book";
		
	System.out.println(name);
		
	}
	
	public int method3() {
		int a = 3;
		int b = 4;
		int c = a +b;
		
		return b;
		
	}
	
	public String method4(String name) {
		
		name = "pen";
		return name ;
	}

}
