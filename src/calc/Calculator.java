package calc;

public class Calculator {
	
	int r;
	
	public int add(int a, int b){
		int s;
		s=a+b;
		return s;
	}
	
	
	public int subtract(int a, int b){
		int s ;
		s=a-b;
		return s;
		
	}
	
	public int divide(int a, int b){
		int d = a/b; 
		return d;
	}
	
	public int multiply(int a, int b){
		int m = a*b;
		return m;
	}
	
	public int mod(int a, int b){
		int m = a % b;
		return m;	
	}
}
