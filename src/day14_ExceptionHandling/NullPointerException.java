package day14_ExceptionHandling;

public class NullPointerException {
	
	public static void main(String[] args) {
		myData();
		
	}
	
	public static void myData() {
		
		
		String s = null;
		try {
		String b = "abc";
		//System.out.println(b.length());
			//System.out.println(s.length());
			
			int c = Integer.parseInt(b);
			
			System.out.println(c);
		//	int d = 3;
		//	System.out.println(c + d);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			
		}  catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			
		} catch (NumberFormatException e) {
			//e.printStackTrace();
			//System.out.println(e.toString());
			//System.out.println("number format excpeiton");
			System.out.println(e.getMessage());
		}  catch (Exception e) {
			//e.printStackTrace();
			System.out.println("error happened");
			
		}
		
		}
		
	}

