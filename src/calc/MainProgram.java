package calc;

public class MainProgram {

	public static void main(String[] args) {
		
		
		Calculator c= new Calculator(); 
		
		int res1 = c.add(10, 20);
		System.out.println("Adding numbers:"+ res1 );
		
		int res2= c.add(40,50);
		System.out.println("Adding numbers:"+ res2 );
		
		int res3 = c.add(50,30);
		System.out.println("Adding numbers:"+ res3 );
		
		
		int sub1 = c.subtract(10, 5);
		System.out.println("Sub 1 = " + sub1);
		
		int sub2 = c.subtract(10, 20);
		System.out.println("Sub 2= "+ sub2);
		
		
		//int div1 = c.divide(10, 0);
		//System.out.println("Div =" + div1);
		
		
		//Doing a multiplication
		int mult1 =  c.multiply(10, 1);
		System.out.println("Mult = "+ mult1);
		
		int r = c.mod(10, 3);
		System.out.println("Remainder ="+ r);

	}

}
