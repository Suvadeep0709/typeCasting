
public class MyClass {

	public static void main(String[] args) {
		//implicit conversion 
		System.out.println("Implicit type casting");
		char a ='A';
		System.out.println("value of a:"+a);
		int b=a;
		System.out.println("Value of b:"+a);
		float c=a;
		System.out.println("Value of c:"+a);
		long d=a;
		System.out.println("Value of d: "+d);
		
		double e=a;
		System.out.println("Value of e: "+e);
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		

	}

}
